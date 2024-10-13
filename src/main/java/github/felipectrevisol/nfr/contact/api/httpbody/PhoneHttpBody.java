package github.felipectrevisol.nfr.contact.api.httpbody;

import jakarta.validation.constraints.NotBlank;

public record PhoneHttpBody(@NotBlank String number) {}