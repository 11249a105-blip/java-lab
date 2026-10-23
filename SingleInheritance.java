import java.util.*;

class Employee {
    int empId;
    String name;
    double basicSalary;

    void getDetails() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Employee Id:");
        empId = s.nextInt();
        s.nextLine();

        System.out.println("Enter Employee Name:");
        name = s.nextLine();

        System.out.println("Enter Basic Salary:");
        basicSalary = s.nextDouble();
    }

    void display() {
        System.out.println("Employee Id: " + empId);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
    }
}

class PermanentEmployee extends Employee {
    double hra, da, grossSalary;

    void calculateSalary() {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter HRA:");
        hra = s.nextDouble();

        System.out.println("Enter DA:");
        da = s.nextDouble();

        grossSalary = basicSalary + hra + da;
    }

    void showSalary() {
        display();
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Salary: " + grossSalary);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        PermanentEmployee p = new PermanentEmployee();

        p.getDetails();
        p.calculateSalary();
        p.showSalary();
    }
}