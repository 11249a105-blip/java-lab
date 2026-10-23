class Student {
    String name;
    int rollno;
    int marks;

    Student(String n, int r, int m) {
        name = n;
        rollno = r;
        marks = m;
    }

    void showDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Roll No: " + rollno);
        System.out.println("Student Marks: " + marks);

        if (marks >= 90)
            System.out.println("Grade: A");
        else if (marks >= 70)
            System.out.println("Grade: B");
        else if (marks >= 60)
            System.out.println("Grade: C");
        else
            System.out.println("Fail");
    }

    public static void main(String[] args) {
        Student s1 = new Student("chakri", 105, 96);
        Student s2 = new Student("anu", 11, 80);

        s1.showDetails();
        System.out.println();
        s2.showDetails();
    }
}