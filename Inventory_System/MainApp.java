// The Driver File for the Application 

import java.util.Scanner;

public class MainApp {
	private static int numberOfRuntime = 0;
	private static String adminUsername = "Cre8steve";
	private static String adminPassword = "123456789";

	public static void main(String[] args) {
		boolean runApplication = true;
		Scanner scn = null;

		System.out.println("Number of Boot up time(s): " + numberOfRuntime + "\n\n");

		// Begin Application loop
		while (runApplication) {

			System.out.println("===========================================");
			System.out.println("Welcome to Cre8steve Inventory Application");
			System.out.println("===========================================\n");

			String username = null;
			String password = null;
			scn = new Scanner(System.in);

			System.out.print("Enter your username: ");
			username = scn.nextLine();

			System.out.print("Enter your password: ");
			password = scn.nextLine();

			// Check for valid credentials
			if (!username.equals(adminUsername) || !password.equals(adminPassword)) {
				System.out.println("\nInvalid Login Credentials.");
				System.out.println("The application will terminate now. 😑\n");

				runApplication = false;

			}

		}

		scn.close();

	}
}