package com.finalClassProject.musiclover.controller;

import com.finalClassProject.musiclover.entities.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserProfileController {

        @RequestMapping("/profile")
        public String displayUserProfile() {
            return "user-profile";
        }

        @RequestMapping("/new")
        public String createNewUser(Model model) {
            User aUser = new User();
            model.addAttribute("userAttr", aUser);

            return "new-user";
        }


}
