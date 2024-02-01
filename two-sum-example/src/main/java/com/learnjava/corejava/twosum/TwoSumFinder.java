package com.learnjava.corejava.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSumFinder {

	public int[] findTheNumbers(int[] numArr, int target)
	{
		
		int firstIdx = 0;
		int secondIdx = 0;
		
		Map<Integer,Integer> hm = new HashMap<>();
		
		for (int i=0; i<numArr.length; i++)
		{
			
			if (hm.containsKey(numArr[i]))
			{
				firstIdx = hm.get(numArr[i]);
				secondIdx = i;
				System.out.println("The indices are " + firstIdx + " and " + secondIdx);
		
			}
			else 
			{
				hm.put(target-numArr[i], i);
			}
			
		}
		
		/*
		for(int k: numArr)
		{
			System.out.println(numArr[k]);
		}
		*/
		
		return new int[] {firstIdx, secondIdx};
	}
	
	
}
