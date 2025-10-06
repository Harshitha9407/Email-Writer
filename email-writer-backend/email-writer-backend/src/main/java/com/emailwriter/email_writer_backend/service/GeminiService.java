package com.emailwriter.email_writer_backend.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.*;

import java.util.HashMap;
import java.util.Map;

@Service
public class GeminiService {

    @Value("${gemini.api.key}")
    private String apiKey;

    private static final String GEMINI_API_URL =
            "https://generativelanguage.googleapis.com/v1/models/gemini-2.5-flash:generateContent?key=";
    // Note: If 'gemini-pro' still gives issues, you may use 'gemini-2.5-flash'
    // as it is the current recommended general-purpose model, but the API version fix should be enough.

    public String generateEmailReply(String originalEmail, String tone) {
        RestTemplate restTemplate = new RestTemplate();

        String prompt = String.format(
                "Generate a %s email reply to the following email. Only return the reply text, nothing else:\n\n%s",
                tone, originalEmail
        );

        Map<String, Object> requestBody = new HashMap<>();
        Map<String, String> content = new HashMap<>();
        content.put("text", prompt);
        requestBody.put("contents", new Object[]{Map.of("parts", new Object[]{content})});

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, Object>> request = new HttpEntity<>(requestBody, headers);

        try {
            ResponseEntity<Map> response = restTemplate.postForEntity(
                    GEMINI_API_URL + apiKey,
                    request,
                    Map.class
            );

            // Extract text from Gemini response
            Map<String, Object> body = response.getBody();

            // Check for API errors within the response structure (optional, but robust)
            if (body.containsKey("error")) {
                Map<String, Object> errorMap = (Map<String, Object>) body.get("error");
                String errorMessage = (String) errorMap.get("message");
                return "Gemini API Error: " + errorMessage;
            }

            var candidates = (java.util.List) body.get("candidates");
            var firstCandidate = (Map) candidates.get(0);
            var contentMap = (Map) firstCandidate.get("content");
            var parts = (java.util.List) contentMap.get("parts");
            var firstPart = (Map) parts.get(0);

            return (String) firstPart.get("text");

        } catch (Exception e) {
            System.err.println("Error generating email: " + e.getMessage());
            // This is the error message that gets displayed in the frontend
            return "Error generating email: " + e.getMessage();
        }
    }
}