package dontcrossthestreams;

import java.util.ArrayList;
import java.util.List;/** Streams with only built-in methods (built in where?) */
public class StreamDemo1 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(4);
        numbers.add(2);
        numbers.add(7);
        numbers.add(2);
        numbers.add(9);
        numbers.add(4);
        numbers.add(1);


//        numbers.stream().forEach();
//        numbers.forEach(n -> {
//            System.out.println(n * n);});

        List<Integer> result = numbers.stream().sorted().toList();
//                .distinct()
//                .sorted()
//                .limit(4)
//                .toList();
        System.out.println(result);
    }
}
