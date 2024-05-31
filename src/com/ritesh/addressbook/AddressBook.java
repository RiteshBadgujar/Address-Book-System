package com.ritesh.addressbook;


import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    ArrayList<Contact>  contactList= new ArrayList<>();
    public void addContact() {
        Contact contact = new Contact();
        System.out.println("Enter the First Name :");
        contact.setFirstName(sc.next());
        System.out.println("Enter the Last Name :");
        contact.setLastName(sc.next());
        System.out.println("Enter the Address :");
        contact.setAddress(sc.next());
        System.out.println("Enter the city :");
        contact.setCity(sc.next());
        System.out.println("Enter the State :");
        contact.setState(sc.next());
        System.out.println("Enter the zip code :");
        contact.setZipcode(sc.next());
        System.out.println("Enter the Phone Number :");
        contact.setPhoneNumber(sc.next());
        System.out.println("Enter the E-mail :");
        contact.setEmail(sc.next());
        contactList.add(contact);

    }
    public void displayContact() {
        for (Contact contact : contactList) {
            System.out.println(contact.toString());
        }
      /*  if (contact == null){
                System.out.println("Contact not available:");
        }
        else {
            System.out.println("FirstName :" + contact.getFirstName());
            System.out.println("LastName :" + contact.getLastName());
            System.out.println("Address :" + contact.getAddress());
            System.out.println("City :" + contact.getCity());
            System.out.println("State :" + contact.getState());
            System.out.println("Zipcode :" + contact.getZipcode());
            System.out.println("Phone Number :" + contact.getPhoneNumber());
            System.out.println("Email :" + contact.getEmail());
        }*/
    }


        public void editContact() {
        boolean found=false;
        System.out.println("Enter the First name to Edit Contact");
        String fName = sc.next();
        for(int i=0;i<contactList.size();i++) {

            Contact contact = contactList.get(i);
            if (fName.equals(contact.getFirstName())) {
                found=true;
                System.out.println("Contact found ");
                System.out.println("Enter the Last Name :");
                contact.setLastName(sc.next());
                System.out.println("Enter the Address :");
                contact.setAddress(sc.next());
                System.out.println("Enter the city :");
                contact.setCity(sc.next());
                System.out.println("Enter the State :");
                contact.setState(sc.next());
                System.out.println("Enter the zip code :");
                contact.setZipcode(sc.next());
                System.out.println("Enter the Phone Number :");
                contact.setPhoneNumber(sc.next());
                System.out.println("Enter the E-mail :");
                contact.setEmail(sc.next());
            } else{
                System.out.println("Contact not found.");
            }
        }
    }
    public void deleteContact() {
        System.out.println("Enter the First name to Delete Contact :");
        String fName = sc.next();
        boolean found = false;
        for (int i=0;i<contactList.size();i++) {
            Contact contact = contactList.get(i);
            if (fName.equals(contact.getFirstName())) {
                found = true;
                contactList.remove(i);
                System.out.println("Contact is Deleted.");

            }
        }
        if(!found)
        {
            System.out.println("Given First Name is Not found.");
        }
    }

        public static void main (String[]args) {

            System.out.println("Welcome to Address Book Program");
            AddressBook addressBook = new AddressBook();
            int choice = 0;
            do {
                System.out.println("******** ADDRESSS BOOK **********");
                System.out.println("1.ADD CONTACT \n2.EDIT CONTACT \n3.DELETE CONTACT \n4.DISPLAY CONTACT \n5.EXIT");
                System.out.println("Enter the Choice  Operation Number :");
                choice = addressBook.sc.nextInt();

                switch (choice) {
                    case 1:
                        addressBook.addContact();
                        break;
                    case 2:
                        addressBook.editContact();
                        //addressBook.findContact();
                        break;
                   case 3:
                       addressBook.deleteContact();
                        break;
                    case 4:
                        addressBook.displayContact();
                        break;
                    case 5:
                       break;
                }
            }
            while(choice<=4);
        }
    }