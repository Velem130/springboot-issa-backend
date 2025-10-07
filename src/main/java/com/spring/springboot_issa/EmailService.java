package com.spring.springboot_issa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String name, String email, String messageText) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("annooronlinemadrassah@gmail.com"); // where the form will be sent
        message.setSubject("New Message from Website Form");
        message.setText("Name: " + name + "\nEmail: " + email + "\nMessage: " + messageText);
        mailSender.send(message);
    }
}