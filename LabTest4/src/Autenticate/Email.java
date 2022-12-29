package Autenticate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Scanner;

public class Email {
	public static void main(String[] args) {
		try {
	  Scanner sc = new Scanner(System.in);
      System.out.println("Enter your Email: ");
      String phone = sc.next();
      String regex = "^(.+)@(.+)$";  
      //Compile regular expression to get the pattern  
      Pattern pattern = Pattern.compile(regex);   
      if(){  
          //Create instance of matcher   
          Matcher matcher = pattern.matcher(email);  
          System.out.println(email +" : "+ matcher.matches()+"\n");  
      }  
                
		}
	}
}

