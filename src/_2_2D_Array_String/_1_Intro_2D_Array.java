package _2_2D_Array_String;

import java.util.*;

public class _1_Intro_2D_Array {

	public static void main(String[] args) {
	
//		int[][] arr=null;
		int[][] arr=new int[3][4];//array is stored in heap of 1 1-d array of size 3 in some location and 3 1-d array of size 4 in some location  because array is inbuild class
		System.out.println(arr);//by default address of arr is null(arr stores address of that 1 1-d array of size 3)
		System.out.println(arr[1][2]);//first index of 1 1-d array of size 3 and second index of that first index 
		
		
		int[][] ar=new int[3][];
		//by this firstly 1 1-d is created of size 3 and bydefault value of these blocks are null;
		System.out.println(ar[1]);
		
		// we can't initialize array like this-->
//		int[][] ar1=new int[][];
//		int[][] ar2=new int[][2];
		
		int[][] other=arr;
		//by this line no 2-D array is created because other is also point out the array arr
		System.out.println(arr);
		
		
		//length of row
		System.out.println(arr.length); //size of 1 1-d array of size 3
		//length of col
		System.out.println(arr[0].length);//size of zero index array(size 4) of 1 1-d array
		
		//put our all elements of an array
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int[][] array=new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				array[i][j]=sc.nextInt();
			}
		}
		
		//print our all elements of an array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//Jagged Array---> A jagged array is an array of arrays such that member arrays can be of different sizes,

		
	}

}
