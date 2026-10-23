interface Student {
    void displayStudent();
}

interface Marks {
    void displayMarks();
}

class Result implements Student, Marks {

    String name;
    int rollNo;
    int mark1, mark2, mark3, mark4, mark5;

    Result(String name, int rollNo, int mark1, int mark2,
           int mark3, int mark4, int mark5) {

        this.name = name;
        this.rollNo = rollNo;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
        this.mark5 = mark5;
    }

    public void displayStudent() {
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Student Name: " + name);
    }

    public void displayMarks() {
        System.out.println("Subject 1: " + mark1);
        System.out.println("Subject 2: " + mark2);
        System.out.println("Subject 3: " + mark3);
        System.out.println("Subject 4: " + mark4);
        System.out.println("Subject 5: " + mark5);
    }

    void calculateResult() {
        int total = mark1 + mark2 + mark3 + mark4 + mark5;
        double average = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {

        Result r = new Result("Arun", 101, 85, 90, 78, 88, 84);

        System.out.println("----- STUDENT RESULT -----");

        r.displayStudent();

        System.out.println("\nMarks:");
        r.displayMarks();

        System.out.println();
        r.calculateResult();
    }
}