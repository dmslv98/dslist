package com.dimassi.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dimassi.dslist.entities.Game;
import com.dimassi.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
