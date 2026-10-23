import java.util.Scanner;

class Student {
    int rollNo;
    String name;

    void getStudentDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll Number:");
        rollNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Student Name:");
        name = sc.nextLine();
    }

    void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Student Name: " + name);
    }
}

class Marks extends Student {
    int mark1, mark2, mark3, mark4, mark5;

    void getMarks() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks for Subject 1:");
        mark1 = sc.nextInt();

        System.out.println("Enter marks for Subject 2:");
        mark2 = sc.nextInt();

        System.out.println("Enter marks for Subject 3:");
        mark3 = sc.nextInt();

        System.out.println("Enter marks for Subject 4:");
        mark4 = sc.nextInt();

        System.out.println("Enter marks for Subject 5:");
        mark5 = sc.nextInt();
    }
}

class Result extends Marks {
    int total;
    double average;
    char grade;

    void calculateResult() {
        total = mark1 + mark2 + mark3 + mark4 + mark5;
        average = total / 5.0;

        if (average >= 90)
            grade = 'A';
        else if (average >= 75)
            grade = 'B';
        else if (average >= 60)
            grade = 'C';
        else if (average >= 50)
            grade = 'D';
        else
            grade = 'F';
    }

    void displayResult() {
        displayStudentDetails();

        System.out.println("Subject 1: " + mark1);
        System.out.println("Subject 2: " + mark2);
        System.out.println("Subject 3: " + mark3);
        System.out.println("Subject 4: " + mark4);
        System.out.println("Subject 5: " + mark5);

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Result r = new Result();

        r.getStudentDetails();
        r.getMarks();
        r.calculateResult();
        r.displayResult();
    }
}