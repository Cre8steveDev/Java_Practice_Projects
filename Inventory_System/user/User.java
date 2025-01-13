package user;

import java.io.*;

import enumTypes.Status;

public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	private String username;
	private String password;
	private Status status;

	public User(String username, String password, Status status) {
		this.username = username;
		this.password = password;
		this.status = status;
	}

	// Getters and setters
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

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	// Static method to serialize a User object
	public static void serialize(User user, String filename) throws IOException {
		try (FileOutputStream fileOut = new FileOutputStream(filename);
				ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
			out.writeObject(user);
		}
	}

	// Static method to deserialize a User object
	public static User deserialize(String filename) throws IOException, ClassNotFoundException {
		try (FileInputStream fileIn = new FileInputStream(filename);
				ObjectInputStream in = new ObjectInputStream(fileIn)) {
			return (User) in.readObject();
		}
	}
}