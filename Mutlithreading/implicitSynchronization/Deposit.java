package Mutlithreading.implicitSynchronization;

public class Deposit implements Runnable{
    private Double amount;
    private Transaction ObjT ;
    public Deposit(Transaction ObjT , Double amount)
    {
        this.ObjT = ObjT;
        this.amount = amount;

    }

    @Override
    public void run(){
        ObjT.depositTransactionService(amount);
    }

}
