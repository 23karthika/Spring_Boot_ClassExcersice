package com.language.language.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.language.language.model.Language;
import com.language.language.repository.LanguageRepository;

@Service
public class LanguageService {

    private final LanguageRepository languageRepository;

    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    public Language createLanguage(Language language) {
        return languageRepository.save(language);
    }

    public List<Language> getAllLanguages() {
        return  languageRepository.findAll();
    }

    public Language getLanguageById(int languageId) {
        return languageRepository.findById(languageId).orElse(null);
    }
    
    public Language updateLanguage(Language language) {
        return languageRepository.save(language);
    }


    public void delete(int languageId)
    {
        languageRepository.deleteById(languageId);
    }
}