package _3_String;

public class _7_Maximum_CB_Number {

	public static void main(String[] args) {
		String str="692239";
		
		int count=0;
		boolean[] freq=new boolean[str.length()];
		//1. generate lengthwise substring
		for(int len=1;len<=str.length();len++) {
			for(int j=0;j<=str.length()-len;j++) {
				//System.out.println(str.substring(j,j+len));//is CB Number
				
				//string to integer---> Integer.parseInt("585")
				//string to long------> Long.parseLong("585")
				
				//Integer to string----> Integer.toString(585);
			
				if(isCBNum(Long.parseLong(str.substring(j, j+len)))) {
					//3. already ksisi ke saath cb number na bana ho
					boolean flag=true;
					for(int x=j;x<j+len;x++) {
						if(freq[x]==true) {
							flag=false;
							break;
						}
						else {
							//4. visited
							freq[x]=true;
						}
					}
					
					if(flag==true) {
						count++;
					}
				}
			}
		}
		System.out.println(count);
		
	}

	//2. check for cb number
	public static boolean isCBNum(long n) {
		int[] arr= {2,3,5,7,11,13,17,19,23,29};
		//point1
		if(n==0 || n==1) {
			return false;
		}
		//point2
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				return true;
			}
		}
		
		//point 3
		for(int i=0;i<arr.length;i++) {
			if(n%arr[i]==0){
				return false;
			}
		}
		return true;
		
	}

}
