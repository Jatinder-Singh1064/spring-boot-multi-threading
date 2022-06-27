package com.learn.executor.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.learn.executor.api.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
