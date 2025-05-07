package com.aptech.Secure.Tasker.dtos.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.time.Instant;

public record LoginResponse (
        @JsonProperty("access_token")
         String accessToken,

                @JsonProperty("token_type")
 String tokenType,

@JsonProperty("expires_in")
 long expiresIn,

@JsonProperty("expires_at")
 Instant expiresAt
) {}
