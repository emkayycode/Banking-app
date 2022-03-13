package com.cwg_academy.banking.io.entity;
import lombok.Data;

import javax.persistence.*;
@Entity(name = "user")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String password;

    @Column
    private String username;

    @Column
    private String accountNumber;

    @Column
    private String phoneNumber;

    @Column
    private String email;

    @Column
    private String dob;
}
