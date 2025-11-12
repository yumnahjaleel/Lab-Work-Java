import java.sql.SQLOutput;

//4. Create two interfaces Printer and Scanner, both having methods connect() and details() (details() is a default method).
// Create a class MultiFunctionMachine that implements both interfaces.
// In MultiFunctionMachine, override the details() method to resolve ambiguity and call the details() methods of both interfaces.
// Call all methods of MultiFunctionMachine in the main() method.
interface Printer{
    void connect();
    default void details(){
        System.out.println("Printer");
    }
}
interface Scanner{
    void connect();
    default void details(){
        System.out.println("Scanner");
    }
}
class MultiFunctionMachine implements Printer, Scanner{
    public void connect(){
        System.out.println("Connected to both");
    }
    public void details(){
        Printer.super.details();
        Scanner.super.details();
        System.out.println("Multi-Function Machine");
    }
}
public class W11Q4 {
    public static void main(String[] args) {
        MultiFunctionMachine m=new MultiFunctionMachine();
        m.connect();
        m.details();
    }
}
