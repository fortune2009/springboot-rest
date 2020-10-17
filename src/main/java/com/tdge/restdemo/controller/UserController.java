package com.tdge.restdemo.controller;

import com.tdge.restdemo.object.Person;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/getUserDetails")
    public String getUserDetails(@RequestHeader String name){
        return "Requesting Details of User "+name;
    }

    @PostMapping("/createUser")
    public String createNewUser(@RequestBody Person person){
        return "created new user "+person.getName();
    }

    @PutMapping("/updateUser")
    public String updateUser(@RequestBody Person person){
        return "Updated user "+person.getName();
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestBody Person person){
        return "Deleted user "+person.getName();
    }
}
