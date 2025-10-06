package com.emailwriter.email_writer_backend.model;

public class EmailResponse {
    private String generatedReply;

    // All-Args Constructor (Required for 'new EmailResponse(reply)')
    public EmailResponse(String generatedReply) {
        this.generatedReply = generatedReply;
    }

    // No-Args Constructor (Required by Spring/Jackson)
    public EmailResponse() {
    }

    // Getter
    public String getGeneratedReply() {
        return generatedReply;
    }

    // Setter
    public void setGeneratedReply(String generatedReply) {
        this.generatedReply = generatedReply;
    }
}