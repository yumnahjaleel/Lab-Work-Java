//Create two children of Account- Saving (Data Members- Min_balance;Methodsdisplay(), deposit(), withdraw())
//and Current (Data Members- Max_withdrawl_limit; Methods-display(),deposit(), withdraw()) .
//Create constructors for both classes. Implementation of deposit() and withdraw() should be specific to Saving and Current class.
//Create objects of Saving and Current class and display them.

class ACCOUNT{
    double balance;

    ACCOUNT(double b){
        this.balance=b;
    }
}
class SAVING extends ACCOUNT{
    double MinBalance;

    SAVING(double b,double MinB){
        super(b);
        this.MinBalance=MinB;
    }

    void display(){
        System.out.println("Balance: "+balance);
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Amount deposited to saving account.");
    }
    void withdraw(double amount){
        balance-=amount;
        System.out.println("Amount Withdrawn  to saving account.");
    }
}

class CURRENT extends ACCOUNT{
    double MaxWithdrawlLimit;

    CURRENT(double b, double MaxWlimit){
        super(b);
        this.MaxWithdrawlLimit=MaxWlimit;
    }
    void display(){
        System.out.println("Amount withdrawn.");
    }
    void deposit(double amount){
        balance+=amount;
        System.out.println("Amount deposited to current account");
    }
    void withdraw(double amount){
        balance-=amount;
        System.out.println("Amount Withdrawn to current account");
    }
}

public class W9Q5 {
    public static void main(String[] args) {
        SAVING S = new SAVING(4002.49,1000);
        S.deposit(100);
        S.withdraw(99.3);
        S.display();

        System.out.println();

        CURRENT C = new CURRENT(50000.345,5000);
        C.deposit(300);
        C.withdraw(3999.02);
        C.display();

    }
}
