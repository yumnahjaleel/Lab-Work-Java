//Week 10 question 7
//Create class University which has data members- name and ranking.
//Create class Faculty that extends University class has data member- name and method- Details().
//Create a new class Department which is derived from Faculty and has data member- name, chairman
//and method- Details() and Display() where Display() method calls Details() methods of both Faculty and Department class in its body.
//Create an object of Department class to Display() method and University ranking.

// Base class
class University {
    String universityName;
    int ranking;
}

// Derived class 1
class Faculty extends University {
    String facultyName;

    void Details() {
        System.out.println("Faculty Name: " + facultyName);
    }
}

// Derived class 2 (multilevel inheritance)
class Department extends Faculty {
    String departmentName;
    String chairman;

    void Details() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Chairman: " + chairman);
    }

    void Display() {
        System.out.println("=== Faculty Details ===");
        super.Details(); // Calls Faculty class Details()
        System.out.println("=== Department Details ===");
        this.Details();  // Calls Department class Details()
    }
}

// Main class
public class W10Q6 {
    public static void main(String[] args) {
        Department dept = new Department();

        // Setting data
        dept.universityName = "Aligarh Muslim University";
        dept.ranking = 1;
        dept.facultyName = "Faculty of Science";
        dept.departmentName = "Department of Computer Science";
        dept.chairman = "Dr. A. Khan";

        // Display details
        dept.Display();

        // Display University ranking
        System.out.println("\nUniversity Ranking: " + dept.ranking);
    }
}



