package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {
    User findByUsername(String username);
    List<User> allUsers();
    void addUser(User user, List<Long> roleIds);
    void updateUser(User user, List<Long> roleIds);
    void deleteUser(User user);
    User findUserById(Long id);
}