package org.launchcode.spaday.controllers;

import org.launchcode.spaday.controllers.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @GetMapping("add")
   public String displayAddUserForm(){

        return "user/add";

   }
@PostMapping
    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {

    if (verify.equals(user.getPassword())){

        return "user/index";
    } else {
        model.addAttribute("error", "Password does not match, please try again.");
        model.addAttribute("username", user.getUsername());
        model.addAttribute("email", user.getEmail());

        return "user/add";}
    }
}
