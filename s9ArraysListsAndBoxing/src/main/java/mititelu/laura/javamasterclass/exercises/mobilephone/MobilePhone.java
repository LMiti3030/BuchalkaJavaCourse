package mititelu.laura.javamasterclass.exercises.mobilephone;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {

    private String myNumber;
    private List<Contact> myContacts;

    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact){
        if(findContact(contact) < 0){
            myContacts.add(contact);
            return true;
        }
        return false;
    }

    public boolean removeContact(Contact contact){
        if(findContact(contact) >= 0){
            myContacts.remove(contact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact){
        int position = findContact(oldContact);
        if(position >= 0){
            myContacts.set(position, newContact);
            return true;
        }
        return false;
    }


    private int findContact(String name){
        for(int i = 0; i < myContacts.size(); i++){
            if(myContacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contact contact){
        return findContact(contact.getName());
    }

    public Contact queryContact(String name){
        int position  = findContact(name);
        if(position >= 0){
            return myContacts.get(position);
        }
        return null;
    }

    public void printContacts(){
        System.out.println("Contact List:");
        for(int i = 0; i < myContacts.size(); i++){
            Contact contact= myContacts.get(i);
            System.out.printf("%d. %s -> %s%n", i+1, contact.getName(), contact.getPhoneNumber());
        }
    }

}
