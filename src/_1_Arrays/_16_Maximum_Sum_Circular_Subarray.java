package _1_Arrays;
//leetcode question number-->918
public class _16_Maximum_Sum_Circular_Subarray {

	public static void main(String[] args) {
		
	}
	public int maxSubarraySumCircular(int[] nums) {
        int total_sum=0;
        int glob_max=Integer.MIN_VALUE;
        int curr_max=0;
        for(int i=0;i<nums.length;i++){
            total_sum=total_sum+nums[i];
            curr_max+=nums[i];
            glob_max=Math.max(glob_max,curr_max);
            if(curr_max<0){
                curr_max=0;
            }
        }
        int glob_min=Integer.MAX_VALUE;
        int curr_min=0;
        for(int i=0;i<nums.length;i++){
            curr_min+=nums[i];
            glob_min=Math.min(glob_min,curr_min);
            if(curr_min>0){
                curr_min=0;
            }
        }
        if(glob_max<0){
            return glob_max;
        }
        else{
            return Math.max(glob_max,total_sum-glob_min);
        }
    }

}
