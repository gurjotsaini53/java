package Mutlithreading.implicitSynchronization;

public class Main {


    /*
      Account
      > Deposit



     */
    public static void main(String[] args) {

        Transaction objT = new Transaction();
        double amountToDeposit =100;
        double amountToWithdraw = 500;

        Deposit objDT = new Deposit(objT,amountToDeposit) ; /// husband
        Withdrawal objWT = new Withdrawal(objT,amountToWithdraw); // with

        Thread husband = new Thread(objDT);
        Thread wife = new Thread(objWT);

        wife.start();
        husband.start();
    }



}
