package com.dimassi.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dimassi.dslist.dto.GameDTO;
import com.dimassi.dslist.dto.GameListDTO;
import com.dimassi.dslist.dto.GameMinDTO;
import com.dimassi.dslist.entities.Game;
import com.dimassi.dslist.entities.GameList;
import com.dimassi.dslist.repository.GameListRepository;
import com.dimassi.dslist.repository.GameRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;	
	
	
	@Transactional(readOnly = true )     
	public List<GameListDTO> findAll(){			
		List<GameList> result = gameListRepository.findAll();
		//List<GameListDTO> dto = result.stream().map(x -> new GameListDTO(x)).toList();
		//return dto;
		
		//pode resumir as duas linhas acima na linha abaixo..		
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	
	

}
