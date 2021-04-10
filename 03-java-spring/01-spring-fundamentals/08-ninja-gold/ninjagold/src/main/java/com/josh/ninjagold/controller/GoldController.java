package com.josh.ninjagold.controller;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GoldController {
	@GetMapping("/")
	public String gold(HttpSession session) {
		ArrayList<String> activity = new ArrayList<String>();
		if(session.getAttribute("gold") == null) {
			session.setAttribute("gold", 50);
		}
		viewModel.addAttribute("totalGold", session.getAttribute("gold"));
		return "index.jsp";
	}
	
	@PostMapping("/findgold")
	public String findGold(HttpSession session, @RequestParam("building") String building) {
		Random r = new Random();
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd YYYY h:mma");
		ArrayList<String> activity = (ArrayList<String>)session.getAttribute("activity");
		int gold = (int)session.getAttribute("gold");
		int goldThisTurn;
		if (building.equals("farm")) {
			goldThisTurn = r.nextInt((20-10)+ 1) + 10; 
			activity.add(String.format("You entered a %s and earned %d gold %s \n", building, goldThisTurn, ))
		}	else if (building.equals("cave")) {
			goldThisTurn = r.nextInt((10-5)+ 1) + 10;
		}	else if (building.equals("house")) {
			goldThisTurn = r.nextInt((5-2)+ 1) + 10;
		}	else {
			goldThisTurn = r.nextInt((50+50)+ 1) -50;
		}
		int totalGold = gold += goldThisTurn;
		session.setAttribute("gold", totalGold);
		return "redirect:/";
	}
}
