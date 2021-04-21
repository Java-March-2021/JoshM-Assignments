package com.example.languages.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.languages.models.Language;
import com.example.languages.services.LanguageService;

@Controller
@RequestMapping("/languages")
public class HomeController {
	@Autowired
	private LanguageService lService;

	@GetMapping("")
	public String index(Model viewModel) {
		List<Language> languages= this.lService.getAllLanguages();
		viewModel.addAttribute("allLanguages", languages);
		return "index.jsp";
	}
	@GetMapping("/add")
	public String add(@ModelAttribute("language") Language language) {
		return "index.jsp";
	}
	@PostMapping("/addLanguage")
	public String addLanguage(@Valid @ModelAttribute("language") Language language, BindingResult result) {
		if(result.hasErrors()) {
			return "add-language";
		}else {
			this.lService.createLanguage(language);
			return "redirect:/";
		}
	}
	@GetMapping("{id}")
	public String show(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("language", this.lService.getOneLanguage(id));
		return "show.jsp";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		this.lService.deleteLanguage(id);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(@ModelAttribute("language") Language language, Model viewModel,@PathVariable("id") Long id) {
		viewModel.addAttribute("language", this.lService.getOneLanguage(id));
		return"edit.jsp";
	}
	@PostMapping("/edit/{id}")
	public String postEdit(@Valid @ModelAttribute("language") Language language, BindingResult result, Model viewModel, @PathVariable("id") Long id) {
		if(result.hasErrors()) {
			viewModel.addAttribute("language", this.lService.getOneLanguage(id));
			return "edit.jsp";
		}
		this.lService.updateLanguage(id, language);
		return "redirect:/";
	}
	
}
