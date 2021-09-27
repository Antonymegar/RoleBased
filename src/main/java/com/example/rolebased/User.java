package com.example.rolebased;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

    private Integer id;
    private String username;
    private String email;
    private String  password;
    private boolean enabled;


}
