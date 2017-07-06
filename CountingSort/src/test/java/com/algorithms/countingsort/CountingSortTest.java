package com.algorithms.countingsort;

import java.util.concurrent.ThreadLocalRandom;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The CountingSortTest.
 * <p>
 * This class is responsible for testing the {@link CountingSort}.
 * <p>
 * <b>Warning: </b>None.
 */
public class CountingSortTest {

    /**
     * Test the counting sort algorithm.
     */
    @Test
    public void testCountingSort() {
        CountingSort sorter = new CountingSort();
        int[] inputArray = generateInputArray(100, 50);
        int[] sortedArray = sorter.sort(inputArray, 50);
        validateSortedArray(sortedArray);
    }

    /**
     * @param sortedArray - The array to validate to ensure all values are in ascending order.
     */
    private void validateSortedArray(int[] sortedArray) {
        for (int i = 0; i < sortedArray.length; i++) {
            int currentValue = sortedArray[i];
            for (int j = (i + 1); j < sortedArray.length; j++) {
                int nextValue = sortedArray[j];
                assertTrue("Expected current value to be less than next value", currentValue <= nextValue);
            }
        }
    }

    /**
     * @param valueCount - The number of values to generate.
     * @param maxValue - The maximum value in the input array.
     * @return an integer array of random values (between 0 and a provided value).
     */
    private int[] generateInputArray(int valueCount, int maxValue) {
        int[] inputArray = new int[valueCount];
        for (int i = 0; i < valueCount; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, maxValue + 1);
            inputArray[i] = randomNum;
        }
        return inputArray;
    }
}
