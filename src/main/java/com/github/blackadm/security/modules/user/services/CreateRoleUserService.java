package com.github.blackadm.security.modules.user.services;

import com.github.blackadm.security.modules.user.dto.CreateUserRoleDto;
import com.github.blackadm.security.modules.user.entities.Role;
import com.github.blackadm.security.modules.user.entities.User;
import com.github.blackadm.security.modules.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CreateRoleUserService {

    @Autowired
    UserRepository userRepository;

    public User execute(CreateUserRoleDto createUserRoleDto) {

        Optional<User> userExists = userRepository.findById(createUserRoleDto.getUserId());
        List<Role> roles;

        if (userExists.isEmpty()) {
            throw new Error("Esse usuário não existe!");
        }

        roles = createUserRoleDto.getRolesId().stream().map(Role::new).collect(Collectors.toList());

        User user = userExists.get();
        user.setRoles(roles);
        return userRepository.save(user);
    }
}
