package Prime_Sieve;
import java.util.*;
public class _2_prime_sieve {
	//Time Complexity--->
	//(n/2 + n/3 + n/5 + n/7 + ------)
	//n(1/2 + 1/3 + 1/5 + 1/7 + -----)--->n(1/prime ki series)
	//O(N*loglog(N))
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean[] prime=new boolean[n+1];
		//false-->prime
		//true--> not prime
		prime[0]=true;//not prime(0)
		prime[1]=true;//not prime(1)
		for(int i=2;i*i<=n;i++) {
			if(prime[i]==false) {	//i prime hai i ke multiples cut krdo
				for(int mul=2;mul*i<=n;mul++) {	//table read
					prime[i*mul]=true;//not prime
				}
			}
		}
		for(int i=2;i<=n;i++) {
			if(prime[i]==false) {
				System.out.println(i);//print all prime number from 2 to number n
			}
		}
	}
	
}
