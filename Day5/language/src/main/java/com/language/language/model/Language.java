package com.language.language.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Language {
    @Id
    private int languageId;
    private String languageName;
    private String complexity;

    public Language() {
        
    }

    public int getLanguageId() {
        return languageId;
    }

    public void setLanguageId(int languageId) {
        this.languageId = languageId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public String getComplexity() {
        return complexity;
    }

    public void setComplexity(String complexity) {
        this.complexity = complexity;
    }

    
}
