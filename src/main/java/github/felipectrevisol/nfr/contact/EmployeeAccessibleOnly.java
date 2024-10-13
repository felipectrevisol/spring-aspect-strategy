package github.felipectrevisol.nfr.contact;

import java.util.List;
import java.util.LinkedList;
import org.springframework.stereotype.Service;
import static github.felipectrevisol.nfr.contact.Phone.Type;

@Service
public class EmployeeAccessibleOnly {

    private final List<Contact> repository = new LinkedList<>() {
        {
            add(new Contact("Josh", new Phone(Type.WhatsApp, "4898877441100")));
            add(new Contact("Mary", new Phone(Type.WhatsApp, "1198877441100")));
        }
    };

    public List<Contact> contacts() {
        return repository;
    }

    public void add(final Contact contact) {
        this.repository.add(contact);
    }
}