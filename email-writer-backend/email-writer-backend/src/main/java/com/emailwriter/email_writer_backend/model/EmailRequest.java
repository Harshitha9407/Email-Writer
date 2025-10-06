package com.emailwriter.email_writer_backend.model;

public class EmailRequest {
    private String originalEmail;
    private String tone; 
    
    public EmailRequest() {
    }

    public String getOriginalEmail() {
        return originalEmail;
    }

    public String getTone() {
        return tone;
    }

    public void setOriginalEmail(String originalEmail) {
        this.originalEmail = originalEmail;
    }

    public void setTone(String tone) {
        this.tone = tone;
    }
}
