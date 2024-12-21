package com.pb_booking.service;

import com.pb_booking.entity.USER;
import com.pb_booking.repository.USER_REPOSITORY;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class USER_SERVICE {
    @Autowired
    private USER_REPOSITORY repository;

    public USER saveUser(USER user) {
        return repository.save(user);
    }
    public List<USER> getUsers(){
        return repository.findAll();
    }
    public USER getUserById(int id){
        return repository.findById(id).orElse(null);
    }
    public USER getUserByName(String name){
        return repository.findByName(name);
    }
    public String deleteUser(int id){
        repository.deleteById(id);
        return "User Removed- "+id;
    }
    public USER updateUser(USER user){
         USER Existing_user=repository.findById(user.getId()).orElse(null);
       // assert Existing_user != null;
         Existing_user.setName(user.getName());
         Existing_user.setPassword(user.getPassword());
         Existing_user.setPhone(user.getPhone());
         Existing_user.setEmail(user.getEmail());
         return repository.save(Existing_user);
    }
}

