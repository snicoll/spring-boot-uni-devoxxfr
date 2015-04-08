package hello;

import org.springframework.beans.factory.annotation.Autowired;

public class ConsoleHelloService implements HelloService {

	@Autowired
	private HelloProperties properties;

	@Override
	public void sayHello() {
		System.out.println(this.properties.getPrefix()
				+ " " + this.properties.getTarget());
	}
}
