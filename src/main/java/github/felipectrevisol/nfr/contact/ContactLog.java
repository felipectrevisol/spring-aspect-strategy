package github.felipectrevisol.nfr.contact;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Async;

@Aspect
@Component
public class ContactLog {

    @Async
    @After("execution(* github.felipectrevisol.nfr.contact.EmployeeAccessibleOnly.add(..))")
    public void log() throws Throwable {
        System.out.println("Log Aspect method: ---- " + Thread.currentThread() + " -> " + Thread.currentThread().getId());
        System.out.println("***********NEW CONTACT*************");
        System.out.println("A New Contact Was Added.");
        System.out.println("***********NEW CONTACT*************");
    }
}