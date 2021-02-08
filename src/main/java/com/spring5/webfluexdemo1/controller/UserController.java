package com.spring5.webfluexdemo1.controller;

import com.spring5.webfluexdemo1.entity.User;
import com.spring5.webfluexdemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
public class UserController  {
    @Autowired
    private UserService userService;
    @GetMapping("user/{id}")
    public Mono<User> getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
    @GetMapping("/user")
    public Flux<User> getUser(){
        return userService.getAllUser();
    }
    @PostMapping("/add")
    public Mono<Void> addUser(@RequestBody User user){
        Mono<User> userMono=Mono.just(user);
        return userService.addUser(userMono);
    }
}
