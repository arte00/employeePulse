package com.example.springboot.repository;

import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Repository
public class LoginRepository {

    public String getUser(String email, String password){
        return "test";
    }

}
