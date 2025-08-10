package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/hello")
    public String getPage() {
        return "hello";
    }

    @PostMapping("/hello")
    public String processForm(@RequestParam("name") String name, Model model) {
        model.addAttribute("message", "Hey There 🖐🏻, " + name + "!");
        return "hello";
    }
}
