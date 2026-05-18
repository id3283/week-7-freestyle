package moreoninterfaces;

import java.util.ArrayList;

public class AccountFileManager {

    public void saveTransactions(Account accountToSave) {
        ArrayList<Double> transactionAmounts = accountToSave.getTransactions();

        for(Double transactionAmount: transactionAmounts) {

        }
    }
}
