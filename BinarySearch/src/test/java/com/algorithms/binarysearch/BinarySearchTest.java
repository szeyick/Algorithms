package com.algorithms.binarysearch;

import static org.junit.Assert.*;

import java.util.concurrent.ThreadLocalRandom;

import org.junit.Test;

/**
 * The BinarySearchTest.
 * <p>
 * This class is responsible for testing the {@link BinarySearch} class.
 * <p>
 * <b>Warning: </b>None.
 * <p>
 * @author szeyick
 */
public class BinarySearchTest {

	/**
	 * Test the recursive binary search.
	 */
	@Test
    public void testRecursiveSearch() {
		BinarySearch binarySearch = new BinarySearch();
		int[] inputArray = initArray();
		
		assertTrue("Expected value to be found", binarySearch.search(inputArray, 10, true));
		assertFalse("Expected value to not be found", binarySearch.search(inputArray, 100, true));
		assertTrue("Expected value to be found", binarySearch.search(inputArray, 99, true));
		assertFalse("Expected value to not be found", binarySearch.search(inputArray, -20, true));
	}
	
	/**
	 * Test the iterative binary search..
	 */
	@Test
    public void testIterativeSearch() {
		BinarySearch binarySearch = new BinarySearch();
		int[] inputArray = initArray();
		
		assertTrue("Expected value to be found", binarySearch.search(inputArray, 45, false));
		assertFalse("Expected value to not be found", binarySearch.search(inputArray, 101, false));
		assertTrue("Expected value to be found", binarySearch.search(inputArray, 58, false));
		assertFalse("Expected value to not be found", binarySearch.search(inputArray, -3, false));
	}
	
	/**
	 * Test that search will return false.
	 */
	public void testInvalidInput() {
		BinarySearch binarySearch = new BinarySearch();
		int[] inputArray = initRandArray();
		assertFalse("Expected value to not be searched", binarySearch.search(inputArray, 50, true));
	}
	
	/**
	 * @return an initialised sorted array.
	 */
	private static int[] initArray() {
		int[] inputArray = new int[100];
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = i;
		}
		return inputArray;
	}
	
	/**
	 * @return an initialised array of random integers.
	 */
	private static int[] initRandArray() {
		int[] inputArray = new int[100];
		for (int i = 0; i < inputArray.length; i++) {
			inputArray[i] = ThreadLocalRandom.current().nextInt(0, 100 + 1);
		}
		return inputArray;
	}
}
