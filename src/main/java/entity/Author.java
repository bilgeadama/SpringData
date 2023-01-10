package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity(name = "author")
@Data
@NoArgsConstructor
@Table(name = "author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", length = 100, unique = false)
    private String name;

    @Column(name = "age")
    private int age;

    @OneToMany(mappedBy = "author")
    private Set<Book> book;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
