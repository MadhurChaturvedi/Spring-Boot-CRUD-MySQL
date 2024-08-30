package com.crud.CRUD;

import jakarta.persistence.*;

// User.java

@Entity
    @Table(name = "users")
    public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        private String email;

        // Getters and setters
    }

