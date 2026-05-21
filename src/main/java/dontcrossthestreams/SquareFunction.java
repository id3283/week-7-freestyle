package dontcrossthestreams;

import java.util.function.Function;

class SquareFunction implements Function<Integer, Integer> {
    public Integer apply(Integer n) {
        return n * n;
    }
}
