package mititelu.laura.javamasterclass.challenges.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Contacts {

    private static final List<Contact> contactList = new ArrayList<>();

    private Contacts(){
        
    }
    
    public static Contacts getContactList(){
        return new Contacts();
    }
    
    public void printContactList(){
        if(contactList.size() ==0 ){
            System.out.println("Empty contact list");
        } else {
            contactList.forEach(System.out::println);
        }
    }
    
    public void addNewContact(Contact newContact){
        if(!contactList.contains(newContact)){
            contactList.add(newContact);
        }        
    }
    
    public void updateContact(Contact currentContact, Contact newContactDetails){
        int position = contactList.lastIndexOf(currentContact);
        if(position >= 0){
            contactList.set(position, newContactDetails);
        }
    }
    
    public void removeContact(Contact contactToRemove){
        contactList.removeIf( s-> s.equals(contactToRemove));
    }

    public boolean findContact(Contact searchContact){
        if(contactList.contains(searchContact)){
            return true;
        }
        return false;
    }

    private int getPosition(Contact contact){
        return contactList.indexOf(contact);
    }

    public void displayContactDetails(Contact contact){
        if(findContact(contact)){
            int position = getPosition(contact);
            System.out.println("Name = " + contactList.get(position).getName());
            System.out.println("Phone number = " + contactList.get(position).getPhoneNumber());
        } else {
            System.out.println("Contact not found");
        }
    }


}
