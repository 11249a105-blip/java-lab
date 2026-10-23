import java.util.Scanner;
public class switch_case {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("ATM Menu");
System.out.println("1.Check Balance");
System.out.println("2.Withdraw Cash");
System.out.println("3.Exit");
System.out.println("Enter your choice:");
int choice = sc.nextInt();
 switch (choice) {
    case 1:
        System.out.println("Your Balance is rs.5000" );
        break;
    case 2:
        System.out.println("Cash withdrawn successfully");
        break;
    case 3:
        System.out.println("Thank You! Visit Again.");
        break;
    default:
        System.out.println("Invalid Choice");

 }
sc.close();
    }
}



















































