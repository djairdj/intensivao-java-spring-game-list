package com.djinfo.services;

import com.djinfo.dto.GameMinDTO;
import com.djinfo.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {
  @Autowired
  private GameRepository gameRepository;
  public List<GameMinDTO> findAll(){
    return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
  }
  public GameMinDTO find(Long id){
    var result = gameRepository.findById(id);
    return result.map(GameMinDTO::new).orElse(null);
  }
}
