package br.com.lucastribioli.spring_boot_com_kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.*;

@EnableKafka
@SpringBootApplication
public class SpringBootComKafkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootComKafkaApplication.class, args);
	}

}
