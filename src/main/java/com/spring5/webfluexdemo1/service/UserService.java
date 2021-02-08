package com.spring5.webfluexdemo1.service;

import com.spring5.webfluexdemo1.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> getUserById(int id);

    Flux<User> getAllUser();

    Mono<Void> addUser(Mono<User> userMono);
}
