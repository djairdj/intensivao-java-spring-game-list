package com.djinfo.dto;

import com.djinfo.entities.Game;
import com.djinfo.projections.GameMinProjection;

public class GameMinDTO {
  private Long id;
  private String title;
  private Integer year;
  private String imgUrl;
  private String shortDescription;

  public GameMinDTO() {}
  public GameMinDTO(Game gameEntity){
    this.id = gameEntity.getId();
    this.title = gameEntity.getTitle();
    this.year= gameEntity.getYear();
    this.imgUrl = gameEntity.getImgUrl();
    this.shortDescription = gameEntity.getShortDescription();
  }
  public GameMinDTO(GameMinProjection gameMinProjectionEntity){
    this.id = gameMinProjectionEntity.getId();
    this.title = gameMinProjectionEntity.getTitle();
    this.year= gameMinProjectionEntity.getYear();
    this.imgUrl = gameMinProjectionEntity.getImgUrl();
    this.shortDescription = gameMinProjectionEntity.getShortDescription();
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public Integer getYear() {
    return year;
  }

  public String getImgUrl() {
    return imgUrl;
  }

  public String getShortDescription() {
    return shortDescription;
  }
}
