package Number_System_and_data_types;

public class Conversion_of_decimal_with_any_base {

	public static void main(String[] args) {
		//1 base is decimal condition
		//decimal to binary(source to destination)
		int n=5;
		int mul=1;
		int ans=0;
		while(n>0) {
			int rem=n%2;	//2 as des
			ans=ans+rem*mul;
			mul=mul*10;		//10 as src
			n=n/2;			//2 as des
		}
		System.out.println(ans);
		
		
		//binary to decimal
//		int n=101;
//		int mul=1;
//		int ans=0;
//		while(n>0) {
//			int rem=n%10;	//10 as des
//			ans=ans+rem*mul;
//			mul=mul*2;		//2 as src
//			n=n/10;			//10 as des
//		}
//		System.out.println(ans);
	}

}
