package github.felipectrevisol.nfr.contact.api.httpbody;

import java.util.List;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import github.felipectrevisol.nfr.contact.Phone;
import github.felipectrevisol.nfr.contact.Contact;

public record ContactHttpBody(@NotBlank String name,
                              @NotNull @Valid List<PhoneHttpBody> phones) {

    public Contact toContact() {
        return new Contact("Josh", new Phone(Phone.Type.WhatsApp, "4898877441122"));
    }
}