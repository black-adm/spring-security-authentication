package com.github.blackadm.security.modules.user.repositories;

import com.github.blackadm.security.modules.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

   User findById(String id);
}
