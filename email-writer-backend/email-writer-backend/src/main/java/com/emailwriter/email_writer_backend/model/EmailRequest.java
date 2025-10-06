package com.emailwriter.email_writer_backend.model;

public class EmailRequest {
    private String originalEmail;
    private String tone; // formal, casual, professional

    // Constructor (Default/No-Args)
    public EmailRequest() {
    }

    // Getters
    public String getOriginalEmail() {
        return originalEmail;
    }

    public String getTone() {
        return tone;
    }

    // Setters
    public void setOriginalEmail(String originalEmail) {
        this.originalEmail = originalEmail;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }
}