package com.algorithms.hashing;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The HashFunctionTest.
 * <p>
 * This test class is responsible for testing the {@link HashFunction}.
 * <p>
 * <b>Warning: </b>None.
 * <p>
 * @author szeyick
 */
public class HashFunctionTest {

	/**
	 * Test that a hash function is returned.
	 */
	@Test
	public void testHashFunction() {
		HashFunction hashFunction = new HashFunction();
		int hash1 = hashFunction.computeHashCode("String");
		int hash2 = hashFunction.computeHashCode("String");
		int hash3 = hashFunction.computeHashCode("Strings");
		
		assertEquals("Expected hash function to be the same", hash1, hash2);
		assertNotEquals("Expected hash function to be the same", hash1, hash3);
		assertEquals("Expected hash function to be the same", "", "");
	}
}
