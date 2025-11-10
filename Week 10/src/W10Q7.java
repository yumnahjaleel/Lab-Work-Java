import java.util.Scanner;

//Create a class Employee (Data Members – empName, empId). Create two member inner classes:
// •Salary (Data Members – basic, hra, pf; Method – displaySalary() to print salary details).
// •JoiningDate (Data Members – day, month, year; Method – displayJoiningDate() to print joining date).
//In the Employee class, create a method displayEmployee() that prints the employee’s name, ID, salary details, and joining date.

//the displayEmployee() method calls both inner class methods to show full details.
//Member inner classes (Salary and JoiningDate) belong to an instance of Employee.

class Employee {
    String empName;
    int empId;

    // Constructor to initialize employee details
    Employee(String name, int id) {
        this.empName = name;
        this.empId = id;
    }

    // Inner class for Salary details
    class Salary {
        double basic, hra, pf;

        Salary(double basic, double hra, double pf) {
            this.basic = basic;
            this.hra = hra;
            this.pf = pf;
        }

        void displaySalary() {
            System.out.println("\nSalary Details:");
            System.out.println("Basic: " + basic);
            System.out.println("HRA: " + hra);
            System.out.println("PF: " + pf);
            double total = basic + hra - pf;
            System.out.println("Net Salary: " + total);
        }
    }

    // Inner class for Joining Date details
    class JoiningDate {
        int day, month, year;

        JoiningDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }

        void displayJoiningDate() {
            System.out.println("Joining Date: " + day + "/" + month + "/" + year);
        }
    }

    // Method to display all employee details
    void displayEmployee(Salary salary, JoiningDate date) {
        System.out.println();
        System.out.println("Employee Details");
        System.out.println("Name: " + empName);
        System.out.println("ID: " + empId);
        salary.displaySalary();
        date.displayJoiningDate();
    }
}

public class W10Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input employee details
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();

        // Input salary details
        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        System.out.print("Enter HRA: ");
        double hra = sc.nextDouble();

        System.out.print("Enter PF: ");
        double pf = sc.nextDouble();

        // Input joining date
        System.out.print("Enter Joining Day: ");
        int day = sc.nextInt();

        System.out.print("Enter Joining Month: ");
        int month = sc.nextInt();

        System.out.print("Enter Joining Year: ");
        int year = sc.nextInt();

        // Create objects
        Employee emp = new Employee(name, id);
        Employee.Salary sal = emp.new Salary(basic, hra, pf);
        Employee.JoiningDate jd = emp.new JoiningDate(day, month, year);

        // Display all details
        emp.displayEmployee(sal, jd);

        sc.close();
    }
}

