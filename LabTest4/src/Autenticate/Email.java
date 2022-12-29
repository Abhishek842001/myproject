package Autenticate;

import java.util.Scanner;

public class Email {
	public static void main(String args[]) {

		System.out.println("Enter the email");

		Scanner sc = new Scanner(System.in);

		String email1 = sc.nextLine();

		String regexPattern = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@"

		+ "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";



		try {

		if(!email1.matches(regexPattern))

		throw new Excep("Email is not Valid");

		System.out.println("Email is Valid");

		}catch(Excep e) {

		System.out.println(e.getMessage());

		}

		}


	

		// TODO Auto-generated method stub

	}
	
