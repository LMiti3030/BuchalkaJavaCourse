package mititelu.laura.javamasterclass.exercises.mobilephone;

public class Contact {

    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name = (name != null) ? name : "";
        this.phoneNumber = (phoneNumber != null) ? phoneNumber : "";
    }

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name,phoneNumber);
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}
