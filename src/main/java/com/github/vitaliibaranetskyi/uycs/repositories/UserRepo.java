package com.github.vitaliibaranetskyi.uycs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.github.vitaliibaranetskyi.uycs.models.User;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByUsername(String username);
}