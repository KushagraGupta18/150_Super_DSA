package _15_OOPS_2;

public class _2_Intro_2<T,U> {

	T x;
	U y;
	
	
	public static void main(String[] args) {
		_2_Intro_2<Integer,Boolean> obj=new _2_Intro_2<>();
		obj.x=10;
		obj.y=false;
		System.out.println(obj.x+" "+obj.y);
	}
}
