package generics;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        IntegerPair integerPair = new IntegerPair(3, 4);
//        integerPair.print();
//
//        System.out.println("Swapping...");
//
//        integerPair.swap();
//        integerPair.print();

        Superhero professorParadox = new Superhero("Professor Paradox", "Hardass Grading");

        Superhero unpaidIntern = new Superhero("Unpaid Intern", "Getting Coffee");

        Pair<Superhero> pairOfStrings = new Pair<Superhero>(professorParadox, unpaidIntern);
        pairOfStrings.print();

        System.out.println("Swapping...");

        pairOfStrings.swap();
        pairOfStrings.print();
    }
}
