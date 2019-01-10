package com.javamultiplex;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.IntStream;

/**
 * @author Rohit Agarwal
 */
public class BiggestDifferenceFinder {

    /**
     * @param arr
     * @return
     */
    public int getBiggestDiffBetweenTwoArrayElements(int[] arr) {
        Supplier<IntStream> streamSupplier = () -> Arrays.stream(arr);
        int max = streamSupplier.get().max().getAsInt();
        int min = streamSupplier.get().min().getAsInt();
        return max - min;
    }
}
