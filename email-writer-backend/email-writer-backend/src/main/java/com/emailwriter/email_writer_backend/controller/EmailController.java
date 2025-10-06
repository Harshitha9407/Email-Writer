package com.emailwriter.email_writer_backend.controller;

import com.emailwriter.email_writer_backend.model.EmailRequest;
import com.emailwriter.email_writer_backend.model.EmailResponse;
import com.emailwriter.email_writer_backend.service.GeminiService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@CrossOrigin(origins = "*")
public class EmailController {

    @Autowired
    private GeminiService geminiService;

    @PostMapping("/generate")
    public EmailResponse generateEmail(@RequestBody EmailRequest request) {
        String reply = geminiService.generateEmailReply(
                request.getOriginalEmail(), // Now manually defined in EmailRequest
                request.getTone()          // Now manually defined in EmailRequest
        );
        return new EmailResponse(reply); // Now handled by the explicit constructor in EmailResponse
    }

    @GetMapping("/health")
    public String health() {
        return "Email Writer API is running";
    }
}