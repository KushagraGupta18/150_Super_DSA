//Murthal Parantha:--->
//
//The coding blocks members went to the success party of their first ever online boot-camp at Murthal. They ordered P number of paranthas. The stall has L cooks and each cook has a rank R. A cook with a rank R can cook 1 parantha in the first R minutes 1 more parantha in the next 2R minutes, 1 more parantha in 3R minutes and so on(he can only cook a complete parantha) ( For example if a cook is ranked 2.. he will cook one parantha in 2 minutes one more parantha in the next 4 mins and one more in the next 6 minutes hence in total 12 minutes he cooks 3 paranthas. In 13 minutes also he can cook only 3 paranthas as he does not have enough time for the 4th parantha). Calculate the minimum time needed to cook all the paranthas.
//
//Input Format
//First line contains P, the number of pratha ordered. In the next line the first integer denotes the number of cooks L and L integers follow in the Next line each denoting the rank of a cook.
//
//Constraints
//P <= 1000
//L <= 50
//1 <= R <= 8
//
//Output Format
//Print an integer which tells the number of minutes needed to get the order done.
//
//Sample Input
//10
//4 
//1 2 3 4
//Sample Output
//12
//Explanation
//First cook with rank 1 cooks 4 paranthas in 10 minutes (1+2+3+4).
//Second cook with rank 2 cooks 3 paranthas in 12 minutes (2+4+6)
//Third cook with rank 3 cooks 2 paranthas in 9 minutes (3+6) Fourth cook with rank 4 only needs to cook one last remaining parantha. He can do that in 4 minutes.
//Since these cooks cook parallely, the total time taken will be the maximum of the four i.e. 12 minutes.


package _12_Advanced_binary_search;
import java.util.*;
public class _4_Murthal_Paratha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int nop=sc.nextInt();//no. of parathas
		int noc=sc.nextInt();//no. of cooks
		int[] stalls=new int[noc];
		for(int i=0;i<stalls.length;i++) {
			stalls[i]=sc.nextInt();
		}
		Arrays.sort(stalls);
		System.out.println(minimum_time(stalls,nop));
	}

	public static int minimum_time(int[] stalls, int nop) {
		int lo=0;
		//sum of ap series=>   S = n/2[2a + (n − 1) × d]
		//total time=1r+2r+3r+-----+nop*r
		//a=r , n=nop, d=r(take r of last index of cooks from stalls because it takes maximum time to cook parathas)
		int r=stalls[stalls.length-1];	//last cook after sorted array
		int hi=(nop/2)*(2*r+(nop-1)*r);
		int ans=0;
		while(lo<=hi) {
			int mid=(lo+hi)/2;
			if(ispossible(stalls,nop,mid)) {
				ans=mid;
				hi=mid-1;
			}
			else {
				lo=mid+1;
			}
		}
		return ans;
	}

	public static boolean ispossible(int[] stalls, int nop, int mid) {
		int count_time_for_paratha = 0;
		int cp = 0;//cp--->count parathas
		for (int i = 0; i < stalls.length; i++) {
			count_time_for_paratha = stalls[i];//1*rank		//for every cook there is a time of mid minutes. in mid minutes he can make no. of parathas as their rank(working capacity)
			int j = 2;
			while (count_time_for_paratha <= mid) {
				cp++;
				count_time_for_paratha = count_time_for_paratha + (stalls[i] * j);	//2*rank  3*rank+-----(j*rank)
				j++;
			}
			if (cp >= nop) 
			return true;
		}
		return false;
	}

}