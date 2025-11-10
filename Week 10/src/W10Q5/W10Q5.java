package W10Q5;

// Parent class
class ObjectOriented {
    void abstraction() {
        System.out.println("Abstraction allows hiding implementation details.");
    }

    void polymorphism() {
        System.out.println("Polymorphism allows methods to behave differently based on the object.");
    }

    void inheritance() {
        System.out.println("Inheritance allows one class to acquire properties of another.");
    }
}

// Child class 1
class JavaLanguage extends ObjectOriented {
    void persistence() {
        System.out.println("Persistence in Java is achieved through JDBC and Hibernate.");
    }

    void interfaces() {
        System.out.println("Interfaces in Java support multiple inheritance.");
    }
}

// Child class 2
class Cpp extends ObjectOriented {
    void template() {
        System.out.println("Templates in C++ enable generic programming.");
    }

    void friendFunction() {
        System.out.println("Friend functions in C++ can access private members of a class.");
    }
}

// Main class
public class W10Q5 {
    public static void main(String[] args) {

        System.out.println("=== JavaLanguage Class Object ===");
        JavaLanguage java = new JavaLanguage();
        java.abstraction();
        java.polymorphism();
        java.inheritance();
        java.persistence();
        java.interfaces();

        System.out.println("\n=== Cpp Class Object ===");
        Cpp cpp = new Cpp();
        cpp.abstraction();
        cpp.polymorphism();
        cpp.inheritance();
        cpp.template();
        cpp.friendFunction();
    }
}


