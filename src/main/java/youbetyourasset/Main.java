package youbetyourasset;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Jewlry bracelet = new Jewlry("bracelet", 10);
        House house = new House("house", 100_000, 1999, 3500, 3);
        CreditCard blackCard = new CreditCard();
        blackCard.charge(1000);

        BankAccount checkingAccount = new BankAccount("Permiere Account", "D1", 1_000_000);

        List<Valuable> valuables = new ArrayList<>();
        valuables.add(bracelet);
        valuables.add(house);
        valuables.add(blackCard);
        valuables.add(checkingAccount);

        double netWorth = 0;
        for(Valuable v: valuables) {
            netWorth += v.getValue();
        }

        System.out.println("Net Worth: " + netWorth);

    }
}
