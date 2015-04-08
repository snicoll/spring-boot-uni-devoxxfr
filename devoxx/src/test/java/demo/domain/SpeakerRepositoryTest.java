package demo.domain;

import demo.DemoApplication;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 *
 * @author Stephane Nicoll
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = DemoApplication.class)
public class SpeakerRepositoryTest {

	@Autowired
	private SpeakerRepository repository;

	@Test
	public void testFindByTwitter() throws Exception {
		Speaker dave = repository.save(new Speaker("Dave", "Syer", "david_syer"));
		assertThat(repository.findByTwitter("david_syer").getId(), is(dave.getId()));
	}
}