package mititelu.laura.javamasterclass.challenges.arraylist;

import java.util.Objects;

public class Contact {

    private final String name;

    private final String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name = (name != null) ? name : "";
        this.phoneNumber = (phoneNumber != null) ? phoneNumber : "";
    }

    public Contact(String name){
        this(name, "");
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return " { name = " + name +
                ", phone number = " + phoneNumber +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact contact = (Contact) o;

        return Objects.equals(name, contact.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
