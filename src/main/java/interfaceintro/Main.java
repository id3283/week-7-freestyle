package interfaceintro;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Island grunay = new Island(60_000);
        Sailboat bonnieGirl = new Sailboat(36);


        ArrayList<Valueable> valueables = new ArrayList<>();
        valueables.add(grunay);
        valueables.add(bonnieGirl);


        double netWorth = 0;
        for(Valueable a: valueables) {
            netWorth += a.getValue();
        }

        System.out.printf("Congrats, your total networth is: %,.2f", netWorth);

    }
}
