//Create an interface Account having methods- deposit(), withdraw() and aboutBank() (abountBank() is a static method).
// Create two classes Saving and Current which implement the Account interface.
// Call the methods of Saving and Current classes in main method.
interface Account{
    void deposit();
    void withdraw();
    static void aboutBank(){
        System.out.println("Bank Account");
    }
}
class Savings implements Account{
    public void deposit(){
        System.out.println("Amount deposited in savings account.");
    }
    public void withdraw(){
        System.out.println("Amount withdrawn in savings account.");
    }
}
class Current implements Account{
    public void deposit(){
        System.out.println("Amount deposited in current account.");
    }
    public void withdraw(){
        System.out.println("Amount withdrawn in current account.");
    }
}
public class W11Q1 {
    public static void main(String[] args) {
        Account.aboutBank();
        Savings s = new Savings();
        s.deposit();
        s.withdraw();

        Current c = new Current();
        c.deposit();
        c.withdraw();
    }
}
