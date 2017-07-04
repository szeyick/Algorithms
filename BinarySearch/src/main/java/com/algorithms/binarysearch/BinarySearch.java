package com.algorithms.binarysearch;

/**
 * The BinarySearch.
 * <p>
 * This class wraps the functionality of a binary search
 * algorithm. It works on an array of integers and expects
 * the input to be sorted, if the input is not sorted it will
 * output an error message.
 * <p>
 * <b>Warning: </b>None.
 * <p>
 * @author szeyick
 */
public class BinarySearch {

	/**
	 * Accessor method to allow a binary search to be performed.
	 * @param input - The input array.
	 * @param targetValue - The value to search for.
	 * @param iterativeSearch - flag to indicate to use an iterative search.
	 * @return <code>true</code> if the value exists in the array, <code>false</code>
	 * otherwise.
	 */
	public boolean search(int[] input, int targetValue, boolean iterativeSearch) {
		boolean itemFound = false;
		if (isValid(input)) {
			if (iterativeSearch) {
				itemFound = recursiveSearch(input, targetValue, 0, input.length - 1);
			}
			else {
				itemFound = iterativeSearch(input, targetValue);
			}
		}
		return itemFound;
	}
	
	/**
	 * Recursively search for the item in the array.
	 * @param input - The input array.
	 * @param targetValue - The value to search for.
	 * @param start - The current start index.
	 * @param end - The current end index.
	 * @return <code>true</code> if the value exists, <code>false</code> otherwise.
	 */
	private boolean recursiveSearch(int[] input, int targetValue, int start, int end) {
		int middleIndex = findMiddleIndex(start, end);
		// Recursive Base Case: Terminate if start is greater than end.
		if (start > end) {
			return false;
		}
		// The recursive search performs the same steps that the iterative version does
		// with the exception of removing the while loop. For the recursive version the
		// loop is replaced with the recursion.
		if (targetValue == input[middleIndex]) {
			return true;
		}
		if (targetValue < input[middleIndex]) {
			// Move left.
			return recursiveSearch(input, targetValue, start, middleIndex - 1);
		}
		else {
			// Move right.
			return recursiveSearch(input, targetValue, middleIndex + 1, end);
		}
	}
	
	/**
	 * Iteratively search for the item in the array.
	 * @param input - The input array.
	 * @param targetValue - The value to search for.
	 * @return <code>true</code> if the value exists, <code>false</code> otherwise.
	 */
	private boolean iterativeSearch(int[] input, int targetValue) {
		int start = 0;
		int end = input.length - 1;
		int middleIndex = findMiddleIndex(start, end);
		
		// In an iterative search, we start in the middle and keep track of the higher and
		// lower indices. When we move to the left or right sub-array, we need to update these
		// indices accordingly.
		while (start < end) {
			if (input[middleIndex] == targetValue) {
				return true; // We have the middle value.
			}
			if (targetValue < input[middleIndex]) {
				// If the target is smaller then the middle value, then we need to look in 
				// the left part of the array.
				end = middleIndex;
			}
			else {
				// If the target is larger than the middle value, then we need to look in
				// the right part of the array.
				start = middleIndex + 1;
			}
			middleIndex = findMiddleIndex(start, end);
		}
		return false;
	}

	/**
	 * Find the middle index of the array.
	 * @param start - The start index of the array.
	 * @param end - The end index of the array.
	 * @return the middle index.
	 */
	private int findMiddleIndex(int start, int end) {
		return (start + end) / 2;
	}
	
	/**
	 * @param input - The input array.
	 * @return <code>true</code> if the input is ordered, <code>false</code> otherwise.
	 */
	private boolean isValid(int[] input) {
		boolean isValid = true;
		for (int i = 0; i < input.length; i++) {
			// Iterate from the current index till end to verify that the current value
			// is smaller than all the values that follow.
			int currentValue = input[i];
			for (int j = i + 1; j < input.length; j++) {
				if (currentValue > input[j]) {
					isValid = false;
					break;
				}
			}
		}
		if (!isValid) {
			System.out.println("Input array is invalid");
		}
		return isValid;
	}
}
