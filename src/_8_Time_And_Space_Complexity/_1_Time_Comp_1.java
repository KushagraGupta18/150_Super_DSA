package _8_Time_And_Space_Complexity;

public class _1_Time_Comp_1 {

	public static void main(String[] args) {
		//complexity can never be hardware dependent.
		//if we find out start time and end time difference then it is always system dependent that means hardware dependent which is not feasible.
		long start=System.currentTimeMillis();
		for (int i = 0; i < 1000000000; i++) {
		}
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		
		
		//Asymptotic Notation(that is not system dependent)--->linear, quadratic,exponential,logathmic
		//we start to talk in the terms of n
		//there are of three type--->
			//1. Worst Case 	(big O)
			//2. Average Case	(big theta)
			//3. Best Case		(big Omega)
		
		
		
	}

}
