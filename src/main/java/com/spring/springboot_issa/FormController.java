package com.spring.springboot_issa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*") // allows requests from your React app
@RestController
@RequestMapping("/api/form")
public class FormController {

    @Autowired
    private EmailService emailService;

    @PostMapping("/submit")
    public String submitForm(@RequestBody FormData data) {
        emailService.sendEmail(data.getName(), data.getEmail(), data.getMessage());
        return "Form submitted successfully!";
    }
}
