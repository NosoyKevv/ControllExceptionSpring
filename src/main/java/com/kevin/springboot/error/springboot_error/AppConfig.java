package com.kevin.springboot.error.springboot_error;

import com.kevin.springboot.error.springboot_error.models.domain.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class AppConfig {

    @Bean
    public List<User> users() {
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "John", "Doe"));
        users.add(new User(2L, "Pepe", "Paez"));
        users.add(new User(3L, "Jane", "Dawis"));
        users.add(new User(4L, "Johnas", "Polt"));
        return users;
    }
}
