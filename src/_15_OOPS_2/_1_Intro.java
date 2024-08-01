package _15_OOPS_2;
import java.util.*;
public class _1_Intro {

	public static void main(String[] args) {
		
		Integer [] arr= {10,20,30,40,50};
		display(arr);
		String[] arr1= {"abc","def","efg"};
		display(arr1);	//wrong way(when passed in normal function)

		
		
	}
//	public static void display(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();
//	}
	
	
	//generic function
	public static <T> void display(T[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	

}
