package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
@CrossOrigin("*")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<Users> getUserData(){
         return userService.getusers();
    }


    @RequestMapping(path = "/login")
    @GetMapping
    public String authenication(@RequestParam String email,Long mobileNumber){ return userService.authenication(email,mobileNumber);}

    @RequestMapping(path = "/getMobile")
    @GetMapping
    public Users getMobile(@RequestParam String name){return userService.getMob(name);}

    @PostMapping
    public void registerUser(@RequestBody Users users){
        userService.addnewUser(users);
    }

}
