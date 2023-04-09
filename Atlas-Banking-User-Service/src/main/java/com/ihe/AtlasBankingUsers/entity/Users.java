package com.ihe.AtlasBankingUsers.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Users {

    int userId;
    String password;
    String firstName;
    String lastName;
    String phoneNumber;
    String eMail;
    String address;
    double balance;

}
