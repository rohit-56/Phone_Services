package services;

import models.Contact;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class contactService {

    public List<Contact> list=List.of(new Contact(11,"Ram","ram@gmail.com",1),new Contact(12,"Shyam","shyam@gmail.com",1),new Contact(13,"Mohan","mohan@gmail.com",2));

    public List<Contact> getContacts(int id){
        return list.stream().filter(e->e.getUserId()==id).collect(Collectors.toList());
    }

}
