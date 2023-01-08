package service;

import org.springframework.stereotype.Service;
import repository.LanguageRepository;

@Service
public class LanguageService {
    private final LanguageRepository languageRepository;

    public LanguageService(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }
}
