package com.github.vitaliibaranetskyi.uycs.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.github.vitaliibaranetskyi.uycs.models.User;

@Controller
public class MainController {

    @GetMapping
    public String openMainScreen(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("userName", user.getUsername());
        return "main_screen.html";
    }

    @GetMapping("/login")
    public String openLoginScreen() {
        return "login_screen.html";
    }
}