package com.dimassi.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dimassi.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
