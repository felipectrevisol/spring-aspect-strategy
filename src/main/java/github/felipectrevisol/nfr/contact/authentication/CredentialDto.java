package github.felipectrevisol.nfr.contact.authentication;

import jakarta.validation.constraints.NotBlank;

public record CredentialDto(
        @NotBlank String email,
        @NotBlank String password) {}