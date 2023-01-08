package service;

import entity.Address;
import entity.Author;
import entity.Book;
import org.springframework.stereotype.Service;
import repository.AuthorRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorService(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    public void addAuthor() {
        Author author = new Author();
        author.setAge(33);
        author.setName("Alex");

        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book();
        Book book2 = new Book();
        bookSet.add(book1);
        bookSet.add(book2);


        author.setBook(bookSet);
        Address address = new Address();
        address.setStreet("Bagcilar");
        author.setAddress(address);
        authorRepository.save(author);
    }

    public void findByAgeLessThan(int age) {
        authorRepository.findByAgeLessThan(age);

    }

    public void findByNameLike(String name) {
        authorRepository.findByNameLike(name);
    }

    public void findById(Long id) {
        authorRepository.findById(id);
    }
}
