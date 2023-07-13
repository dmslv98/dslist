package com.dimassi.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dimassi.dslist.dto.GameMinDTO;
import com.dimassi.dslist.services.GameService;


@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	/*  //---  
	@GetMapping
	public List<Game> findAll(){				//retorna toda lista de game
		List<Game> result = gameService.findAll();
		return result;		
	}
	*/
	
	@GetMapping
	public List<GameMinDTO> findAll(){			//retorna a lista DTO de game
		List<GameMinDTO> result = gameService.findAll();
		return result;		
	}
}
