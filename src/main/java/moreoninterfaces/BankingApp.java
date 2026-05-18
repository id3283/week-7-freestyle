package moreoninterfaces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BankingApp {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.deposit(1000);

        List<String> strings = new LinkedList<String>();

        Account checking = new CheckingAccount();

        transfer(savings, checking, 100);
        transfer(checking, savings, 100);

    }

    public static int countList(List<String> strings) {
        int count = 0;
        for(String s : strings) {
            count++;
        }

        return count;
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
