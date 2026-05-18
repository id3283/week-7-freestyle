package moreoninterfaces;

import java.util.ArrayList;

public interface Account {

    void deposit(double amount);

    void withdraw(double amount);

    ArrayList<Double> getTransactions();
}
