package mititelu.laura.javamasterclass.challenges.arraylist;

import java.util.Scanner;

public class MobilePhone {

    private static Scanner scanner = new Scanner(System.in);
    private static Contacts contactList = Contacts.getContactList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit){
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0 :
                    printInstructions();
                    break;
                case 1:
                    contactList.printContactList();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    modifyContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    searchForContact();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\n Press ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a new contact.");
        System.out.println("\t 3 - To modify a contact.");
        System.out.println("\t 4 - To remove a contact.");
        System.out.println("\t 5 - To search for a contact.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addContact(){
        System.out.print("Enter the name of the contact: ");
        String name = scanner.nextLine();
        System.out.print("Enter the phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact contact = new Contact(name, phoneNumber);
        contactList.addNewContact(contact);
        System.out.println("Contact added");
    }

    public static void modifyContact(){
        System.out.print("Enter the name of the contact you want to modify: ");
        String name = scanner.nextLine();
        Contact currentContact = new Contact(name);
        contactList.displayContactDetails(currentContact);
        if(contactList.findContact(currentContact)){
            System.out.print("Enter the new name: ");
            String newName = scanner.nextLine();
            System.out.print("Enter the new phone number");
            String newPhoneNumber = scanner.nextLine();
            contactList.updateContact(currentContact, new Contact(newName, newPhoneNumber));
            System.out.println("Contact details updated");
        }

    }

    public static void removeContact(){
        System.out.print("Enter the name of the contact you want to remove: ");
        String name = scanner.nextLine();
        Contact currentContact = new Contact(name);
        contactList.removeContact(currentContact);
        System.out.println("Contact removed");
    }

    public static void searchForContact(){
        System.out.print("Enter the name of the contact you want to search: ");
        String name = scanner.nextLine();
        Contact currentContact = new Contact(name);
        contactList.displayContactDetails(currentContact);
    }

}
