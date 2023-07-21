package az.mypractisesecond.mypractisespringboot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "MYUSER")

public class MyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;
}
