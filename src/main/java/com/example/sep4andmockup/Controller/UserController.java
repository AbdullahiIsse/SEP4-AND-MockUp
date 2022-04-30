package com.example.sep4andmockup.Controller;

import com.example.sep4andmockup.Entities.User;
import com.example.sep4andmockup.Repository.UserRepository;
import com.example.sep4andmockup.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    UserRepository userRepository;

    @Autowired
    UserService userService;


    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<User> getUser(){

        List<User> users = userRepository.findAll();

        return users;
    }


    @GetMapping("/validate/{username}/{password}")
    public ResponseEntity<User> validateUser(@PathVariable("username") String username, @PathVariable("password") String password) {

        User user = null;
        try {
            user = userService.validateUser(username, password);
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);

    }








}
