package com.dimassi.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

		
	//private Game game;			//Primary Key	game_id
	//private GameList gamelist		//Primary Key	gamelist_id
	
	//Criou-se a classe auxiliar BelongingPK para compor as chaves Primary Key acima
	
	@EmbeddedId					//mapeado na classe auxiliar BelongingPK
	private BelongingPK id = new BelongingPK();   	
	
	private Integer position;

	
	public Belonging() {
		super();
		// TODO Auto-generated constructor stub
	}


	/*
	public Belonging(BelongingPK id, Integer position) {
		super();
		this.id = id;
		this.position = position;
	}
	*/
	
	//O Constructor acima foi ajustado manualmente, conforme abaixo
	public Belonging(Game game, GameList list, Integer position) {		
		id.setGame(game);
		id.setList(list);
		this.position = position;
	}


	public BelongingPK getId() {
		return id;
	}


	public void setId(BelongingPK id) {
		this.id = id;
	}


	public Integer getPosition() {
		return position;
	}


	public void setPosition(Integer position) {
		this.position = position;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
}
