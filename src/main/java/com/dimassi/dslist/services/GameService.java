package com.dimassi.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dimassi.dslist.dto.GameDTO;
import com.dimassi.dslist.dto.GameMinDTO;
import com.dimassi.dslist.entities.Game;
import com.dimassi.dslist.repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	/*
	public List<Game> findAll(){     //retorna toda lista de game
		//var result = gameRepository.findAll();        //a linha abaixo é outra forma de fazer a mesma configuração
		List<Game> result = gameRepository.findAll();
		return result;		
	}
	*/
	
	public List<GameMinDTO> findAll(){	//retorna a lista DTO de game
		//var result = gameRepository.findAll();        //a linha abaixo é outra forma de fazer a mesma configuração
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;		
	}
	
	@Transactional(readOnly = true )     //OPTIONAL mas importante para obedecer os principios das transações (ACID) - VERIFICAR 
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();				//recebe um id e retorna o objeto desse id
		GameDTO dto = new GameDTO(result);
		return dto;
	}
	

}
