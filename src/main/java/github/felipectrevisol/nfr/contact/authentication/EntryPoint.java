package github.felipectrevisol.nfr.contact.authentication;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

@RestController
@RequestMapping("/entrypoint")
public class EntryPoint {

    private final Token token;
    private final AuthenticationManager manager;

    public EntryPoint(final AuthenticationManager manager) {
        this.manager = manager;
        this.token = new Token();
    }

    @PostMapping
    public ResponseEntity<String> login(@RequestBody @Valid final CredentialDto credential) {
        var token = new UsernamePasswordAuthenticationToken(credential.email(), credential.password());
        var authentication = manager.authenticate(token);
        return ResponseEntity.ok(this.token.create((User) authentication.getPrincipal()));
    }
}