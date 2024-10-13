package github.felipectrevisol.nfr.contact;

public final class Phone {

    private final Type type;
    private final String number;

    public static enum Type {
        WhatsApp
    }

    public Phone(final Type type, final String number) {
        this.type = type;
        this.number = number;
    }

    public Type type() {
        return type;
    }

    public String number() {
        return number;
    }
}