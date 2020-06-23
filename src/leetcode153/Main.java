package leetcode153;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		int[] nums = {3,4,5,1,2};
		
		System.out.println("Input: " + Arrays.toString(nums));
		
		FindMinimumInRotatedSortedArray solution = new FindMinimumInRotatedSortedArray();
		
		System.out.println("Solution: " + solution.findMin(nums));
	}
}
