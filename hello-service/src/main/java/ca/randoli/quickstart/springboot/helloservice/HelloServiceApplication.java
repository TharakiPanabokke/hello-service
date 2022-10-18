package ca.randoli.quickstart.springboot.helloservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloServiceApplication {

	@Value("${greeting}")
	private String greeting;

	public static void main(String[] args) {
		SpringApplication.run(HelloServiceApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return greeting;
	}

  @GetMapping("/hello-world")
	public String helloWord() {
		return "Hello World";
	}

  @GetMapping("/oops")
	public String oops() {
		throw new UnsupportedOperationException("Oops");
	}
}
