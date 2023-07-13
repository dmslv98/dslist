package com.dimassi.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dimassi.dslist.dto.GameDTO;
import com.dimassi.dslist.dto.GameMinDTO;
import com.dimassi.dslist.services.GameService;


@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	/*  //---  
	@GetMapping
	public List<Game> findAll(){				
		List<Game> result = gameService.findAll();			//retorna toda lista de game
		return result;		
	}
	*/
	
	@GetMapping
	public List<GameMinDTO> findAll(){			
		List<GameMinDTO> result = gameService.findAll();   //retorna a lista DTO de game
		return result;		
	}
	
	
	@GetMapping(value = "/{id}")
	public GameDTO findAllById(@PathVariable  Long id){			
		GameDTO result = gameService.findById(id);		//retorna o objeto do id informado
		return result;		
	}
		
	
	
	
}
