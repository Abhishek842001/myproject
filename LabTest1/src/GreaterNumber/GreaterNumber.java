package GreaterNumber;

public class GreaterNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10;
		int n2 =20;
		int n3 =30;
		if(n1>=n2) {
			if(n1>=n3) { 
				System.out.println(n1 +" is largest number");
			} 
			else {
				System.out.println(n3 +"is largest number");
		        } 
		}
	else {
			if(n2>=n3) {
				System.out.println(n2 +" is  largest number");
			} else {
				System.out.println(n3 +" is largest number");
			}
		}

	}

}
