package com.ncwarrriors.playerinfo.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ncwarrriors.playerinfo.entity.Player;
import com.ncwarrriors.playerinfo.service.PlayerService;


@Controller
@RequestMapping("/players")
public class PlayerController {

private PlayerService playerService;
	
	public PlayerController(PlayerService theplayerService) {
		playerService = theplayerService;
	}
	
	@GetMapping("/list")
	public String listPlayers(Model theModel) {				
		// get Players from db
		List<Player> thePlayers = playerService.findAll();		
		// add to the spring model
		theModel.addAttribute("players", thePlayers);		
		return "players/playerinfo";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {		
		// create model attribute to bind form data
		Player thePlayer = new Player();		
		theModel.addAttribute("players", thePlayer);		
		return "players/new-player-form";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("playerId") int theId, Model theModel) {
		// get the Player from the service
		Player thePlayer = playerService.findById(theId);
		
		// set the Player as a model attribute to pre-populate the form
		theModel.addAttribute("players", thePlayer);
		
		// send over to our form
		return "players/player-form";
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("playerId") int theId) {
		// delete the Player
		playerService.deleteById(theId);

		// redirect to /Players/list
		return "redirect:/players/list";
	}
	
	//Form data is passed in the method, form data binding occurs
	@PostMapping("/save")
	public String savePlayer(@ModelAttribute("player") Player thePlayer) {		
		//save the Player, controller -> service -> repo -> db
		playerService.save(thePlayer);		
		// use a redirect to prevent duplicate submissions
		return "redirect:/players/list";
	}
}
