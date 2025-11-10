//Week 9 question 8

//Create an abstract class Appliance with data members brand, power and abstract methods turnOn() and turnOff().
//Create two derived classes WashingMachine and Refrigerator that provide their own implementations of turnOn() and turnOff().
//Create objects of WashingMachine and Refrigerator and call their methods.

abstract class Appliance{
    String brand;
    double power;

    abstract void turnOn();
    abstract void turnOff();
}
class WashingMachine extends Appliance{
    public void turnOn(){
        System.out.println("Washing Machine is turned on");
    }
    public void turnOff(){
        System.out.println("Washing Machine is turned off");
    }
}
class Refrigerator extends Appliance{
    public void turnOn(){
        System.out.println("Refrigerator is turned on");
    }
    public void turnOff(){
        System.out.println("Refrigerator is turned off");
    }
}
public class W9Q8{
    public static void main(String[] args) {
        WashingMachine w= new WashingMachine();
        w.turnOff();
        w.turnOn();

        System.out.println();

        Refrigerator r = new Refrigerator();
        r.turnOff();
        r.turnOn();
    }
}
