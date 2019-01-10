package com.javamultiplex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class BiggestDifferenceFinder {

    /**
     *
     * @param arr
     * @return
     */
    public int getBiggestDiffBetweenTwoArrayElements(int[] arr) {
        int length = arr.length;
        int diff = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                diff = Math.abs(arr[i] - arr[j]);
                list.add(diff);
            }
        }
        Collections.sort(list);
        return list.get(list.size() - 1);
    }
}
