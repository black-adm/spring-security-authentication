package com.github.blackadm.security.modules.user.controllers;

import com.github.blackadm.security.modules.user.dto.CreateUserRoleDto;
import com.github.blackadm.security.modules.user.entities.User;
import com.github.blackadm.security.modules.user.repositories.UserRepository;
import com.github.blackadm.security.modules.user.services.CreateRoleUserService;
import com.github.blackadm.security.modules.user.services.CreateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    CreateUserService createUserService;

    @Autowired
    CreateRoleUserService createRoleUserService;

    @GetMapping
    public List<User> listAll() {
        return userRepository.findAll();
    }

    @PostMapping("/signUp")
    public User create(@RequestBody User user) {
        return createUserService.execute(user);
    }

    @PostMapping("/role")
    public User role(@RequestBody CreateUserRoleDto createUserRoleDto) {
        return createRoleUserService.execute(createUserRoleDto);
    }
}
