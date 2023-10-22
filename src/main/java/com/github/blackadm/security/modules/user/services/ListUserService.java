package com.github.blackadm.security.modules.user.services;

import com.github.blackadm.security.modules.user.repositories.UserRepository;
import com.github.blackadm.security.modules.user.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListUserService {

    @Autowired
    UserRepository userRepository;

    public List<User> listAll() {
        return userRepository.findAll();
    }
}