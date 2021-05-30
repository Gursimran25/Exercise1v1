package sheridan.kang7.exercise1v1.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import sheridan.kang7.exercise1v1.Employee;


@org.springframework.stereotype.Controller

public class Controller {
    @GetMapping("/")
    public String showForm(Model model) {
        Employee emp = new Employee();
        model.addAttribute("emp", emp);

        return "index";
    }
    @PostMapping("/")
    public String submitForm(@ModelAttribute("emp") Employee emp) {
        return "output";
    }
}
