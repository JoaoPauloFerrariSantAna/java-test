public class User {
	private String username;
	private String password;
	private String email;
	private boolean isActive;

	public User(String username, String password, String email, boolean isActive) {
		this.username = username;
		this.password = password;
		this.email = email;
		this.isActive = isActive;
	}

	public void makePost() {}

	public boolean getIsActive() { return this.isActive; }

	public String getUsername() { return this.username; }

	public String getPassword() { return this.password; }

	public String getEmail() { return this.email; }
}
