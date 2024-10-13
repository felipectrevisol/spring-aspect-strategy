package github.felipectrevisol.nfr.contact;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ContactLog {

    @Around("execution(* github.felipectrevisol.nfr.contact.EmployeeAccessibleOnly.add(..))")
    public void log() {
        System.out.println("***********NEW CONTACT*************");
        System.out.println("A New Contact Was Added.");
        System.out.println("***********NEW CONTACT*************");
    }
}