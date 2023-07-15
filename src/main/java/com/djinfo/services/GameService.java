package com.djinfo.services;

import com.djinfo.dto.GameDTO;
import com.djinfo.dto.GameMinDTO;
import com.djinfo.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
  @Autowired
  private GameRepository gameRepository;
  @Transactional(readOnly = true)
  public GameDTO findById(Long id){
    var result = gameRepository.findById(id);
    return result.map(GameDTO::new).orElse(null);
  }
  @Transactional(readOnly = true)
  public List<GameMinDTO> findAll(){
    return gameRepository.findAll().stream().map(GameMinDTO::new).toList();
  }
}
