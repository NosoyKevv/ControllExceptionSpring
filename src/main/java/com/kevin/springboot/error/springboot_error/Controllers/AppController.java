package com.kevin.springboot.error.springboot_error.Controllers;

import com.kevin.springboot.error.springboot_error.Exceptions.UserNotFoundException;
import com.kevin.springboot.error.springboot_error.Services.UserService;
import com.kevin.springboot.error.springboot_error.models.domain.User;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/app")
public class AppController {

    @Autowired
    private UserService service;

    @GetMapping
    public String index() {
//        int value = 100 / 0;
        int value = Integer.parseInt("123");
        System.out.println(value);
        return "ok 200";
    }

    @GetMapping("/show/{id}")
    public ResponseEntity<?> show(@PathVariable(name = "id") Long id) {
//        User user = service.findById(id).orElseThrow(() -> new UserNotFoundException("User not found!!!"));
//        if (user == null) { //con la funcion lambda de arriba es lo mismo que hacer este if
//            throw new UserNotFoundException("User not found!!!");
//        }
        Optional<User> optionalUser = service.findById(id);
        if (optionalUser.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(optionalUser.get());
        // return service.findById(id);
    }
//    @GetMapping("/show/all")
//    public User List<User> showAll(){
//
//    }
}
