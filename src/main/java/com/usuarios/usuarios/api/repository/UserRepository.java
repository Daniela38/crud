package com.usuarios.usuarios.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.usuarios.usuarios.api.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
