package com.algorithms.countingsort;

/**
 * The CountingSort.
 * <p>
 * This class wraps the functionality for a count sort. This version of the
 * count sort demonstrates sorting an array of integers.
 * <p>
 * <b>Warning: </b>None.
 */
public class CountingSort {

    /**
     * @param input - The input array of unsorted values.
     * @param maxValue - The maximum value in the input array (used to define the max range).
     * @return the sorted input array.
     */
    public int[] sort(int[] input, int maxValue) {
        int[] numCount = new int[maxValue + 1]; // Needs to be maxValue + 1 to be able to store the max value.
        int[] sortedArray = new int[input.length];

        // Count the number of occurrences of each value in the input array.
        for (int i = 0; i < input.length; i++) {
            int currentValue = input[i];
            numCount[currentValue]++; // Increment the count at the index.
        }

        // Populate the sortedArray with each non 0 value in numCount.
        int sortedArrayCurrentIndex = 0;
        for (int i = 0; i < numCount.length; i++) {
            int currentIndexCount = numCount[i];
            if (currentIndexCount > 0) {
                // Populate the sorted array with the number of times the index occurs in numCount.
                for (int j = 0; j < currentIndexCount; j++) {
                    sortedArray[sortedArrayCurrentIndex] = i;
                    sortedArrayCurrentIndex++;
                }
            }
        }
        return sortedArray;
    }

}
