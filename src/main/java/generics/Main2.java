package generics;

public class Main2 {

    public static void main(String[] args) {

        int i = 1;

        Labeler.displayWithLabel("here's an integer: ", i);

        Main2.printSomething();
    }

    public static void printSomething() {
        System.out.println("Something");
    }
}
