public class Main {
	public static void main(String[] args) {
		NormalUser normalUser = new NormalUser("John", "413avc", "egbertjohn@gmail.com",  true);
		RootUser rootUser = new RootUser("Dave", "612abc", "striderdave@gmail.com",  true);

		rootUser.trackUserActivitie(normalUser);

	}
}
