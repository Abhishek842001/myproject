package MyEmployee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Ram", 15, "1313446131", "mumbai", 25631.5, "CSE");
        Manager manager = new Manager("Ajay", 30, "454823131", "Delhi", 69586.5, "ECE");
        employee.printSalary();
        manager.printSalary();
        manager.print();
        employee.print();
    }
}
