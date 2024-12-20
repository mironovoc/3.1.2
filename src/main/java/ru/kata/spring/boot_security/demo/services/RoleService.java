package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.Role;

import java.util.List;

public interface RoleService {
    Role findRoleById(Long id);
    List<Role> getAllRoles();
    Role saveRole(Role role);
    void deleteRoleById(Long id);
}