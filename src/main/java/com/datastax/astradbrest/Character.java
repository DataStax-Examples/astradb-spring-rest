package com.datastax.astradbrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Character {

  private Long id;
  private String name;
  private Boolean royal;

  public Character() {}

  public Long getId() {
    return this.id;
  }

  public String getName() {
    return this.name;
  }

  public Boolean getRoyal() {
    return this.royal;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setRoyal(Boolean royal) {
    this.royal = royal;
  }

  @Override
  public String toString() {
    return (
      "Character{" + "id=" + id + ", name=" + name + ", royal=" + royal + "}"
    );
  }
}
