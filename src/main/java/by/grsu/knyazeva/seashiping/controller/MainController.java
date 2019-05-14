package by.grsu.knyazeva.seashiping.controller;

import by.grsu.knyazeva.seashiping.model.User;
import by.grsu.knyazeva.seashiping.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/home")
    public String getMainPage(Model model) {
        model.addAttribute("currentUser", getCurrentUser());
        return "index";
    }

    private User getCurrentUser(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return userRepository.findByUsername(auth.getName());
    }
}
