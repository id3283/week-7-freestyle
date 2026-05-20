package generics;

public class Labler {
    private String name;
    public static String type = "A label printer";

    public Labler(String name) {
        this.name = name;
    }

    public void instanceMethod() {
        System.out.println("Yo, I'm running the instance method on labler named: "  + this.name + " type: " + this.type);
    }

    public static void staticMethod() {
        System.out.println("Yo, I'm running the static method.");
    }
}
