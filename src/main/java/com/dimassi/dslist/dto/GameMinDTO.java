package com.dimassi.dslist.dto;

import com.dimassi.dslist.entities.Game;

public class GameMinDTO {

	private Long id;	
	private String title;		
	private Integer year;		
	private String imgUrl;	
	private String shortDescription;
	
	public GameMinDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*
	public GameMinDTO(Long id, String title, Integer year, String imgUrl, String shortDescription) {
		super();
		this.id = id;
		this.title = title;
		this.year = year;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
	}
	*/
	
	//gerar o constructor DTO copiando os dados Entidade
	
	public GameMinDTO(Game entity) {		
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	
	
	
	//gerar gets - no DTO, só precisa dos gets

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
