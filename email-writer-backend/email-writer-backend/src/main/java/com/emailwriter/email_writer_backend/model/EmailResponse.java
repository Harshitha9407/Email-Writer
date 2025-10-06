package com.emailwriter.email_writer_backend.model;

public class EmailResponse {
    private String generatedReply;

    public EmailResponse(String generatedReply) {
        this.generatedReply = generatedReply;
    }

    public EmailResponse() {
    }

    public String getGeneratedReply() {
        return generatedReply;
    }

    public void setGeneratedReply(String generatedReply) {
        this.generatedReply = generatedReply;
    }
}
