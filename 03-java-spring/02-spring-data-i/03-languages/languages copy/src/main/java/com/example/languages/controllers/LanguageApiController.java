package com.example.languages.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.languages.models.Language;
import com.example.languages.services.LanguageService;

@RestController
@RequestMapping("/api")
//^ allows you to add a prefix to the routes. now all routes listed below will start with /api/
public class LanguageApiController {
	private LanguageService lService;
	
	public LanguageApiController(LanguageService service) {
		this.lService = service;
	}
	
	//Routes
	@RequestMapping("")
	//^ you need to change the route from the root when you are making this an api
	public List<Language> index() {
		return this.lService.getAllLanguages();
	}
	
	@RequestMapping("{id}")
	public Language getLanguage(@PathVariable("id") Long id) {
		return this.lService.getOneLanguage(id);
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public Language create(Language newLanguage) {
		return this.lService.createLanguage(newLanguage);
	}
}
