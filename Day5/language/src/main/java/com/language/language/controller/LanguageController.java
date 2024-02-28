package com.language.language.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.language.language.model.Language;
import com.language.language.service.LanguageService;

@RestController
@RequestMapping("/language")
public class LanguageController {

    private final LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @PostMapping
    public ResponseEntity<Language> createLanguage(@RequestBody Language language) 
    {
        Language createdLanguage = languageService.createLanguage(language);
        return new ResponseEntity<>(createdLanguage, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Language>> getAllLanguages() {
        List<Language> languages = languageService.getAllLanguages();
        return new ResponseEntity<>(languages, HttpStatus.OK);
    }

    @GetMapping("/{languageId}")
    public ResponseEntity<Language> getLanguageById(@PathVariable int languageId) {
        Language language = languageService.getLanguageById(languageId);
        if (language != null) {
            return new ResponseEntity<>(language, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/{languageId}")
    public ResponseEntity<Language> updateLanguage(@PathVariable int languageId, @RequestBody Language language) 
    {
        Language updatedLanguage = languageService.updateLanguage(language);
        if (updatedLanguage != null) 
        {
            return new ResponseEntity<>(updatedLanguage, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{languageId}")
    public void deletelanguage(@PathVariable int languageId)
    {
        languageService.delete(languageId);
    }
    
}