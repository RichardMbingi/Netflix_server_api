package com.netflix.server_api.repositories;

import com.netflix.server_api.model.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepository extends JpaRepository<Type, Long> {
}
