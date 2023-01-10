package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity(name = "category")
@Data
@Table(name = "category")
@NoArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "category_name",length = 50)
    private String category_name;

    @OneToMany(mappedBy = "category")
    private Set<Book> book;

    public Category(String category_name) {
        this.category_name = category_name;
    }
}
