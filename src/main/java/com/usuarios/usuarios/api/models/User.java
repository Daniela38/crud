package com.usuarios.usuarios.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
public class User {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String dateOfBirth;
    private String currentCity;

    public User(String name, String dateOfBirth, String currentCity) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.currentCity = currentCity;
    }

}
