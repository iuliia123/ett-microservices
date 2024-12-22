package com.ezbob.service_shuffle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LoggingService {

    private final RestTemplate restTemplate;

    @Value("${service-log.url}")
    private String serviceLogUrl;

    public LoggingService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Async
    public void logRequest(int number) {
        try {
            restTemplate.postForEntity(serviceLogUrl, new LogRequest(number), String.class);
            System.out.println("Logged request asynchronously: " + number);
        } catch (Exception e) {
            System.err.println("Failed to log request: " + e.getMessage());
        }
    }

    static class LogRequest {
        private int number;

        public LogRequest(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }
}
