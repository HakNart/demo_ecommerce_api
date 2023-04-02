package com.kt.rest.demoEcommerce.controllers;

import com.kt.rest.demoEcommerce.controllers.exeptions.UserNotFoundException;
import com.kt.rest.demoEcommerce.models.authEntities.User;
import com.kt.rest.demoEcommerce.models.authEntities.UserDetailResponse;
import com.kt.rest.demoEcommerce.repository.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @PostMapping("/{id}")
    public ResponseEntity<UserDetailResponse> getUser(@PathVariable int id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new UserNotFoundException("User not found"));
        UserDetailResponse userDetailResponse = UserDetailResponse.builder()
                .name(user.getName())
                .email(user.getEmail())
                .id(user.getId())
                .build();
        return ResponseEntity.ok(userDetailResponse);
    }
}
