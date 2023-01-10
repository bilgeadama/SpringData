package entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "language")
@Data
@NoArgsConstructor
@Table(name = "language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "languageName",length = 30)
    private String languageName;

    @OneToOne(mappedBy = "language")
    private Book book;

    public Language(String languageName) {
        this.languageName = languageName;
    }
}
