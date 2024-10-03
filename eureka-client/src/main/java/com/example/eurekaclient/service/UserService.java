package com.example.eurekaclient.service;

import com.example.eurekaclient.model.User;

import java.util.List;

public interface UserService {

    void create(User user);

    User findById(Long id);

    List<User> findAll();

    void update(User user);

    void delete(Long id);
}
