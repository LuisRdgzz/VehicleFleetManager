package com.rdrgz.vehiclefleet.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class User {

    @GetMapping("/login")
    public String showLogin(){
        return "login/login";
    }

    @GetMapping("/main")
    public String main(){
        return "main";
    }

    @GetMapping("/listOfUser")
    public String listOfUser(){
        return "user/listOfUser";
    }

    @GetMapping("/addUser")
    public String formAddUser(){
        return "user/addUser";
    }

    @GetMapping("/updateUser")
    public String formUpdateUser(){
        return "user/updateUser";
    }

}
