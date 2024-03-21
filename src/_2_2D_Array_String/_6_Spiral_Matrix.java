package _2_2D_Array_String;

public class _6_Spiral_Matrix {

	public static void main(String[] args) {
		
		int[][] arr= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int srow=0;
		int erow=arr.length-1;
		int scol=0;
		int ecol=arr[0].length-1;
		int totalele=arr.length*arr[0].length;
		int count=0;
		while(count<totalele) {
			for(int i=scol;i<=ecol && count<totalele;i++) {
				System.out.print(arr[srow][i]+" ");
				count++;
			}
			srow++;
			for(int i=srow;i<=erow && count<totalele;i++) {
				System.out.print(arr[i][ecol]+" ");
				count++;
			}
			ecol--;
			for(int i=ecol;i>=scol && count<totalele;i--) {
				System.out.print(arr[erow][i]+" ");
				count++;
			}
			erow--;
			for(int i=erow;i>=srow && count<totalele;i--) {
				System.out.print(arr[i][scol]+" ");
				count++;
			}
			scol++;
			
		}
	}

}
