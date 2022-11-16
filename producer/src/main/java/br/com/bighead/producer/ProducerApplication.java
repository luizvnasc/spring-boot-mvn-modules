package br.com.bighead.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bighead.modules.domain.dto.Message;

@SpringBootApplication(scanBasePackages = "br.com.bighead.producer")
@RestController
public class ProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}

	@GetMapping("/message")
	public Message produceMessage(){
		return new Message("hello world","greeting");
	}

}
