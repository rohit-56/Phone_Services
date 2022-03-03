package controller;

import models.Contact;
import models.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;
import org.springframework.web.client.RestTemplate;
import service.userService;

import java.util.List;
import java.util.Optional;

@RestController
@Component
public class mapping {

    @Autowired
    private userService userservice;

    @Autowired
    private RestTemplate resttemplate;


    @GetMapping("/user/{id}")
    public user getusers(@PathVariable("id") int id){
         user u1=userservice.getUser(id);
        System.out.println("hello");
         List l1=resttemplate.getForObject("http://localhost:9002/contact/user/"+id,List.class);
         u1.setContacts(l1);
        return u1;
    }

}
