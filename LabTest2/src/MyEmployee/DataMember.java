package MyEmployee;

public class DataMember {
    private String name;
    private int age;
    private String phoneNumber;
    private String address;
    private double salary;

    public DataMember(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary " + salary);
    }
    public void printInfo() {
    	System.out.println("---Member Information");
    	System.out.println("Name:"+name);
    	System.out.println("Age: "+ age);
    	System.out.println("PhoneNumber :"+phoneNumber);
    	System.out.println("Address:"+address);
    	System.out.println("Salary :"+salary);
    }

		// TODO Auto-generated method stub
		
	}

