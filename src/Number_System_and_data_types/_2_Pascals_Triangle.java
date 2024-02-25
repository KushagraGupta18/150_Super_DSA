package Number_System_and_data_types;

public class _2_Pascals_Triangle {

	
//	1 			--->0c0
//	1 1 		--->1c0 1c1
//	1 2 1 		--->2c0 2c1 2c2
//	1 3 3 1 	--->3c0 3c1 3c2
//	1 4 6 4 1 		--->and so on	
//	1 5 10 10 5 1 
	
	//nC(r+1)=(((n-r)*nCr)/(r+1))
	
	public static void main(String[] args) {
		int n=6;
		int row=0;
		int star=1;
		while(row<n) {
			int i=0;
			int ncr=1;
			while(i<star) {
				System.out.print(ncr+" ");
				ncr=((row-i)*ncr)/(i+1);
				i++;
			}
			row++;
			star++;
			System.out.println();
		}
	}

}
