package Mutlithreading.implicitSynchronization;

public class Withdrawal implements Runnable{
    private Double amount;
    private Transaction ObjT ;
    public Withdrawal(Transaction ObjT , Double amount)
    {
        this.ObjT = ObjT;
        this.amount = amount;

    }

    @Override
    public void run(){
        ObjT.WithdrawalTransactionService(amount);
    }
}
