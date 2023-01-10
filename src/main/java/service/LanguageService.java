package service;

import entity.Book;
import entity.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.LanguageRepository;

import java.util.Optional;
@Service
public class LanguageService {
    @Autowired
    private final LanguageRepository languageRepository;
    @Autowired
    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    public void addLanguage(){

    }
    public void findById(long id){
        languageRepository.findById(id);
    }
    public void deleteLanguage(long id){
        Optional<Language> deleteItem=languageRepository.findById(id);
        languageRepository.delete(deleteItem.orElse(new Language()));
    }



}
