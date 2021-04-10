package com.josh.displayDate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class displayController {
	Date date = new Date();
	
	@RequestMapping("/")
	public String index(Model model) {
		Date date = new Date();
		model.addAttribute("date", date);
		return "index.jsp";
	}
	@RequestMapping("/{var}")
	public String dateAndTime(@PathVariable("var")String day, Model model) {
		Date date = new Date();
		
		if(day.equals("date")) {
			model.addAttribute("date", date);
			SimpleDateFormat sm = new SimpleDateFormat("EEEE,' the' dd 'of' MMMM, YYYY");
			model.addAttribute("dateFormat",sm.format(date));
			return "date.jsp";
		
		}else {
			SimpleDateFormat sm = new SimpleDateFormat("h:mm a");
			model.addAttribute("time",date);
			model.addAttribute("timeFormat",sm.format(date));
			return "time.jsp";
		}
		
	}
}
