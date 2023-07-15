package com.djinfo.controllers;

import com.djinfo.dto.GameDTO;
import com.djinfo.dto.GameMinDTO;
import com.djinfo.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
  private final GameService gameService;

  public GameController(GameService gameService) {    this.gameService = gameService;  }
  @GetMapping(value = "/{id}")
  public GameDTO findById(@PathVariable(value = "id") Long id){
    return gameService.findById(id);
  }
  @GetMapping
  public List<GameMinDTO> getGames(){
    return gameService.findAll();
  }
}
