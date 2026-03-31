abstract class BankAccount {
    private int accountNumber; private String holderName; private double balance;
    public BankAccount(int a,String h,double b){accountNumber=a; holderName=h; balance=b;}
    public void deposit(double amt){balance+=amt;}
    public void withdraw(double amt){balance-=amt;}
    public abstract double calculateInterest();
}
interface Loanable {void applyForLoan(); boolean calculateLoanEligibility();}
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(int a,String h,double b){super(a,h,b);}
    public double calculateInterest(){return 0.04*10000;}
    public void applyForLoan(){System.out.println("Loan applied");}
    public boolean calculateLoanEligibility(){return true;}
}