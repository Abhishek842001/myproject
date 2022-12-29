package Duplicate;

import java.util.Scanner;

public class MyString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:-");
		String str1 = sc.next();
		
	      char[] c = str1.toCharArray();
	      System.out.println("The string is:" + str1);
	      System.out.print("Duplicate Characters in above string are: ");
	      for (int i = 0; i < str1.length(); i++) {
		         for (int j = i + 1; j < str1.length(); j++) {
		            if (c[i] == c[j]) {
		               System.out.print(c[j] + " ");
		               break;
		            }
	     
	}

}
	}
}
	
