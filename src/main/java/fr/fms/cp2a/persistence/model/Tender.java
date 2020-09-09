package fr.fms.cp2a.persistence.model;


import lombok.*;
import javax.persistence.*;
import java.util.Date;
import java.util.SortedSet;
import java.util.TreeSet;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString()
// JPA
@Entity
@Table(name = "TENDER")
public class Tender {
    @Id @GeneratedValue
    private Long id;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "FINAL_DATE")
    private Date finalDate;

    @ManyToOne(targetEntity = User.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", insertable = false, updatable = false)
    @EqualsAndHashCode.Exclude
    private User user;
}
