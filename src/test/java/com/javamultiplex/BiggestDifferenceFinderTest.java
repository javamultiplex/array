package com.javamultiplex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class BiggestDifferenceFinderTest {

    private BiggestDifferenceFinder biggestDifferenceFinder;

    @Before
    public void setUp() {
        biggestDifferenceFinder = new BiggestDifferenceFinder();
    }

    @Test
    public void shouldGetBiggestDiff() {
        Assert.assertEquals(74, biggestDifferenceFinder.getBiggestDiffBetweenTwoArrayElements(new int[]{29, 79, 72, 81, 9, 7, 21}));
    }

}
