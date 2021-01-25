package com.ncwarrriors.playerinfo.service;

import java.util.List;
import com.ncwarrriors.playerinfo.entity.Player;

public interface PlayerService {

	public List<Player> findAll();
	
	public List<Player> findByTeam(String theTeam);
	
	public Player findById(int theId);
	
	public void save(Player thePlayer);
	
	public void deleteById(int theId);
}
