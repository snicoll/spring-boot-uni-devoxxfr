package demo;

import hello.HelloService;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CommandLineApplication {

	//@Bean
	public HelloService myHelloService() {
		return () ->
			LoggerFactory.getLogger(CommandLineApplication.class).info("Hello from SLFJ");
	}

    public static void main(String[] args) {
        SpringApplication.run(CommandLineApplication.class, args);
    }
}
