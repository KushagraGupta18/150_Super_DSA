package _2_2D_Array_String;

public class _5_2D_Binary_Search {

	public static void main(String[] args) {
		int [][] arr= {{28,33,45},{30,34,46},{57,68,77}};
		//we have to choose any corner from right-top corner or left bottom corner because at this positions there are two possibilities greater and less than that number
		
		int ele=57;
		System.out.println(bin(arr,ele));
	}
	public static boolean bin(int[][] arr, int ele) {
		int row=0;
		int col=arr[0].length-1;
		while(row<=arr.length-1 && col>=0) {
			if(arr[row][col]==ele) {
				return true;
			}
			else if(arr[row][col]<ele) {
				row++;
			}
			else {
				col--;
			}
		}
		return false;
	}

}
