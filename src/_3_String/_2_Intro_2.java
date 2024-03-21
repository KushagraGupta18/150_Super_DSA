package _3_String;

public class _2_Intro_2 {

	public static void main(String[] args) {
		
		String str="hello";
		String str1="hello";
		String st=new String("hello");
		String st1=new String("hello");
		System.out.println(st1==st); //it always compares address
		System.out.println(st1.equals(st));
		String str7="hii";
		String str8="hii";
		System.out.println(str7==str8);//str7 and str8 are pointing out at same address in heap.
		
		String s="hell"+"o"; //it makes hello directly and check for hello in string pool because there is content not address(both hell and o are content not in address)
		System.out.println(str==s);
		
		String s1="hell";
		s1=s1+"o";//it creates hello outside the string pool and address of s1 and str is different
		System.out.println(str==s1);//
		
	
	}

}
