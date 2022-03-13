package com.cwg_academy.banking.controller;


import com.cwg_academy.banking.io.entity.UserEntity;
import com.cwg_academy.banking.model.SimpleResponse;
import com.cwg_academy.banking.model.UserModel;
import com.cwg_academy.banking.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @Autowired
    UserRepository userRepository;

    @PostMapping("/signUp")
    public SimpleResponse signUpUser(@RequestBody UserModel model){
        UserEntity userEntity = new UserEntity();
        BeanUtils.copyProperties(model, userEntity);
        UserEntity s = userRepository.save(userEntity);
        //UserModel returnValue = new UserModel();
        //BeanUtils.copyProperties(s, returnValue);
        SimpleResponse simpleResponse = new SimpleResponse();
        if (s != null){
            simpleResponse.setMessage("User created successfully");
        }
        return simpleResponse;
    }
}
