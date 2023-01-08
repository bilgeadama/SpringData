package service;

import org.springframework.stereotype.Service;
import repository.PublisherRepository;

@Service
public class PublisherService {
    private final PublisherRepository publisherRepository;

    public PublisherService(PublisherRepository publisherRepository) {
        this.publisherRepository = publisherRepository;
    }
}
