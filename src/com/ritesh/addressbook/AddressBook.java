package com.ritesh.addressbook;

import java.util.Scanner;

public class AddressBook {
    Scanner sc = new Scanner(System.in);
    Contact contact = new Contact();
    public void addContact() {
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

    }
    public void showContact() {
        if (contact == null){
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
        }
    }
    public void editContact() {
        System.out.println("Enter the First name to Edit Contact");
        String fName = sc.next();

        if (fName.equals(contact.getFirstName())) {
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

            }
        else{
            System.out.println("Contact not found.");

        }
    }
        public void deleteContact() {
            System.out.println("Enter the First name to Delete Contact :");
            String fName = sc.next();

            if (fName.equals(contact.getFirstName())) {
                System.out.println("Contact Deleted");
                contact = null;

            }
            else {
                System.out.println("Contact is not Found ");

            }

        }

        public static void main (String[]args){

            System.out.println("Welcome to Address Book Program");
            AddressBook addressBook = new AddressBook();

            addressBook.addContact();
            addressBook.showContact();
            addressBook.editContact();
            addressBook.showContact();
            addressBook.deleteContact();
            addressBook.showContact();
        }
    }