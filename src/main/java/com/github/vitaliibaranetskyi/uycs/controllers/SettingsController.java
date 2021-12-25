package com.github.vitaliibaranetskyi.uycs.controllers;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.github.vitaliibaranetskyi.uycs.models.User;

@Controller
@RequestMapping("/settings")
public class SettingsController {

    @GetMapping
    public String openSettingsScreen(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("userName", user.getUsername());
        return "settings_screen.html";
    }
}