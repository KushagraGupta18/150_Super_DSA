package _0_Number_System_and_data_types;
import java.util.*;
public class _5_Conversion_Any_to_any {

	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int src=sc.nextInt();
        int des=sc.nextInt();
        int n=sc.nextInt();
        
        //src to dec
        int ans=0;
        int mul=1;
        while(n>0){
            int rem=n%10;
            ans=ans+rem*mul;
            mul=mul*src;
            n=n/10;
        }

        //dec to des
        int ans1=0;
        int mul1=1;
        while(ans>0){
            int rem=ans%des;
            ans1=ans1+rem*mul1;
            mul1=mul1*10;
            ans=ans/des;
        }
        System.out.println(ans1);
	}

}
