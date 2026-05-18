package youbetyourasset;

public class CreditCard implements Valuable{
    private double balance = 0;


    public void pay(double amount) {
        this.balance -= amount;
    }

    public void charge(double amount) {
        this.balance += amount;
    }

    public double getValue() {
        return -1 * this.balance;
    }
}
