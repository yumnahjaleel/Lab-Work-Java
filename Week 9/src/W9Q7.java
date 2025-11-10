//Create a class Employee with data members: name, salary, and a method showDetails().
// Create a class Manager that extends Employee with an additional data member department.
// Override the showDetails() method in Manager to display all details, including department.
// Create an object of Manager and call showDetails().

class Employee{
    String name;
    double salary;

    Employee(String n, double s){
        this.name=n;
        this.salary=s;
    }

    void showDetails(){
        System.out.println("Name of the employee is "+name);
        System.out.println("Salary of the employee is "+salary);
    }
}
class Manager extends Employee{
    String department;

    Manager(String n, double s, String d){
        super(n,s);
        this.department=d;
    }

    void showDetails(){
        System.out.println("Name of the employee is "+name);
        System.out.println("Salary of the employee is "+salary);
        System.out.println("Department of the employee is "+department);
    }
}

public class W9Q7 {
    public static void main(String[] args) {
        Manager M = new Manager("Yumnah", 20000,"IT");
        M.showDetails();
    }
}
