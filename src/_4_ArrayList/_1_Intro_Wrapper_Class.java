package _4_ArrayList;

public class _1_Intro_Wrapper_Class {

	public static void main(String[] args) {
		
		Integer a=100;	//this is stored in heap memory because it is a wrapper class and clas are non-primitive
		
		int a1=100;		//this is stored in stack because it is primitive datatype
		
		System.out.println(a);
		System.out.println(a1);
		
		Short s1=78;
		Byte b1=19;
		System.out.println(s1);
		System.out.println(b1);
		
		
		Integer b=100;
		int b2=10;
		b=b2;//int--->Integer   Autoboxing(primitive ko ek wrapper ke andr likhte hai to that is called autoboxing)
		System.out.println(b);//10
		
		Integer ii=100;
		int i=10;
		i=ii;//Integer--->int   Unboxing(wrapper class ko ek primitive ke ande likhte hai that is called Unboxing)
		System.out.println(i);
		
		
		
		//Important
		Integer c1=19;
		Integer c2=19;
		System.out.println(c1==c2);//true
		Integer d1=190;
		Integer d2=190;
		System.out.println(d1==d2);//false
		//There is cache in Wrapper class(IntegerCache,ShortCache,LongCache). If our values lie between -128 to +127 than it does not give other aaddress it points out at the same address for same value but for outside this range our cache will point out different address for same value
		
		
		
	}
	
}
