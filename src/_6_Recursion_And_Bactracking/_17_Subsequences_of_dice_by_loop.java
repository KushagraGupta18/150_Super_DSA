package _6_Recursion_And_Bactracking;

public class _17_Subsequences_of_dice_by_loop {

	public static void main(String[] args) {
		int item=4;
		dice(item,0,"");
	}

	public static void dice(int item, int sum,String ans) {
		if(sum==item){
			System.out.println(ans);
			return;
		}
		if(sum>item) {
			return;
		}
		for(int i=1;i<=3;i++) {
			dice(item,sum+i,ans+i);
		}
		
	}

}
