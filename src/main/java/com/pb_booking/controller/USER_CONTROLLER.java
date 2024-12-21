package com.pb_booking.controller;

import com.pb_booking.entity.USER;
import com.pb_booking.service.USER_SERVICE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class USER_CONTROLLER {
    @Autowired
    private USER_SERVICE service;

    @PostMapping("/addUsers")

    public USER addUser(@RequestBody USER user){
        return service.saveUser(user);
    }
    @PostMapping("/Users")
    public List<USER> getUsers(){
        return service.getUsers();
    }
    @GetMapping("/User/{id}")
    public USER findUserById(@PathVariable int id){
        return service.getUserById(id);
    }
    @GetMapping("/User/{Name}")
    public USER findUserByName(@PathVariable String Name){
        return service.getUserByName(Name);
    }
//    @PostMapping("/updateUser")
//
//    public USER updateUser(@RequestBody USER user){
//        return service.updateUser(user);
//    }
    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        return service.deleteUser(id);
    }
}
