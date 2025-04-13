package com.leetcode;

import java.util.*;

public class TwoSum {
	
	public static void main(String[] args) {
		int [] nums = {2,7,11,15};
		int target = 9;
		
		Map<Integer, Integer> map = new HashMap<>();
		for(int i =0; i<nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for(int i=0; i<nums.length; i++) {
			int firstNum = nums[i];
			int rem = target - firstNum;
			
			if(map.containsKey(rem)) {
				System.out.println();
			}
		}
		
		
	}

}
