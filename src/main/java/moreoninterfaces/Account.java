package moreoninterfaces;

import java.util.ArrayList;
import java.util.List;

public interface Account {

    void deposit(double amount);

    void withdraw(double amount);

    List<Double> getTransactions();


}
