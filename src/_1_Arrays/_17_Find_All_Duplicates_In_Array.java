package _1_Arrays;
//leetcode question number--->442
import java.util.ArrayList;
import java.util.List;

public class _17_Find_All_Duplicates_In_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int idx=Math.abs(nums[i])-1;
            if(nums[idx]<0){
                list.add(Math.abs(nums[i]));
            }
            nums[idx]=nums[idx]*(-1);
        }
        return list;
    }

}
