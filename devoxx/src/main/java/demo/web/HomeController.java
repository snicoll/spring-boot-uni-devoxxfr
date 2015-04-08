package demo.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Value("${conference.name:devoxx}")
	private String conference;

	@Secured("ROLE_HERO")
	@RequestMapping("/")
	public String home() {
		return "Hello " + conference;
	}

}
