package moreoninterfaces;

import java.util.ArrayList;
import java.util.List;

public class CheckingAccount implements Account{
    List<Double> transactions = new ArrayList<Double>();


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

    public List<Double> getTransactions() {
        return this.transactions;
    }

    public void writeCheck() {
    }

    public void deactivate() {

    }

}
