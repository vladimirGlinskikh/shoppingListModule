package kz.zhelezyaka.shoppinglistmodule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShoppingListController {

    @GetMapping
    public String indexPage() {
        return "index";
    }
}
