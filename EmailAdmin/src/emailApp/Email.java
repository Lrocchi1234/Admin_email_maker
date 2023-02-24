package emailApp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private int defaultPasswordLength = 10;
	private String alternateEmail;
	private String companySuffix;

	// Construct to receive first name and last name

	public Email(String firstName, String lastName,String companySuffix) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.companySuffix = companySuffix;

		// Call a method asking for the department - return the department
		this.department = setDepartment();

		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password is: " + this.password);

		// Combine elements to generate email

		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix + ".com";

	}

	// Ask for the department
	private String setDepartment() {
		System.out.println(
				"New Worker: "+ firstName + " -Department Codes\n1 for Sales\n2 for Department\n3 for Accounting\n0 for none\n Enter Department Code: ");
		Scanner sc = new Scanner(System.in);
		int depChoice = sc.nextInt();
		if (depChoice == 1) {
			return "Sales";

		} else if (depChoice == 2) {
			return "dev";

		} else if (depChoice == 3) {
			return "account";
		} else {
			return "";
		}
	}

// Generate random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWZYZ012345678910!@#%";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}

// Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;

	}

// Set the alternative email
	public void setAltEmial(String altEmail) {
		this.alternateEmail = altEmail;
	}

// change the password
	public void changePassword(String password) {
		this.password = password;
	}

	public int getMailbocCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

	public String showInfo() {
		return "Display Name: " + firstName + " " + lastName + "\nCompany Email: " + email + "\nMailbox Capacity: "
				+ mailboxCapacity + "mb";
	}
}
