import java.util.*;
public class str_operations {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Programming";
        System.out.println("Length:"+str1.length());
        System.out.println("Uppercase:"+str1.toUpperCase());
        System.out.println("Lowercase:"+str2.toLowerCase());
        System.out.println("Concatenation"+str1.concat(""+str2));
        System.out.println("Character at index 2:" + str1.charAt(2));
        System.out.println("Equal:" + str1.equals("Java"));
        System.out.println("Contains 'gram':" + str2.contains("gram"));
        System.out.println("Replace:" + str1.replace('J', 'k'));
        System.out.println("Substrinng:"+ str2.substring(3,8));
        System.out.println("Index:"+str2.indexOf("o"));
    }
}