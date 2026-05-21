package dontcrossthestreams;

import java.util.List;

/**
 * Streams with only built-in methods (built in where?)
 */
public class StreamDemo1 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 2, 7, 2, 9, 4, 1);
        List<Integer> result = numbers.stream().toList();
//                .distinct()
//                .sorted()
//                .limit(4)
//                .toList();

        System.out.println(result);
    }
}
