package com.ncwarrriors.playerinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/player")
public class PlayerController {

	
	@GetMapping("/playerinfo")
	public String getTeamInfo() {
		return "player/playerinfo";
	}
}
