package com.ncwarrriors.playerinfo.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.ncwarrriors.playerinfo.entity.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>{

	public List<Player> findAllByOrderByLastNameAsc();
	
	public List<Player> findByTeam(String theTeam);
	
}
