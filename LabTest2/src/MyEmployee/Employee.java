package MyEmployee;
public class Employee extends DataMember {
    private String specialization;

    public Employee(String name, int age, String phoneNumber,
                    String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }
    public void print() {
    	super.printInfo();
    	System.out.println("Specialization:"+specialization);
    }
		// TODO Auto-generated method stub
		
	}

