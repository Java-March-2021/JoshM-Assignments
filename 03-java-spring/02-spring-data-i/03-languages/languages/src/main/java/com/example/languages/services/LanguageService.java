package com.example.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.languages.models.Language;
import com.example.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	private LanguageRepository lRepo;
	
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;
	}
	//lang with id
	public Language getOneLanguage(Long id) {
		return this.lRepo.findById(id).orElse(null);
	}
	//create
	public Language createLanguage(Language newLanguage) {
		return this.lRepo.save(newLanguage);
	}
	//return all langs
	public List<Language> getAllLanguages() {
		return lRepo.findAll();
	}
	//retreive lang
	public Language findLanguage(Long id) {
		Optional<Language> optionalLanguage = lRepo.findById(id);
		if(optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		} else {
			return null;
		}
	}
	//update/edit lang
	public Language updateLanguage(Long id, Language updatedLanguage) {
		return this.lRepo.save(updatedLanguage);
	}
	//delete lang
	public void deleteLanguage(Long id) {
		this.lRepo.deleteById(id);
	}
}
