//Create class Account (Data members- Id, Account_holder_name, Address; Methodsdeposit(), withdraw()).
// Create two static methods in Account calculateSimpleInterest() and calculateCompoundInterest() and implement them.
class Account{
    int id;
    String accHolder;
    String address;
    double balance;

    void deposit(double amount){
        balance+=amount;
        System.out.println(amount+" is deposited.");
    }

    void withdraw(double amount){
        if(amount>balance){
            System.out.println("invalid amount");
        }
        else{
            balance-=amount;
            System.out.println(amount+" is withdrawn.");
        }
    }

    static double simpleInterest(double p,double t, double r){
        return ((p*r*t)/100.0);
    }

    static double compoundInterest(double p, double t, double r){
        return (p * Math.pow((1 + r / 100.0), t) - p);
    }
}

public class W9Q3 {

    public static void main(String[] args) {
        Account a=new Account();
        a.id=50;
        a.accHolder="yumnah";
        a.address="Delhi";
        a.balance=15000;

        System.out.println("Details: \n"+a.id+", "+a.accHolder+" ,"+a.address);

        a.deposit(590);
        a.withdraw(202);
        System.out.println("left amount "+ a.balance);

        System.out.println(Account.simpleInterest(a.balance, 1 , 1.5));

        System.out.println(Account.compoundInterest(a.balance, 1 , 1.5));
    }

}
