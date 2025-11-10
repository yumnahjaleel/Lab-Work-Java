//week 10 question 4
public class ObjectOriented {
    void abstraction() {
        System.out.println("Abstraction: Hiding internal details and showing only functionality.");
    }

    void polymorphism() {
        System.out.println("Polymorphism: One name, many forms (method overloading & overriding).");
    }

    void inheritance() {
        System.out.println("Inheritance: Deriving new classes from existing ones.");
    }

    void encapsulation() {
        System.out.println("Encapsulation: Binding data and methods into a single unit (class).");
    }

    public static void main(String[] args) {
        ObjectOriented obj = new ObjectOriented();
        obj.abstraction();
        obj.polymorphism();
        obj.inheritance();
        obj.encapsulation();
    }

}
