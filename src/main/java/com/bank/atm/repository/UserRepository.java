package com.bank.atm.repository;

import com.bank.atm.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository {
    User save(User user);

    Optional<User> findById(UUID userId);

    List<User> findAll();
}
