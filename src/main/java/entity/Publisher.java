package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Entity(name = "publisher")
@Data
@NoArgsConstructor
@Table(name = "publisher")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "publisherName")
    public String publisherName;

    @OneToMany(mappedBy = "publisher")
    private Set<Book> book;

    public Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}
