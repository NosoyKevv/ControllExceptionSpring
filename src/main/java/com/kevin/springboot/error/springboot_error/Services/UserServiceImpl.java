package com.kevin.springboot.error.springboot_error.Services;

import com.kevin.springboot.error.springboot_error.models.domain.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<>();
        users.add(new User(1L, "John", "Doe"));
        users.add(new User(2L, "Pepe", "Paez"));
        users.add(new User(3L, "Jane", "Dawis"));
        users.add(new User(4L, "Johnas", "Polt"));
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public Optional<User> findById(Long id) {
        User user = null;
        for (User u : users) {
            if (u.getId().equals(id)) {
                user = u;
                break;
            }
        }
        return Optional.ofNullable(user);
    }
}
