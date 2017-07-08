package com.algorithms.hashing;

/**
 * The HashFunction.
 * <p>
 * This class wraps the functionality of a hash function. The purpose
 * of a hash function is to encode an input string to generate a unique
 * key.
 * <p>
 * <b>Warning: </b>None.
 * <p>
 * @author szeyick
 */
public class HashFunction {

	/**
	 * Compute a hash code that represents the index to the item.
	 * @param key - The key associated to the item.
	 * @return the hash code from the key.
	 */
	public int computeHashCode(String key) {
		int charSum = 0;
		for (int index = 0; index < key.length(); index++) {
			charSum += key.charAt(index);
		}
		return charSum % 97;
	}
}
