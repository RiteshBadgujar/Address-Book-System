package com.ritesh.addressbook;
import java.lang.String;
public class Contact {
    private String  firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String phoneNumber;
    private String email;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getAddress() {
        return address;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getZipcode(){
        return zipcode;
    }
    public String getPhoneNumber(){

        return phoneNumber;
    }
    public  String getEmail(){
        return email;
    }
}
