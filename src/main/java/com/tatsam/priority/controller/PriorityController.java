package com.tatsam.priority.controller;

import com.tatsam.priority.model.User;
import com.tatsam.priority.service.PriorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@RestController
public class PriorityController {

    @Autowired
    private PriorityService priorityService;
    @PostMapping("/addUser")
    public User addNewUser(@RequestBody User user){
        return priorityService.addUser(user);
    }
    @GetMapping("/getUserById/{id}")
    private Optional<User> getUserById(@PathVariable Long id ){
        return priorityService.getUserByid(id);
    }

    @GetMapping("/getAllUser")
    private List<User> getAllUser(){
        return priorityService.getAllUser();
    }

    @GetMapping("/getPriorityArea")
    private HashSet<String> getPriorityArea(){
        List<User> userList = priorityService.getAllUser();
        HashSet<String> prioritySet= new HashSet<>() ;//does not allow duplicate elements
        for(User user : userList ){
            prioritySet.add(user.getUser_Area().get(0).getArea());//gets the 1st element of userArea which is the highest priority
        }
        return prioritySet;
    }

}
