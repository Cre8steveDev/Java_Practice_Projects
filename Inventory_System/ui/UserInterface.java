package ui;

public class UserInterface {

	public static enum Message {
		WELCOME, ACCOUNT_SUCCESS, INVALID_LOGIN
	}

	public static void printNameHeader() {
		System.out.println("===========================================");
		System.out.println("Welcome to Cre8steve Inventory Application");
		System.out.println("===========================================\n");
	}

	public static void printHomeActionMenu() {
		System.out.println("1.\t Access Admin Dashboard.");
		System.out.println("2.\t Create New User Account.");
		System.out.println("3.\t Exit Application.\n");
	}

	public static void printSignUpHeader() {
		System.out.println("==============================");
		System.out.println("New User Account Creation ");
		System.out.println("==============================");
	}

	public static void printNotification(Message messageType) {
		switch (messageType) {
			case WELCOME:
				System.out.println("Welcome to the Inventory Service.");
				break;

			case ACCOUNT_SUCCESS:
				System.out.println("User Account created Successfully.");
				break;

			default:
				break;
		}
	}
}
