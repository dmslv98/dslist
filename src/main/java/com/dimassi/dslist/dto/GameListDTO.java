package com.dimassi.dslist.dto;




import com.dimassi.dslist.entities.GameList;

public class GameListDTO {
	
	private Long id;
	private String name;
	
	//contructor sem parâmetros
	public GameListDTO() {		
	}
	
	
		
	//contructor com parâmetros  - customizado manualmente
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();		  		
	}



	public Long getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	
}
