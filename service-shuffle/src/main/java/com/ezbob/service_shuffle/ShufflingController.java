package com.ezbob.service_shuffle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/shuffle")
public class ShufflingController {

    @Autowired
    private LoggingService loggingService;

    @PostMapping
    public ResponseEntity<List<Integer>> shuffleArray(@RequestParam int number) {
        if (number < 1 || number > 1000) {
            return ResponseEntity.badRequest().build();
        }

        List<Integer> array = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            array.add(i);
        }
        Collections.shuffle(array);

        loggingService.logRequest(number);

        return ResponseEntity.ok(array);
    }
}
