package moreoninterfaces;

import java.util.ArrayList;

public class CheckingAccount implements Account{
    ArrayList<Double> transactions = new ArrayList<Double>();
    private double balance = 0;

    public void deposit(double depositAmount) {
        System.out.println("pretend i'm depositing: " + depositAmount);
        this.transactions.add(depositAmount);
        this.balance = this.balance +  depositAmount;
    }

    public void withdraw(double withdrawAmount) {
        this.transactions.add(-1 * withdrawAmount);
        this.balance = this.balance - withdrawAmount;
    }

    public ArrayList<Double> getTransactions() {
        return this.transactions;
    }

}
