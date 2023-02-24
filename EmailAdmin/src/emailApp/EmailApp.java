package emailApp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		System.out.println("Use _ Between first and last name");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First and Last name: ");
		String fName = sc.nextLine();
		String lName = sc.nextLine();
		System.out.println("Enter your Company Name: ");
		String companySuffix = sc.nextLine();
		Email em1 = new Email(fName , lName , companySuffix);
		System.out.println(em1.showInfo());
		
	}

}
