package br.fiap.futureskillshub.application.dto;

import br.fiap.futureskillshub.domain.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record UserDTO(
        @NotBlank @Size(max = 60) String name,
        @Email @NotBlank String email,
        @NotBlank String street,
        @NotBlank String number,
        @NotBlank String city,
        @NotBlank String state,
        Role role
) {}