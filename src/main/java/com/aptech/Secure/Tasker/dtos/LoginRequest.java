package com.aptech.Secure.Tasker.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LoginRequest {
    @Email(message = "Must be a valid email address")
    @NotBlank(message = "Email must not be blank")
    private String email;

    @NotBlank(message = "Password cannot be blank")
    private String password;
}
