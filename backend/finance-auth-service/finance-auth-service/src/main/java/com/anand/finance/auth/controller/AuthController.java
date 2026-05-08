package com.anand.finance.auth.controller;

import com.anand.finance.auth.dto.AuthResponse;
import com.anand.finance.auth.dto.LoginRequest;
import com.anand.finance.auth.dto.SignupRequest;
import com.anand.finance.auth.dto.UserResponse;
import com.anand.finance.auth.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/signup")
    public AuthResponse signup(@Valid @RequestBody SignupRequest request) {
        return authService.signup(request);
    }

    @PostMapping("/login")
    public AuthResponse login(@Valid @RequestBody LoginRequest request) {
        return authService.login(request);
    }

    @GetMapping("/me")
    public UserResponse me(Authentication authentication) {
        String userId = authentication.getPrincipal().toString();
        return authService.getCurrentUser(userId);
    }
}