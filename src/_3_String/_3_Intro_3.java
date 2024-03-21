package _3_String;

public class _3_Intro_3 {

	public static void main(String[] args) {
		String str="abcdef";
		System.out.println(str.charAt(3));
		
		System.out.println(str.substring(2,5));//last index is not included
		System.out.println(str.substring(2));//it give full string after index 2
//		System.out.println(str.substring(2,9));//array index out of bound
		System.out.println(str.substring(1,1));//kuch bhi nhi
		
		String s1="hello";
		System.out.println(str.concat(s1));
		
		String s2="Abcdef";
		System.out.println(str.compareTo(s2));
		//if str is bigger than s2 than it gives positive value and if it is smaller than it gives -ive value and if they are equal than it gives 0
		
		String st="hello";
		System.out.println(st+10+20);//hello1020(1020 is added in string st so it gives the string "hello1020"
		System.out.println(st+(10+20));//hello30 (bracket phle solve hoga)
		System.out.println(10+20+st);//30hello(firstly 10 and 20 are added and it equals to 30 then it adds the hello string and gives the answer 30hello
		
		
		
	}
	

}
