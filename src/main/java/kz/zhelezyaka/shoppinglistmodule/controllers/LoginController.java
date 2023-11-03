package kz.zhelezyaka.shoppinglistmodule.controllers;

import kz.zhelezyaka.shoppinglistmodule.entityes.User;
import kz.zhelezyaka.shoppinglistmodule.services.UserRepresentation;
import kz.zhelezyaka.shoppinglistmodule.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class LoginController {

    private final UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/login")
    public String LoginPage() {
        return "login";
    }

    @GetMapping("/registration")
    public String registrationPage(Model model) {
        model.addAttribute("user", new UserRepresentation());
        return "registration";
    }

    @PostMapping("/registration")
    public String registerNewUser(@Valid UserRepresentation userRepresentation, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "registration";
        }
        if (!userRepresentation.getPassword().equals(userRepresentation.getRepeatPassword())) {
            bindingResult.rejectValue("password", "", "Passwords don't match");
            return "registration";
        }
        userService.create(userRepresentation);
        return "redirect:/login";
    }
}
