package com.dimassi.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.dimassi.dslist.entities.Game;

import ch.qos.logback.core.joran.util.beans.BeanUtil;

public class GameDTO {    				//IMPORTANTE - Mesmos tendo os  campos do Game.java, é importante criar o GameDTO para evitar loop, em casos de dependências no Game.java
	
	private Long id;	
	private String title;	
	private Integer year;	
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;		
	private String shortDescription;		
	private String longDescription;
	
	
	//contructor sem parâmetros
	public GameDTO() {
	}
	
	//contructor com parâmetros  - customizado manualmente
	public GameDTO(Game entity) {
		//this.id = entity.getId();  //Podeira fazer todos os campos dessa forma. Para muitos campos, melhor usar a classe utilitária BeanUtils, conforme abaixo.		
		BeanUtils.copyProperties(entity, this);    //copia atributos dos objetos na entidade para os objetos dto.  (IMPORTANTE que o nome dos campos sejam os mesmos)  		
	}
	
	
	//usando a classe auxiliar acima, precisa gerar de gets e sets  ( em geral, para o DTO não precisa dos sets - nesse caso precisa)

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	 
	
	

}
