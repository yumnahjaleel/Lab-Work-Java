import java.util.Scanner;

//Create a class Student with data members rollNo, name, marks. Add a static variable schoolName.
// Create static method changeSchoolName() to update schoolName.
// Demonstrate how the static variable is shared among all objects.
class Student{
    String name;
    int rollno;
    double marks;
    static String schoolName;

    Student(String n, int rno,double m ){
        System.out.println("Details:");
        this.name=n;
        this.rollno=rno;
        this.marks=m;
    }
    // Static method to change school name
    static void changeSchoolName(String newName) {
        schoolName=newName;

    }

    void display(){
        System.out.println("Details of student\nName of student: "+name);
        System.out.println("Roll Number: "+rollno);
        System.out.println("marks: "+marks);
        System.out.println("School name: "+schoolName);
    }
}
public class W9Q10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter school name: ");
        String schooln=s.nextLine();
        Student.changeSchoolName(schooln);

        System.out.print("Enter name of student: ");
        String n=s.nextLine();

        System.out.print("Enter roll number: ");
        int r=s.nextInt();

        System.out.print("Enter marks: ");
        double m=s.nextDouble();

        Student S =new Student(n,r,m);

        S.display();
        s.close();
    }
}
