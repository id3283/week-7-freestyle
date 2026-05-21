package dontcrossthestreams;

import java.util.List;

/**
 * Stream using a wee lambda for the transform (squaring the number)
 */
public class StreamDemo3 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(2, 3, 4);

        List<Integer> squared = numbers.stream().map( (Integer n) -> n * n).toList();

        System.out.println(squared);
    }

//    Integer square(Integer n) {return n * n;}
}