import java.util.*;
public class predefinedexception{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        try{
            System.out.print("Enter age:");
            String age = s.nextLine();
            int a = Integer.parseInt(age);
            int result = 10/0;
            System.out.println("Age=" + a);
        }
        catch (NumberFormatException e) {
            System.out.println("Invalid age entered");
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception:"+e);
            
        }
    }
}