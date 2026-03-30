class Account {
    int no; double bal; static String bank="National Bank";
    Account(int n,double b){no=n;bal=b;}
    double calcInterest(){return 0;}
}
class Savings extends Account {
    Savings(int n,double b){super(n,b);}
    double calcInterest(){return bal*0.04;}
}
public class Bank {
    public static void main(String[] a){
        Account acc=new Savings(101,10000);
        System.out.println(Account.bank+" Interest:"+acc.calcInterest());
    }
}