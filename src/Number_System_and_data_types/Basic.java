package Number_System_and_data_types;

public class Basic {

	public static void main(String[] args) {
		//decimal(base 10)--->0 to 9
		int x=67;
		System.out.println(x);
		
		//binary(2)---->0 to 1
		int y=0b101;
		System.out.println(y);
	
		//octal(8)---> 0 to 7
		int z=067;
		System.out.println(z);
		
		//hexadecimal(16)---> 0 to 9 and A to F
		int a=0xA;
		System.out.println(a);
		
		
		//Conversion of decimal to all bases
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toOctalString(10));
		
		
		
		byte a1=(byte) 300;
		System.out.println(a1);
		
		
		char ch=(char)65;
		System.out.println(ch);
		
		int num=(int)'A';
		System.out.println(num);
		
		
		long l=23484754327l;
		System.out.println(l);
	
		
		float f=2.35f;	
		System.out.println(f);
		
		double d=2.35;
		System.out.println(d);
		
		boolean bt=true;
		System.out.println(bt);
		 
		
		//b++--->b=(byte)(b+1) --->do implicit typecasting itself   and if we write (b+1) if the no. is out of range then we have to do type casting externally
//		for(byte b=0;b<=128;b++) {//infinite loop    // b++-->implicit type casting ----> 128 is converted to -128 in byte then loop will continue
//			System.out.println(b);
//		}

		
		
		byte aa=1;
		byte bb=2;
		byte cc=(byte)(aa+bb);		//for byte and short it is compulsory to type caste the number either it is in range or not
		System.out.println(cc);
	
	
	} 


	
	
	
}
