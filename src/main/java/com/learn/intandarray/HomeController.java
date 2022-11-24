package com.learn.intandarray;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HomeController {

    @GetMapping("logging")
    public ResponseEntity<String> logTesting() {

        log.info("Hello spring boot gogo");
        log.warn("Warning from bose");
        log.debug("Debug bose bose");
        log.error("Default error momo");
        return ResponseEntity.ok("Hello");
    }
}
