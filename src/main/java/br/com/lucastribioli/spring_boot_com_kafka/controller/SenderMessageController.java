package br.com.lucastribioli.spring_boot_com_kafka.controller;

import br.com.lucastribioli.spring_boot_com_kafka.producer.*;
import lombok.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class SenderMessageController {

    private final Producer producer;

    @PostMapping("/send")
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        producer.sendMessage(message);
        return ResponseEntity.ok("Message sent: " + message);
    }
}
