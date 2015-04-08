package demo.web;

import demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.*;
import static org.junit.Assert.*;

/**
 *
 * @author Stephane Nicoll
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
@WebIntegrationTest(randomPort = true)
public class HomeControllerIntegrationTest {


	@Value("${local.server.port}")
	private int port;

	@Test
	public void runAndInvokeHome() {
		String url = "http://localhost:" + port + "/";
		String body = new TestRestTemplate("hero", "hero").getForObject(url, String.class);
		assertThat(body, is("Hello devoxx"));
	}

}