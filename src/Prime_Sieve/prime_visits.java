//Prime Visits:--->
//
//PMO gives two random numbers a & b to the Prime Minister. PM Modi wants to visit all countries between a and b (inclusive) , However due to shortage of time he can't visit each and every country , So PM Modi decides to visit only those countries,for which country number has two divisors. So your task is to find number of countries Mr. Modi will visit.
//
//
//
//
//Input format
//
//The first line contains N , no of test cases. The next N lines contain two integers a and b denoting the range of country numbers.
//
//
//Output format
//
//Output contains N lines each containing an answer for the test case.
//
//
//Example 1
//
//Input
//
//2
//1 10
//11 20
//
//
//Output
//
//4
//4
//
//
//Explanation
//
//PM Modi chooses countries with numbers 2,3,5 and 7 for the first testcase.
//
// For the second testcase , he chooses countries with numbers 11,13,17 and 19.
//
//
//Constraints
//
//a<=1000000 & b<=1000000. 
//
//N<=1000



package Prime_Sieve;
import java.util.*;
public class prime_visits {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			boolean[] prime=new boolean[b+1];
			if(prime.length>=2){
				prime[0]=true;
				prime[1]=true;
			}
			for(int i=2;i*i<=b;i++){
				if(prime[i]==false){
					for(int mul=2;mul*i<=b;mul++){
						prime[mul*i]=true;
					}
				}
			}
			int count=0;
			for(int i=a;i<=b;i++){
				if(prime[i]==false){
					count++;
				}
			}
			System.out.println(count);
		}
    }
}