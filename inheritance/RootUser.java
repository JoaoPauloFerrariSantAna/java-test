import java.util.ArrayList;

public class RootUser extends User {
	private String username;
	private String password;
	private String email;
	private boolean isActive;
	private ArrayList<NormalUser> watchList;

	public RootUser(String username, String password, String email, boolean isActive) {
		super(username, password, email, isActive);
		this.watchList = new ArrayList<NormalUser>();
	}

	@Override
	public void makePost() {
		System.out.println("Making a moderation post...");
	}

	public void trackUserActivitie(NormalUser user) {
		System.out.println("Adding user " +user.getUsername()+ " to list");
		this.watchList.add(user);
	}
}
