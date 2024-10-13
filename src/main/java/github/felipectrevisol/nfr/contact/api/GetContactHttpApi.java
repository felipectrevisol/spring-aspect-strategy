package github.felipectrevisol.nfr.contact.api;

import java.util.ArrayList;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import github.felipectrevisol.nfr.contact.api.httpbody.PhoneHttpBody;
import github.felipectrevisol.nfr.contact.api.httpbody.ContactHttpBody;

@RestController
@RequestMapping("/contact")
public class GetContactHttpApi {

    @GetMapping
    public ResponseEntity<ContactHttpBody> get() {
        return ResponseEntity.ok(new ContactHttpBody("Josh", new ArrayList<>() {
            {
                add(new PhoneHttpBody("4898877441100"));
                add(new PhoneHttpBody("1198877441100"));
                add(new PhoneHttpBody("5198877441100"));
            }
        }));
    }
}