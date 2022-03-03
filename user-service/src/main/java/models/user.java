package models;

import java.util.ArrayList;
import java.util.List;

public class user {
    private int userId;
    private String name;
    private Long phone;

    private List<Contact> contacts=new ArrayList<Contact>();

    public user(int userId, String name, Long phone, List<Contact> contacts) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
        this.contacts = contacts;
    }

    public user(int userId, String name, Long phone) {
        this.userId = userId;
        this.name = name;
        this.phone = phone;
    }

    public user() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }
}
