package com.netflix.server_api.services;

import com.netflix.server_api.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {

    List<User> findAll();

    Optional<User> findById(Long id);

    User createUser(User user);

    User update(User user);

    User findByIdNumber(Integer id);

}