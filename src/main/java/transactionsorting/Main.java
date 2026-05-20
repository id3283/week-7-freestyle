package transactionsorting;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Transaction> transactions = new ArrayList<>();

        LocalDate date1 = LocalDate.of(2000, 10, 11);
        LocalDate date2 = LocalDate.of(2020, 1, 1);

        int dateComparison = date1.compareTo(date2);


        Transaction t1 = new Transaction(date2);
        Transaction t2 = new Transaction(date1);
        Transaction t3 = new Transaction(LocalDate.of(2002, 7, 1));
        transactions.add(t1);
        transactions.add(t2);
        transactions.add(t3);

        Collections.sort(transactions);


        System.out.println();

    }
}
