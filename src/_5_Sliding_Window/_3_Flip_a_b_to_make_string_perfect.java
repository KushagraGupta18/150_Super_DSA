package _5_Sliding_Window;

public class _3_Flip_a_b_to_make_string_perfect {

	public static void main(String[] args) {
		String str="abba";
		int k=2;
		
		int ans_a=flip(str,k,'a');//flip a
		int ans_b=flip(str,k,'b');//flip b
		int ans=Math.max(ans_a, ans_b);
		System.out.println(ans);
				
	}

	public static int flip(String str, int k, char ch) {
		int si=0;
		int ei=0;
		int ans=0;
		int count=0;
		while(ei<str.length()) {
			//window grow
			if(str.charAt(ei)==ch) {
				count++;
			}	
			//window shrink
			while(si<=ei && count>k) {
				if(str.charAt(si)==ch) {
					count--;
				}
				si++;
			}
			
			//calculate ans
			ans=Math.max(ans,ei-si+1);
			ei++;
		}
		return ans;
	}

}
