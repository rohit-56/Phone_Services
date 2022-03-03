package controller;

import models.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import services.contactService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contact")
@Component
public class mapping {

    @Autowired
private contactService contactservice;

    @GetMapping("/user/{id}")
    public ResponseEntity<List<Contact>> getContacts(@PathVariable("id") int id){
        List<Contact> l1=contactservice.getContacts(id);
        if(l1.size()<=0)
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        return ResponseEntity.of(Optional.of(l1));
    }

}
