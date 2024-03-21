package _2_2D_Array_String;
import java.util.*;
public class _2_Jagged_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Jagged Array---> A jagged array is an array of arrays such that member arrays can be of different sizes,
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[][] arr=new int[n][];
		for (int i = 0; i < arr.length; i++) {
			int c=sc.nextInt();
			arr[i]=new int[c];
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
