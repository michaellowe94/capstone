package org.lowe.michael.service;

import org.lowe.michael.UserRegistrationDto;
import org.lowe.michael.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
   User findByEmail(String email);
   User save(UserRegistrationDto registration);
}
