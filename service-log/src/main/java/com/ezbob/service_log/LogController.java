package com.ezbob.service_log;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/log")
public class LogController {

    @PostMapping
    public void logRequest(@RequestBody LogRequest request) {
        System.out.println("Received number: " + request.getNumber());
    }

    static class LogRequest {
        private int number;

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }
    }
}
