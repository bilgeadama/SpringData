package entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "address")
@Data
@NoArgsConstructor
@Table(name = "address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "street",length = 100,nullable = false)
    private String street;

    @Column(name = "zipcode")
    private int zipcode;

    @OneToOne(mappedBy = "address")
    private Author author;

    public Address(String street, int zipcode) {
        this.street = street;
        this.zipcode = zipcode;
    }
}
