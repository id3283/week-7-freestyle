package dontcrossthestreams;
import java.util.List;

/**
 * Another example of using streams with a lambda (filtering out odd numbers)
 */
public class StreamDemo5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(evens);
    }
}