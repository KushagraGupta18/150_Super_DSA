package _8_Time_And_Space_Complexity;
import java.util.*;
public class _2_Time_Comp_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = 1000;
		
//		System.out.println("bye hey");
//		System.out.println("bye");
//		System.out.println("bye");
//		System.out.println("bye");
//		System.out.println("bye");
//		System.out.println("bye");
//		System.out.println(n);
		int i = 0;
		while (i < n) {
			System.out.println("Hey");

			i++;
			// O(N)
		}

		while (i <= n) {
			System.out.println("Hey");
			//O(log(N))
			i *= 2;
		}

		while (n > 0) {
			System.out.println("Hey");
			n /= 2;
			// O(log(N)
		}

		while (i <= n) {
			System.out.println("Hey");
			// O(N)
			i += 2;
			i += 3;
		}
		
		
		while (i <= n) {
			System.out.println("Hey");
			// O(log(N)  base 6 
			i *= 2;
			i *= 3;
		}
		
		while (n > 0) {
			System.out.println("Hey");
			// O(log(N)  base 6 
			n /= 2;
			n /= 3;
		}
		
		while (i <= n) {
			System.out.println("Hey");
              // n/K
			int k=sc.nextInt();
			i +=k;//k is an any variable(not a constant)
		}
		
		while (i <= n) {
			System.out.println("Hey");
              // h/w
			// log N base k
			int k=sc.nextInt();
			i *= k;
		}
		
		
		while (n > 0) {
			System.out.println("Hey");
               //O(n)
			n = n - 1;
		}
		
		while (n > 0) {
			System.out.println("Hey");
			 //O(n)
			n = n - 2;
			n = n - 3;
		}
		
		while (n > 0) {
			// HW 
			 // n/K
			int k=sc.nextInt();
			n = n - k;
		}

		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				// N^2
				System.out.println("hey");
			}
		}
		
		
		for (i = 1; i * i <= n; i++) {
			System.out.println("hey");
			// Sqrt(N)
		}
		
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				for (int k = 1; k <= 1000; k++) {
					// 1000*(N^2)
				}
			}
		}
		
		
		
		for (i = 1; i <= n; i++) {
			for (int j = 1; j <= i * i; j++) {
				for (int k = 1; k <= n / 2; k++) {
					System.out.println("hey");
					
					// N^4
				}
			}
		}
		
		
		for( i=1; i<=n; i*=2) {
			System.out.println("hey");
		//	log(N)
		}  
		
		
		for(i=n/2; i<=n; i++) {// n/2
			for(int j=1; j<=n/2; j++) {// n/2
				for(int k=1; k<=n; k=k*2) {// log(n)
					System.out.println("hey");
					// N^2 log(n)
				}
			}
		}
		
		for(i=1; i<=n; i++) {
			for(int j=1; j<=n; j+=i) {
				System.out.println("hey");
				// O N*Log(N)
			}
		}				

	}

}
