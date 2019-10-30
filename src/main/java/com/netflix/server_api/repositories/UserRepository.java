package com.netflix.server_api.repositories;

import com.netflix.server_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByIdNumber(Integer idNumber);
}
