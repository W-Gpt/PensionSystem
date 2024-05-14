package com.ooyyh.top.controller;

import com.ooyyh.top.dao.UserMapper;
import com.ooyyh.top.entity.Person;
import com.ooyyh.top.service.SecurityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@Controller
@RequestMapping("/security")
public class SecurityController {
    @Autowired
    SecurityService securityService;
    @Autowired
    UserMapper userMapper;
    @PostMapping(value = "/addPerson")
    @ResponseBody
    public Map addPerson(@RequestHeader String userAddress, @RequestBody Person person){
        return securityService.addPerson(userAddress,person);
    }
    @GetMapping(value = "/getAllPerson")
    @ResponseBody
    public List<Person> getAllPerson(@RequestHeader String userAddress){
        return securityService.getAllPerson(userAddress);
    }
}