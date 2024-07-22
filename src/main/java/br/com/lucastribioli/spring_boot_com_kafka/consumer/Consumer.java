package br.com.lucastribioli.spring_boot_com_kafka.consumer;


import lombok.*;
import org.apache.kafka.clients.consumer.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.*;
import org.springframework.stereotype.*;

@RequiredArgsConstructor
@Service
public class Consumer {

    @Value("${topic.name}")
    private String topicName;

    @KafkaListener(topics = "${topic.name}", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(ConsumerRecord<String, String> payload) {
        System.out.println("Topic: " + payload.topic());
        System.out.println("Headers: " + payload.headers());
        System.out.println("Partition: " + payload.partition());
        System.out.println("Value: " + payload.value());
    }
}
