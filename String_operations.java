import java.util.*;
class String_operations {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter first employee name:");
        String emp1 = s.nextLine();
        System.out.println("Enter second employee name:");
        String emp2 = s.nextLine();
    
    if (emp1.equals(emp2)) {
        System.out.println("Both are from same department");
    }
    else {
        System.out.println("Both are from different department");
    }
}
}