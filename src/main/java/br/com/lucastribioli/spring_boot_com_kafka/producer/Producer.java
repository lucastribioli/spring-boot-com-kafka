package br.com.lucastribioli.spring_boot_com_kafka.producer;

import lombok.*;
import org.slf4j.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.*;
import org.springframework.stereotype.*;

@Service
@RequiredArgsConstructor
public class Producer {
    private Logger log = LoggerFactory.getLogger(Producer.class);

    @Value("${topic.name}")
    private String topicName;

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String message) {
        log.info("Producing message: " + message);
        kafkaTemplate.send(topicName, message);
    }
}
