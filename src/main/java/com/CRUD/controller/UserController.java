package com.CRUD.controller;

import com.CRUD.entity.USERS;
import com.CRUD.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class UserController {
    @Autowired
    private UserService Service;

    @PostMapping("/AddUser")
    public USERS AddUser(@RequestBody USERS User){
        return Service.SaveUser(User);
    }
    @GetMapping("/Users")
    public List<USERS> findAllUsers(){
        return Service.GetUsers();
    }
    @GetMapping("/UserById/{id}")
    public USERS findUserById(@PathVariable int id){
        return Service.GetUser(id);
    }
    @GetMapping("/UserByName/{name}")
    public USERS findUserByName(@PathVariable String name){
        return Service.GetUserByName(name);
    }
    @DeleteMapping("/Delete/{id}")
    public String DeleteUser(@PathVariable int id){
        return Service.DeleteUser(id);
    }
    @PutMapping("/Update")
    public USERS UpdateUser(@RequestBody USERS User){
        return Service.UpdateUser(User);
    }
}
