package com.codelantic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codelantic.Repository.UserLoginDetailsRepository;
import com.codelantic.entity.UserLoginDetails;

import java.util.List;

@RestController
@RequestMapping("loginDetails")
public class UserLoginDetailsController {
    @Autowired
    private UserLoginDetailsRepository userLoginDetailsRepository;

    @GetMapping("/")
    public List<UserLoginDetails>getAllUserLoginDetails(){
        return userLoginDetailsRepository.findAll();
    }
}
