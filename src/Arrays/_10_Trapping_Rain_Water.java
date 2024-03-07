package Arrays;
//leetcode question number--->42(Trapping rain water) 
public class _10_Trapping_Rain_Water {

	public static void main(String[] args) {
		int[] heights= {0,1,0,2,1,0,1,3,2,1,2,1};
		
		long[] left=new long[heights.length];
        long[] right=new long[heights.length];
        for(int i=1;i<left.length;i++){
            left[i]=Math.max(left[i-1],heights[i-1]);
        }   
        for(int i=heights.length-2;i>=0;i--){
            right[i]=Math.max(right[i+1],heights[i+1]);
        }
        int ans=0;
        for(int i=0;i<heights.length;i++){
            long item=Math.min(left[i],right[i]);
            if(item-heights[i]>0){
                ans+=item-heights[i];
            }
        }
        System.out.println(ans);
	}

}
