package generics;

public class LablerMain {

    public static void main(String[] args) {

        Labler.staticMethod();

        // Can't do this
//        Labler.instanceMethod();

        Labler labler1 = new Labler("Brother P-Touch");
        Labler labler2 = new Labler("Pat's Powerful P-Touch");

        labler1.instanceMethod();
//        labler2.instanceMethod();

//        lablerInstance.staticMethod();
    }
}
