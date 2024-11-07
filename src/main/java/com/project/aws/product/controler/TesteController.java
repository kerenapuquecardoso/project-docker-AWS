package com.project.aws.product.controler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/teste")
public class TesteController {
    private static final Logger LOG = LoggerFactory.getLogger(TesteController.class);

    @GetMapping("/dog/{name}")
    public ResponseEntity<?> dogTest(@PathVariable String name) {
        LOG.info("Teste Dog name: {}", name);
        return ResponseEntity.ok("Dog name: " + name);
    }

}
