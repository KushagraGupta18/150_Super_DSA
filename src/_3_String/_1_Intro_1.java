package _3_String;

public class _1_Intro_1 {

	public static void main(String[] args) {
		//string is non-primitive datatype and immutable in nature
		String str="hello";//6k
		String str1="hello";//6k
		//they both are pointing at same memory that is created inside the heap. there is some special part of memory in heap by the name of string pool/intern pool in which all our strings are take the memory
		//that means they both are pointing out same address in string pool
		
		String str2=new String("hello");//11k
		//by new keyword string is not created in the pool.
		//it is made outside the pool but inside the heap.
		
		str=str+"bye";//10k it takes memory outside the string pool outside the string pool and create a string inside a heap at any particular location
		String str4="hello".concat(str);//14k
		//by + and concat and user input our string is created outside string pool but inside heap.
		//String immutable means at same address we cant change anything we have to take any other addreess for do concat in the string.
		
		
		System.out.println(str.length());//length is a method of string class
		
	}
	
	

}
