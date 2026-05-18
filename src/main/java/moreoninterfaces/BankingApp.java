package moreoninterfaces;

public class BankingApp {
    public static void main(String[] args) {

    }

    public static void transfer(Account fromAccount, Account toAccount, double amount) {
        fromAccount.withdraw(amount);
        toAccount.deposit(amount);
    }
}
