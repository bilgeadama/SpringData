package service;

import entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.*;

import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final AddressRepository addressRepository;

    @Autowired
    public BookService(BookRepository bookRepository,
                       AddressRepository addressRepository
    ) {
        this.bookRepository = bookRepository;
        this.addressRepository = addressRepository;
    }

    public void addBook(){
        Language language=new Language("Spanish");
        Author author=new Author("Alex",62);
        Address ad=new Address("Kamycka",15000);
        author.setAddress(ad);
        Category category=new Category("classic");
        Publisher publisher=new Publisher("ABC");
        Book book=new Book("Book1",377,language,author,category,publisher);
        bookRepository.save(book);
    }
    public void findBook(Long id){
        bookRepository.findById(id);
    }

    public void deleteBook(Long id){
        Optional<Book> deleteItem=bookRepository.findById(id);
        bookRepository.delete(deleteItem.orElse(new Book("book1",377,new Language(),new Author(),new Category(),new Publisher())));
    }
    public void findByNameLike(String name){
       bookRepository.findByNameLike(name);
    }


}
