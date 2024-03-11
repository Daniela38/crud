package com.usuarios.usuarios.api.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usuarios.usuarios.api.models.User;
import com.usuarios.usuarios.api.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    UserRepository userReposiory;

    public List<User> getUsers() {
        return userReposiory.findAll();
    }

    public void addUser(User user) {
        userReposiory.save(user);
    }

    public User getUserById(Long id) {
        return userReposiory.findById(id).orElse(null);
    }

    public void deleteUserById(Long id) {
        userReposiory.deleteById(id);
    }

    public User updateUser(User user) {
        userReposiory.save(user);
        return userReposiory.findById(user.getId()).orElse(null);
    }

}
