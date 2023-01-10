package repository;


import entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long> {
    Set<Author> findByAgeGreaterThan(int age);
    Set<Author> findByNameLike(String name);
}
