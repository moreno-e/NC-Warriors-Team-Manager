package com.ncwarrriors.playerinfo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ncwarrriors.playerinfo.dao.PlayerRepository;
import com.ncwarrriors.playerinfo.entity.Player;

@Service
public class PlayerServiceImpl implements PlayerService {

	private PlayerRepository playerRepository;	
	
	@Autowired
	public PlayerServiceImpl(PlayerRepository thePlayerRepository) {
		playerRepository = thePlayerRepository;
	}

	@Override
	public List<Player> findAll() {
		// TODO Auto-generated method stub
		return playerRepository.findAllByOrderByLastNameAsc();
	}
	
	public List<Player> findByTeam(String theTeam){
		
		return playerRepository.findByTeam(theTeam);
	}


	public Player findById(int theId) {
		Optional<Player> result = playerRepository.findById(theId);
		
		Player thePlayer = null;
		
		if (result.isPresent()) {
			thePlayer = result.get();
		}
		else {
			// we didn't find the Player
			throw new RuntimeException("Did not find Player id - " + theId);
		}
		
		return thePlayer;
	}

	@Override
	public void save(Player thePlayer) {
		// TODO Auto-generated method stub
		playerRepository.save(thePlayer);
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		playerRepository.deleteById(theId);
	}

}
