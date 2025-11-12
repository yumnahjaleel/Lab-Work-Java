//5. Create an interface Device with a method powerOn().
// Create another interface SmartDevice that extends Device and adds a method connectWiFi().
// Create a class SmartPhone that implements SmartDevice.
// Demonstrate calling both powerOn() and connectWiFi() using a SmartPhone object in the main() method.
interface Device{
    void powerOn();
}
interface SmartDevice extends Device{
    void connectWiFi();
}
class SmartPhone implements SmartDevice{
    public void powerOn(){
        System.out.println("power is on");
    }
    @Override
    public void connectWiFi() {
        System.out.println("Connected to wifi");
    }
}
public class W11Q5 {
    public static void main(String[] args) {
        SmartPhone n=new SmartPhone();
        n.powerOn();
        n.connectWiFi();
    }
}
