package com.example.lab3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lab3.model.User;
import com.example.lab3.repository.UserRepository;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public void populateRandom(){
        for(int i=0;i<10;i++){
            User user = new User();
            user.setName("User"+i);
            user.setEmail("user"+i+"@gmail.com");
            user.setAge(20+i);
            userRepository.save(user);
        }

    }
    

}
