package com.CRUD.service;

import com.CRUD.entity.USERS;
import com.CRUD.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {
    @Autowired
    private UserRepository Repo;

    public USERS SaveUser(USERS User){
        return Repo.save(User);
    }
    public List<USERS> GetUsers(){
        return Repo.findAll();
    }
    public USERS GetUser(int id){
        return Repo.findById(id).orElse(null);
    }
    public USERS GetUserByName(String name){
        return Repo.findByName(name);
    }
    public String DeleteUser(int id){
        Repo.deleteById(id);
        return "User Removed:"+id;
    }
    public USERS UpdateUser(USERS User){
        USERS Existing_User =Repo.findById(User.getId()).orElse(null);
        Existing_User.setName(User.getName());
        Existing_User.setEmail(User.getEmail());
        Existing_User.setPassword((User.getPassword()));
        Existing_User.setPhone(User.getPhone());
        Existing_User.setRole(User.getRole());
        return Repo.save(Existing_User);
    }
}
