package com.tatsam.priority.service;

import com.tatsam.priority.model.User;
import com.tatsam.priority.repository.PriorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PriorityService {
    @Autowired
    private PriorityRepository priorityRepository;
    public User addUser(User user) {
        return priorityRepository.save(user);
    }

    public Optional<User> getUserByid(Long id) {
        return priorityRepository.findById(id);
    }


    public List<User> getAllUser() {
        return priorityRepository.findAll();
    }
}
