package Mutlithreading.implicitSynchronization;

import com.sun.java.browser.plugin2.DOM;


/*
Serice class
 */
public class Transaction {

    private static final int delay = 5000;
    Account account ;

    public Transaction(){
        account = new Account();

    }

    public synchronized void  depositTransactionService(Double amount)
//    public void depositTransactionService(Double amount)
    {
        System.out.println("Before Deposit " + account.getBalance());

        Double balance = account.getBalance()+amount;
        account.setBalance(balance);

        try{
            Thread.sleep(delay);

        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("After Deposit : " + account.getBalance());

    }
    public synchronized void WithdrawalTransactionService(Double amount)

//    public  void WithdrawalTransactionService(Double amount)
    {
        System.out.println("Before withdrawal " + account.getBalance());

        Double balance = account.getBalance()-amount;
        account.setBalance(balance);

        try{
            Thread.sleep(delay);

        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }


        System.out.println("After Withdrawel : " + account.getBalance());
    }
}
