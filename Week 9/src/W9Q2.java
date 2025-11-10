class University{
    String name;
    int ranking;
}

class Faculty extends University{
    String name;

    void details() {
        System.out.println("Faculty name: "+this.name);
    }
}

class Department extends Faculty{
    String name;
    String chairman;

    void details() {
        System.out.println("Department: "+this.name);
        System.out.println("Chairman name: "+this.chairman);
    }

    void display() {
        super.details();
        details();
    }
}

public class W9Q2 {
    public static void main(String[] args) {
        Department d = new Department();

        ((University)d).name = "Aligarh Muslim University";
        ((Faculty)d).name = "Faculty of Science";
        d.name = "Computer Science";
        d.ranking = 5;
        d.chairman = "Prof. Arman Rasool Faridi";

        System.out.println("University: "+((University)d).name);
        System.out.println("Ranking: "+((University)d).ranking);
        d.display();
    }
}

