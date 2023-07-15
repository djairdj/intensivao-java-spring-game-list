package com.djinfo.controllers;

import com.djinfo.dto.GameListDTO;
import com.djinfo.dto.GameMinDTO;
import com.djinfo.services.GameListService;
import com.djinfo.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
  private final GameListService gameListService;
  private final GameService gameService;

  public GameListController(GameListService gameListService, GameService gameService) {this.gameListService = gameListService;
    this.gameService = gameService;
  }

  @GetMapping()
  public List<GameListDTO> findAll(){
    return gameListService.findAll();
  }
  @GetMapping(value = "/{listId}/games")
  public List<GameMinDTO> findByList(@PathVariable (value = "listId") Long listId){
      List<GameMinDTO> list = gameService.findByList(listId);
      return list;
  }
}
