package assignment1;



public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    protected Double balance;
    private AccountType accountType;

    
    public BankAccount(int accountNumber, String accountHolderName, double balance, AccountType accountType){ 
        //inint constructor that initializes the instance vars, using the same names
        // but has the this. method to refer to the instance vars being the target of the assignment statements below
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        this.accountType = accountType;
    }


    class insufficentFunds extends Exception{ //custom error type for bank application
        private String errorMSG; //error message instance

        public insufficentFunds(String x){//init constructor
            super(x);
            this.errorMSG = x; 
        }

        public String getErrMsg(){//geter
            return errorMSG;
        }
    }


    enum AccountType { //account type using enum
        SAVING, CHECKING 
    }

    public double deposit(double x){ //setter for  balance increase
        balance+= x;
        return balance;
    }

    public double withdraw(double x) throws insufficentFunds{ //setter for balance decrease
        if(balance >= x){ //make sure there are sufficent funds
            balance -= x;
            return balance;
        }
        else{
            throw new insufficentFunds("cannot perform withdrawl");//in case the withdrawal could not be made
        }
    }

    public double transfer(double x,BankAccount destinationAccount)throws insufficentFunds {
        try{ //try catch to reuse withdraw() in this method
            this.withdraw(x);
            destinationAccount.deposit(x);
        }catch (Exception e) {
            throw new insufficentFunds("insufficent funds for ordered transfer");
        }
        return balance;//return balance either way
    }

    public String getAccountInfo(){//string representation of the class instance
        return String.format("\n Account Number: %d, Account Holder: %s, Account Type: %s, Balance: $%.3f",accountNumber,accountHolderName,
        accountType,balance);
    }
    public String toString(){//in case the user wanted to print an instance of the class we use the above representation
        return getAccountInfo();
    }



}
