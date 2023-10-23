package com.github.blackadm.security.modules.user.repositories;

import com.github.blackadm.security.modules.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {
   User findById(String id);

   User findByUsername(String username);

   @Query("SELECT u FROM User u JOIN FETCH u.roles where u.username = :username")
   User findByUsernameFetchRoles(@Param("username") String username);
}
