package com.language.language.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.language.language.model.Language;

@Repository
public interface LanguageRepository extends JpaRepository<Language,Integer> {

    
}