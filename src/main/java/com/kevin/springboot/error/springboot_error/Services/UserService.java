package com.kevin.springboot.error.springboot_error.Services;


import com.kevin.springboot.error.springboot_error.models.domain.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
}
