package service;

import models.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class userService {

    private List<user> list=List.of(new user(1,"Rohit",22334455L),new user(2,"Anmol",11223344L),new user(3,"Rahul",55667788L));

    public List<user> getAllUser(){
        return list;
    }
    public user getUser(int id){
        return list.stream().filter(userid->userid.getUserId()==id).findAny().orElse(null);
    }
    public void addUser(user u1){
        list.add(new user(u1.getUserId(),u1.getName(),u1.getPhone()));
    }
    public boolean updateUser(user u1,int id){
        boolean valid=list.stream().anyMatch(e->e.getUserId()==id);
        if(!valid)
            return valid;
        list=list.stream().map(e-> { if(e.getUserId()==id){ e.setName(u1.getName()); e.setPhone(u1.getPhone());}return e;}).collect(Collectors.toList());
    return true;
    }
    public boolean deleteUser(int id){
        boolean valid=list.stream().anyMatch(e->e.getUserId()==id);
        if(!valid)
            return valid;
        list=list.stream().filter(e-> e.getUserId()!=id).collect(Collectors.toList());
        return true;
    }





}
