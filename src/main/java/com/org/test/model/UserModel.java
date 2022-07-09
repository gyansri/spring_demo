package com.org.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {

    private Long userID;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String matchingPassword;
}
