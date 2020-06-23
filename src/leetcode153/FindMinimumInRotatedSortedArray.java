package leetcode153;

public class FindMinimumInRotatedSortedArray {
	// O(logn) 
	public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        
        while(left < right){
            int mid = left + (right - left) / 2;
            
            if(nums[left] < nums[mid]){
                if(nums[left] > nums[right]){
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }else {
                if(nums[mid] > nums[right]){
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
        }
        
        return nums[left];
    }
}
