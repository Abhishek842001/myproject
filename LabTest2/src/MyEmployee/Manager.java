package MyEmployee;

public class Manager extends DataMember{
    private String department;

    public Manager(String name, int age, String phoneNumber,
                    String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }
    public void print() {
    	super.printInfo();
    	System.out.println("Department :"+department);
    }
   
}



