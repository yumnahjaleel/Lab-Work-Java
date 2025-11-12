//2. In the previous question, create a new method in Account interface- takeLoan() (takeLoan() is a default method).
// takeLoan() method would be implemented by Saving class only.
// Call the methods of Saving and Current classes in main method.
interface AccountQ2{
    void deposit();
    void withdraw();
    default void takeLoan(){
        System.out.println("Loan Taken");
    }
    static void aboutBank(){
        System.out.println("Bank Account");
    }
}
class Savings2 implements AccountQ2{
    public void deposit(){
        System.out.println("Amount deposited in savings account.");
    }
    public void withdraw(){
        System.out.println("Amount withdrawn in savings account.");
    }
    public void takeLoan(){
        System.out.println("Loan Taken");
    }
}
class Current2 implements AccountQ2{
    public void deposit(){
        System.out.println("Amount deposited in current account.");
    }
    public void withdraw(){
        System.out.println("Amount withdrawn in current account.");
    }
}
public class W11Q2 {
    public static void main(String[] args) {
        Account.aboutBank();
        Savings2 s = new Savings2();
        s.deposit();
        s.withdraw();
        s.takeLoan();

        Current2 c = new Current2();
        c.deposit();
        c.withdraw();
    }
}
