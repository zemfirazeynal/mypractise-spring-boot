package az.mypractisesecond.mypractisespringboot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity

public class MyUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String surname;
}
