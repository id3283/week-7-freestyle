package moreoninterfaces;

import java.util.ArrayList;

public class SavingsAccount implements Account {
    private double balance = 0;

    @Override
    public void deposit(double amount) {
        this.balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        this.balance -= amount;
    }

    @Override
    public ArrayList<Double> getTransactions() {
        return null;
    }
}
