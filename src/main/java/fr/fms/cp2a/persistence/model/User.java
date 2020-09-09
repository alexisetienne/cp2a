package fr.fms.cp2a.persistence.model;


import lombok.*;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString()
// JPA
@Entity
@Table(name = "USER")
public class User {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ROLE")
    private String role;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user", targetEntity = Tender.class)
    private Set<Tender> tenders = new HashSet<>();
}
