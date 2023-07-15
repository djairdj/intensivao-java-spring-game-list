package com.djinfo.entities;

public class GameList {
  private Long id;
  private String name;

  public GameList() {}

  public GameList(Long id, String name) {this.id = id; this.name = name;}

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof GameList gameList)) return false;
    return getId().equals(gameList.getId());
  }

  @Override
  public int hashCode() {
    return getId().hashCode();
  }
}
