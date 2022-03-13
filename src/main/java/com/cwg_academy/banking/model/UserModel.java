package com.cwg_academy.banking.model;

import lombok.Data;

import javax.persistence.Column;
@Data
public class  UserModel {
    private String firstName;
    private String lastName;
    private String password;
    private String username;
    private String accountNumber;
    private String phoneNumber;
    private String email;
    private String dob;
}
