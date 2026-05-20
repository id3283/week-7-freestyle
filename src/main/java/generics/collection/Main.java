package generics.collection;

public class Main {
    public static void main(String[] args) {
        FixedList<String> strings = new FixedList<>(3);

        strings.add("uno");
        strings.add("dui");
        strings.add("tree");

        // this explodes
//        strings.add("lima");

        System.out.println(strings.get(0));
        strings.get(-3);
    }
}
