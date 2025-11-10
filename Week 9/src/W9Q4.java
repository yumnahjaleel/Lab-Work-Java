//. Create class Account (Data members- Id, Account_holder_name, Address; Methodsdeposit(), withdraw()).
// Declare deposit() and withdraw() as abstract methods.
// Declare Account class as abstract.
//(Create constructor in Account as well)
import java.util.Scanner;

abstract class Acc{
    String accHolderName;
    String address;
    int Id;
    int balance=4000;

    abstract void deposit(int amount);
    abstract void withdraw(int amount);

    Acc(String accHN,String a, int id) {
        System.out.println ("Account Created");
        this.accHolderName = accHN;
        this.address = a;
        this.Id = id;
    }
}
class Saving extends Acc{
    public void deposit(int amount){
        balance+=amount;
        System.out.println("Balance after deposit: "+balance);
    }
    public void withdraw(int amount){
        balance-=amount;
        System.out.println("Balance after withdrawl: "+balance);
    }
    Saving(String accHN,String a, int id){
        super(accHN,a,id);
    }
}
public class W9Q4 {
    public static void main(String[] args) {

        Saving S =new Saving("Yumnah","Delhi",112);

        S.deposit(100);
        S.withdraw(11);
    }
}
