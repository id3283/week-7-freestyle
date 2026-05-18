package moreoninterfaces;

public class BankingApp {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.deposit(1000);


        CheckingAccount checking = new CheckingAccount();
        checking.writeCheck();

        transfer(savings, checking, 100);
        transfer(checking, savings, 100);

    }

    public static void transfer(Account fromAccount, Account toAccount, double amount) {
        fromAccount.withdraw(amount);

        if(fromAccount instanceof CheckingAccount) {
            CheckingAccount checkingAccount = (CheckingAccount) fromAccount;
            checkingAccount.writeCheck();
        }

        toAccount.deposit(amount);
    }


    public static void transfer(CheckingAccount checking, SavingsAccount savings, double amount) {

    }
    public static void transfer(SavingsAccount savings,CheckingAccount checking, double amount) {

    }
    public static void transfer(CheckingAccount checking1,CheckingAccount checking2, double amount) {

    }
     public static void transfer(SavingsAccount savings1, SavingsAccount savings2, double amount) {

    }

}
