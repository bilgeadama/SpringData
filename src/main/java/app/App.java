package app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import service.*;

@SpringBootApplication
@ComponentScan(basePackages = {"repository", "service", "entity"})
@EnableJpaRepositories(basePackages = "repository")
@EnableAutoConfiguration
@EntityScan(basePackages = {"entity"})
public class App {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(App.class, args);

        AuthorService authorService=applicationContext.getBean(AuthorService.class);
        authorService.addAuthor();

        AddressService addressService=applicationContext.getBean(AddressService.class);
        addressService.addAddress();

        LanguageService languageService=applicationContext.getBean(LanguageService.class);
        languageService.addLanguage();

        PublisherService publisherService=applicationContext.getBean(PublisherService.class);
        publisherService.addPublisher();

        CategoryService categoryService=applicationContext.getBean(CategoryService.class);
        categoryService.addCategory();

        BookService bookService=applicationContext.getBean(BookService.class);
        bookService.addBook();



    }


}
