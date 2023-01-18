package assignment1;

import assignment1.BankAccount.AccountType;
import assignment1.BankAccount.insufficentFunds;

public class BankAccountTest {
    public static void main(String[] args) throws insufficentFunds{
        BankAccount accounty = new BankAccount(12345, "John Doe", 1000, AccountType.SAVING);

        accounty.deposit(2000);                         //test deposit method
        System.out.println(accounty);                       //test toString()
        System.out.println("\nBefore first withdrawl ^ ");      

        accounty.withdraw(2500);                            //test withdraw
        System.out.println(accounty.getAccountInfo());          //test getAccountInfo()
        System.out.println("\nAfter first withdrawl ^ ");       

       // accounty.withdraw(550);             //try over-withdrawing (will throw the error)
       // System.out.println(accounty);

        BankAccount accounty2 = new BankAccount(2345, "Hassan", 90, AccountType.CHECKING);

        System.out.println("balance after transfer attempt : " + accounty.transfer(300, accounty2));

        System.out.println(accounty2);

        //should throw insufficentFunds
        //System.out.println("\n attempt the same transfer with insufficent funds\n");
        //System.out.println("balance after transfer attempt : " + accounty.transfer(300, accounty2));

        //System.out.println(accounty2);

        CheckingAccount Chucky = new CheckingAccount(12345, "John Doe", 1000,
         AccountType.CHECKING, 200);

         System.out.println(Chucky);//should show balance 1000

         Chucky.withdraw(150);//should work normally -> balance = 850

         System.out.println(Chucky);

         Chucky.withdraw(300);//should throw exception

    }
}
