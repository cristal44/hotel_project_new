package edu.depaul.cdm.se452.dreamteam.windyhamhotel.contact;

import edu.depaul.cdm.se452.dreamteam.windyhamhotel.address.Address;
import lombok.Data;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Data
@Table(name = "contacts")
public class Contact implements Serializable
{
    //do not use @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    private String birth;
    private String gender;
    private String email;
    private String phone;

    public Contact(String name, Address address, String birth, String gender, String email, String phone) {
        this.name = name;
        this.address = address;
        this.birth = birth;
        this.gender = gender;
        this.email = email;
        this.phone = phone;
    }

    public Contact() {

    }

    //Autogenerated getters/ setters not working


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
