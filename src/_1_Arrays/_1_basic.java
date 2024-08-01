package _1_Arrays;
import java.util.*;
public class _1_basic {

	public static void main(String[] args) {
		
		//Array is a contiguos memory location of n size and it contains same datatype value(i.e. homogenous)
		//arrays is a inbuild class in java and all classes that are inbuild or that we made are non-primitive datatypes.
		//we have to initialize first before accessing variables.
		int[] arr=null;//this indicates 1 d array
		System.out.println(arr);//bydefault address of arr is null.
//		array stores the starting address of a block.
		
		
		
		int[] arr1=new int[5];//by new keyword memory is allocated in the heap.
		//firstly jvm read this line and by new int[5] heap allocate memory for storing array contiguos.
		System.out.println(arr1);//it gives the base address i.e it gives the address of their first block and each block contains 4 byte
//		address is store contigous
		//		0th idx-->2000(2k)
		//		1st idx--->2004
		//		2nd idx--->2008
		//		3rd idx--->2012
		
		
		 System.out.println(arr1[2]);//2k+idx*4--->2008(gives the value of address 2008)
//		 System.out.println(arr1[5]);//-->it will give error out of bound exception
		 
		 System.out.println(arr1.length);
		 
		 //all primitive datatypes are allocating their variable in stacks and all non primitive data types and all classes that are inbuild or that we made are allocating their memory in heap 
		 int[] freq=new int[2];
		 int val=0;
		 System.out.println(freq[0]);
		 System.out.println(val);
		 fun(freq,val);	//actual parameter
		 System.out.println(freq[0]);//by this we can see that our value of freq[0]is remains same after removal of function from call stack thats why we can say that our new array is created in local function and it point out to the same address it do changes in the same address. it do permanent changes . By this we can say that array are stored in heap
		 System.out.println(freq[1]);
		 System.out.println(val);//by this we can see that our value  is changed after removal of function from call stack thats why we can say that our new variable val  is created in local function and int is primitive datatype it allocates memory in stack not in heap.any by removing of function from call stack value again changed and same as previous one
		 
		 
		 
		 
		 
		 int a=10;
		 int[] arr4= {10,20,30,40,50};
		 int[] othr=arr4;
		 //by this lines it creates one array of size 5 in heap and both array point out same array from heap.
		 
		 
	}

	public static void fun(int[] freq, int val) {	//formal parameter
		freq[0]=1;
		freq[1]=1;
		val=90;
	}

}