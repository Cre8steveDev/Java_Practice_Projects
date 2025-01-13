// The Driver File for the Application 

import java.util.Scanner;
import ui.UserInterface;

public class MainApp {
	private static int numberOfRuntime = 0;
	private static String superAdminUsername = "Cre8steve";
	private static String superAdminPassword = "123456789";

	private static String testUsername = "Tester";
	private static String testPassword = "123456789";

	public static boolean runApplication = true;

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Number of Boot up time(s): " + numberOfRuntime + "\n\n");

		// Begin Application loop
		while (runApplication) {

			int menuAction = 3;

			UserInterface.printNameHeader();
			UserInterface.printHomeActionMenu();

			if (menuAction == 1) {
				String adminUsername = null;
				String adminPassword = null;

				System.out.print("Enter your username: ");
				adminUsername = scn.nextLine();

				System.out.print("Enter your password: ");
				adminPassword = scn.nextLine();

				if (!checkAdminAccess(adminUsername, adminPassword))
					runApplication = false;

				// Initialize Inventory Service Action
				UserInterface.printNotification(UserInterface.Message.WELCOME);

			} else if (menuAction == 2) {
				String username = null;
				String password = null;

				String newUserName = null;
				String newPassword = null;

				System.out.print("Enter SuperAdmin username: ");
				username = scn.nextLine();

				System.out.print("Enter SuperAdmin password: ");
				password = scn.nextLine();

				if (!checkUserAccess(username, password))
					runApplication = false;

				UserInterface.printSignUpHeader();

				System.out.print("Enter new username: ");
				newUserName = scn.nextLine();

				System.out.print("Enter new password: ");
				newPassword = scn.nextLine();

				System.out.println("Username: " + newUserName);
				System.out.println("Password: " + newPassword);
			} else {
				runApplication = false;
			}

		}

		scn.close();

	}

	public static boolean checkAdminAccess(String adminUsername, String adminPassword) {
		boolean isAuthorized = adminUsername.equals(superAdminUsername) && adminPassword.equals(superAdminPassword);

		if (!isAuthorized)
			System.out.println("Invalid login credentials");

		return isAuthorized;
	}

	public static boolean checkUserAccess(String username, String password) {
		boolean isAuthorized = testUsername.equals(username) && testPassword.equals(password);

		if (!isAuthorized)
			System.out.println("Invalid login credentials");

		return isAuthorized;

	}
}