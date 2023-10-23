package com.github.blackadm.security.authentication;

import com.github.blackadm.security.modules.user.entities.User;
import com.github.blackadm.security.modules.user.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User existsUser = userRepository.findByUsername(username);

        if (existsUser != null) {
            throw new Error("Usuário já existe no sistema!");
        }
        return UserPrincipal.create(existsUser);
    }
}
