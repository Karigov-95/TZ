package com.example.eurekaclient.repository;

import com.example.eurekaclient.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
