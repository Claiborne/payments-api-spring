package com.claiborne.payments.controller;

import com.claiborne.payments.entity.User;
import com.claiborne.payments.repository.UserRepository;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

  private UserRepository userRepository;

  public UserController(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @GetMapping("")
  @ResponseStatus(code = HttpStatus.OK)
  public List<User> getUsers() {
    return userRepository.findAll();
  }

  @PostMapping("")
  @ResponseStatus(code = HttpStatus.CREATED)
  public Optional<User> createUser(@RequestBody JsonNode payload) {
    User user = new User();
    user.setFirstName(payload.get("first_name").asText());
    user.setLastName(payload.get("last_name").asText());

    User createdUser = userRepository.save(user);

    return userRepository.findById(createdUser.getId());
  }
}
