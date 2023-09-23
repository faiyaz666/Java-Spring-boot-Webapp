package com.example.demospringbootwebapp.Controller;

import com.example.demospringbootwebapp.Service.RegisterService;
import com.example.demospringbootwebapp.model.RegisterClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @Autowired
    private RegisterService candidateService;

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/profile")
    public String profile(@ModelAttribute RegisterClass candidate, Model model){
        candidate = candidateService.registration(candidate);
        model.addAttribute("candidate", candidate);
        return "profile";
    }

}
