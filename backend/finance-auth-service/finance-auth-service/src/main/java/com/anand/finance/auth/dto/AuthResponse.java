package com.anand.finance.auth.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AuthResponse {

    private String token;

    private String userId;

    private String name;

    private String email;

    private String currency;
}