package github.felipectrevisol.nfr.contact;

import java.util.List;
import java.util.LinkedList;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Repository;
import org.springframework.scheduling.annotation.EnableAsync;
import static github.felipectrevisol.nfr.contact.Phone.Type;

@Repository
@EnableAsync
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

    @Pointcut("execution(* github.felipectrevisol.nfr.contact.add(..))")
    public void add(final Contact contact) {
        System.out.println("Add method: ---- " + Thread.currentThread() + " -> " + Thread.currentThread().getId());
        System.out.println("Start a add new contact.");
        this.repository.add(contact);
        System.out.println("Finished add a new contact.");
    }
}