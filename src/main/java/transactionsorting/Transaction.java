package transactionsorting;

import java.time.LocalDate;
import java.time.LocalTime;

public class Transaction implements Comparable<Transaction> {
    private LocalDate date;
    private LocalTime time;

    private double amount;

    public Transaction(LocalDate date, LocalTime time) {
        this.date = date;
        this.time = time;
    }

    public Transaction(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }

    public int compareTo(Transaction otherTransaction) {
        return this.getDate().compareTo(otherTransaction.getDate());
    }

}
