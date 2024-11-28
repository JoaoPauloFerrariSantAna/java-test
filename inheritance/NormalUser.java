public class NormalUser extends User {
	private String username;
	private String password;
	private String email;
	private boolean isActive;

	public NormalUser(String username, String password, String email, boolean isActive) {
		super(username, password, email, isActive);
	}

	@Override
	public void makePost() {
		System.out.println("Making post...");
	}
}
