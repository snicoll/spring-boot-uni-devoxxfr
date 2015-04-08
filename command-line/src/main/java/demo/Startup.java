package demo;

import hello.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

@Service
public class Startup implements CommandLineRunner {

	private final HelloService helloService;

	@Autowired
	public Startup(HelloService helloService) {this.helloService = helloService;}

	@Override
	public void run(String... strings) throws Exception {
		helloService.sayHello();
	}
}
