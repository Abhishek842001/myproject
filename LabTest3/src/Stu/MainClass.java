package Stu;

public class MainClass {

	public static void main(String[] args) {
		String[] student1 = {"physics","Chemistry"};
		String[] student2 = {"python","Java"};
		Student s1  = new Student("Abhayjit",26,"824572829","204543",student1);
		Student s2  = new Student("Aman",25,"892394343","435345",student2);
		s1.print();
		s2.print();

	}
	}


