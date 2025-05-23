package vault;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Bismaya Mohapatra
 */
@ConfigurationProperties("config")
public class Configuration {

	private String username;

	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
