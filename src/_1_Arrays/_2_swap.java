package _1_Arrays;

public class _2_swap {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		System.out.println(arr[0]+" "+arr[1]);
		swap1(arr[0],arr[1]);
		System.out.println(arr[0]+" "+arr[1]);//it give same value it do not swap the values because array is created in heap and in function a and b are only local variables after removing function from call stack all we see that our values of array are not change.
		
		
		
		swap2(arr,0,1);
		System.out.println(arr[0]+" "+arr[1]);//swapping will be done because we do changes inside the array that is in heap. values of arrays are changes in heap because in function arr is also pointing out same array that we create in our heap
	
		
		
		int[] arr5= {10,20,30,40};
		int [] other= {100,200,300,400};
		System.out.println(arr5[0]+" "+other[0]);
		swap3(arr5,other);
		System.out.println(arr5[0]+" "+other[0]); //after function is removed from call stack all changes are changed our arrr5 and other are pointing out sames array in heap
		//jab tk tum ghr mai ghuskr change nhi maroge tbtk swap nhi hongi tum bs address ko change kr rhe the  thats why our java is call by value not call by reference(address). 
		//java is call by value not call by reference.
	} 

	public static void swap3(int[] arr5, int[] other) {
		int[] temp=arr5;
		arr5=other;
		other=temp;
		
	}

	private static void swap2(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

	public static void swap1(int a, int b) {
		int temp=a;
		a=b;
		b=temp;
		
	}

}
