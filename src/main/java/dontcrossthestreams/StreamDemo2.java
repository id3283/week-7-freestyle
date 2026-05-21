package dontcrossthestreams;
import java.util.List;

/**
 * Long and ugly without lambdas.  We never really do this.
 */
public class StreamDemo2 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4);

        List<Integer> squared = numbers.stream()
                .map(new SquareFunction())
                .toList();

        System.out.println(squared);
    }
}
