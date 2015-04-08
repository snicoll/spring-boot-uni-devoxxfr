package hello;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("hello")
public class HelloProperties {

	/**
	 * Prefix of the welcome message.
	 */
	private String prefix = "Hello";

	/**
	 * Target of the welcome message.
	 */
	private String target = "World";

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}
}
