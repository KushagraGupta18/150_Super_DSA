package _9_Prime_Sieve;

public class _5_A_to_Power_b {

	public static void main(String[] args) {
		int a=2;
		int b=10;
		System.out.println(power(a, b));
	}
	public static int power(int a , int b) {
		if(b==0) {
			return 1;
		}
		int ans=power(a,b/2);
		ans=ans*ans;//a^b
		if(b%2!=0) {
			ans=ans*a;//for odd case
		}
		return ans;//directly for even case
		
	}

}
