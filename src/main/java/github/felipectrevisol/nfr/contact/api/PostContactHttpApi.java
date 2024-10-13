package github.felipectrevisol.nfr.contact.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import github.felipectrevisol.nfr.contact.EmployeeAccessibleOnly;
import github.felipectrevisol.nfr.contact.api.httpbody.ContactHttpBody;

@RestController
@RequestMapping("/contact")
public class PostContactHttpApi {

    private final EmployeeAccessibleOnly repository;

    public PostContactHttpApi(final EmployeeAccessibleOnly repository) {
        this.repository = repository;
    }

    @PostMapping
    public ResponseEntity<String> post(@RequestBody ContactHttpBody body) {
        System.out.println("HttpApi: ---- " + Thread.currentThread() + " -> " + Thread.currentThread().getId());
        repository.add(body.toContact());
        return ResponseEntity.ok().build();
    }
}