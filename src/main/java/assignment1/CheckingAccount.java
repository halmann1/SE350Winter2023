package assignment1;

public class CheckingAccount extends BankAccount{

    private double overdraftLimit;

    public CheckingAccount(int accountNumber, String accountHolderName, double balance, AccountType accountType, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance, accountType);//call the superclass constructor
        this.overdraftLimit = overdraftLimit; //init the overdraft limit
    }

    @Override
    public double withdraw(double x) throws insufficentFunds{ //setter for balance decrease
        if (x > balance || x > overdraftLimit){//looked up what overdraftlimit and that is my understanding of it (the guidline was not clear)
            throw new insufficentFunds("withdrawl not allowed");
        }else{
            return super.withdraw(x);//reuse the superclass withdraw() method after attaching the above checking lines of code
        }
    }

    public double displayOverdraftLimit(){
        //getter for the overdraftlimit instance
        return this.overdraftLimit;
    }
    

}
