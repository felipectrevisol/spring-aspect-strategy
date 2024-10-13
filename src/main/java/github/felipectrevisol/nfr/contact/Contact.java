package github.felipectrevisol.nfr.contact;

import java.util.List;
import java.util.Arrays;

public final class Contact {

    private final String name;
    private final List<Phone> phones;

    public Contact(final String name, final Phone... phones) {
        this.name = name;
        this.phones = Arrays.asList(phones);
    }

    public String name() {
        return name;
    }

    public List<Phone> phones() {
        return phones;
    }
}