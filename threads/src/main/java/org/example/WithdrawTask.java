package org.example;

public class  WithdrawTask implements Runnable {

    private BankAccount Account;
    public  WithdrawTask(BankAccount Account){
        this.Account=Account;
    }

    @Override
    public void run() {
      Account.withdraw(400);

    }
}
