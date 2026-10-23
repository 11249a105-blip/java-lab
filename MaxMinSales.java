import java.util.*;
public class MaxMinSales {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] sales = new int[12];
        System.out.println("Enter 12 monthly sales:");
        for (int i = 0;i<12;i++) {
            sales[i] = s.nextInt();
        }
        int max = sales[0];
        int min = sales[0];
        for (int i=1;i<12;i++) {
            if (sales[i]>max)
                max = sales[i];
         if (sales[i]<min)
            min = sales[i];
        }
        System.out.println("Highest Sales = " + max);
        System.out.println("Lowest sales = "+min);
    }
}


