package repository;

import entity.Book;
import entity.Category;
import entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {

}
