package Number_System_and_data_types;
import java.util.*;
public class _3_Inverse_Number {

	
	public static void main(String[] args) {
		int num=32145;
		int a=1;
		int ans=0;
		while(num>0) {
			int rem=num%10;
			ans=(int) (ans+a*Math.pow(10, rem-1));
			a++;
			num=num/10;
		}
		System.out.println(ans);
		
	}
}
