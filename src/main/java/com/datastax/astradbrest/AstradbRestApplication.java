package com.datastax.astradbrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AstradbRestApplication {

  @Autowired
  private Environment env;

  private static final Logger log = LoggerFactory.getLogger(
    AstradbRestApplication.class
  );

  public static void main(String[] args) {
    SpringApplication.run(AstradbRestApplication.class, args);
  }

  @Bean
  public RestTemplate restTemplate(RestTemplateBuilder builder) {
    return builder.build();
  }

  @Bean
  public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
    HttpHeaders headers = new HttpHeaders();
    headers.set("x-cassandra-token", env.getProperty("AUTH_TOKEN"));

    HttpEntity<String> httpEntity = new HttpEntity<String>(headers);

    return args -> {
      ResponseEntity<Characters> characters = restTemplate.exchange(
        "https://" +
        env.getProperty("ASTRA_DB_ID") +
        "-" +
        env.getProperty("ASTRA_DB_REGION") +
        ".apps.astra.datastax.com/api/rest/v2/keyspaces/" +
        env.getProperty("ASTRA_DB_KEYSPACE") +
        "/spring_rest_characters?where={}",
        HttpMethod.GET,
        httpEntity,
        Characters.class
      );
      log.info(characters.toString());
    };
  }
}
