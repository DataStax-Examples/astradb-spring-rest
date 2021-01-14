package com.datastax.astradbrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.ArrayList;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Characters {

  private String type;
  private List<Character> data;

  public Characters() {
    this.data = new ArrayList<>();
  }

  public List<Character> getData() {
    return data;
  }

  public void setValue(List<Character> data) {
    this.data = data;
  }

  @Override
  public String toString() {
    return "Characters{data=" + data + "}";
  }
}
