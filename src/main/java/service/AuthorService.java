package service;

import entity.Address;
import entity.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AuthorRepository;

import java.util.Optional;
import java.util.Set;

@Service
public class AuthorService {
    @Autowired
    private final AuthorRepository authorRepository;
    @Autowired
    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void addAuthor(){

    }

    public  void deleteAuthor(long id){
        Optional<Author> deleteItem=authorRepository.findById(id);
        authorRepository.delete(deleteItem.orElse(new Author()));
    }
    public void findAddress(long id){
        authorRepository.findById(id);
    }
    public void findByAge(int age){
        authorRepository.findByAgeGreaterThan(age);
    }
    public void findByNameLike(String name){
        authorRepository.findByNameLike(name);
    }

}
