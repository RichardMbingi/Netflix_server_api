package com.netflix.server_api.controller;

import com.netflix.server_api.model.User;
import org.springframework.web.bind.annotation.*;
import com.netflix.server_api.services.UserService;

import java.util.List;

@RestController
@RequestMapping(value = "subscribers")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> findAll(){return userService.findAll();}

    @PostMapping
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @PatchMapping
    public User update(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping(value = "{id}")
    public User findByIdNumber(@PathVariable Integer id){
        return userService.findByIdNumber(id);
    }
}
