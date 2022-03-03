package models;

import org.springframework.stereotype.Component;

@Component
public class Contact {

    private int cId;
    private String contact_name;
    private String email;

    private int userId;

    public Contact(int cId, String contact_name, String email, int userId) {
        this.cId = cId;
        this.contact_name = contact_name;
        this.email = email;
        this.userId = userId;
    }

    public Contact() {
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
