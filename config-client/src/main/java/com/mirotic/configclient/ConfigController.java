package com.mirotic.configclient;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ConfigController {

    private final ConfigProperties configProperties;

    @GetMapping("/config")
    public ResponseEntity config() {
        return ResponseEntity.ok(configProperties.getMessage());
    }
}
