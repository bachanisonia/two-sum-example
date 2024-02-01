package com.learnjava.corejava.twosum;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwoSumFinderTest {

	TwoSumFinder tsum;
	int target;

	@BeforeEach
	public void init() {
		
		tsum = new TwoSumFinder();
		
	}
	
	@Test
	public void testTwoSumEmptyInput() {
		
		
		int[] inputArr = {};
		int[] outputArr = {0,0};
		int[] expectedArr = {0,0};
		
		target = 0;
		
		outputArr = tsum.findTheNumbers(inputArr, target);
		
		//assertEquals(outputArr, expectedArr);
		assertArrayEquals(outputArr, expectedArr);
		
	}
	
	
	@Test
	public void testTwoSumValidInput1() {
		
		
		int[] inputArr = {1,2,3,4};
		int[] outputArr = {};
		int[] expectedArr = {1,3};
		
		target = 6;
		
		outputArr = tsum.findTheNumbers(inputArr, target);
		
		assertArrayEquals(outputArr, expectedArr);
		//assertEquals(outputArr, expectedArr);
		
	}
	
	

}
