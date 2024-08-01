package _15_OOPS_2;
import java.util.*;
public class _6_Employees {
	String name;
	int salary;
	public _6_Employees(String name, int salary) {
		this.name=name;
		this.salary=salary;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=79;
		int N=4;
		_6_Employees[] arr=new _6_Employees[N];
		for(int i=0;i<N;i++) {
			String str=sc.next();
			int n=sc.nextInt();
			_6_Employees pp=new _6_Employees(str,n);
			arr[i]=pp;
		}
		Arrays.sort(arr,new Comparator<_6_Employees>() {

			@Override
			public int compare(_6_Employees o1, _6_Employees o2) {
				if(o1.salary==o2.salary) {
					return o1.name.compareTo(o2.name);
				}
				else {
					return o2.salary-o1.salary;
				}
			}
			
		});
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].salary>=x) {
				System.out.println(arr[i].name+" "+arr[i].salary);
			}
		}
	}
}