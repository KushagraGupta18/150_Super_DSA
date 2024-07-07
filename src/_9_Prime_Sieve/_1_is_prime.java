package _9_Prime_Sieve;

import java.util.*;

public class _1_is_prime {
	// O(N*sqrt(N))--->print all prime from 2 to number
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 2; i < n; i++) {
			if (isPrime(i)) {
				System.out.println("Number is prime" + " " + i);
			}
		}
	}

	// O(sqrt(N))--->check prime
	public static boolean isPrime(int num) {
		int div = 2;
		while (div * div <= num) {
			if (num % div == 0) {
				return false;
			}
			div++;
		}
		return true;
	}

}
