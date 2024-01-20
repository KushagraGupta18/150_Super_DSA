//leetcode question number--->907
package Good_Questions;
import java.util.*;

//description of an answer--->
//1....Left and Right Boundaries Calculation:
//
//.The code uses two arrays (left and right) to store the left and right boundaries of each element.
//.It iterates through the array twice, once from left to right and once from right to left, using a stack to keep track of relevant indices.
//.(such as stock span)-->The left boundary of an element is the index of the previous small or equal element(-1 means equal element), and the right boundary is the index of the next smaller element.
//.The stack helps in efficiently finding these boundaries.

//2....Sum Calculation:
//
//The code then calculates the sum of minimum values for each subarray.
//It uses the left and right boundaries to determine the size of the subarray for each element.
//The formula (i - left[i]) * (right[i] - i) * arr[i] represents the contribution of the minimum value of the subarray with the element at index i.
//The modulo operation is applied to avoid integer overflow.

//3....Final Result:
//
//The final result is the sum of minimum values of all subarrays, and it is returned as an integer.
public class Sum_Of_Subaaray_Minimums {

	public static void main(String[] args) {
		int[] arr= {3,1,2,4};
		System.out.println(sumSubarrayMins(arr));
	}
	public static int sumSubarrayMins(int[] arr) {
		// Get the length of the input array
        int length = arr.length;
        
        // Initialize two arrays to store the left and right boundaries for each element
        int[] left = new int[length];
        int[] right = new int[length];
      
        // Initialize the left array with -1 and the right array with the length of the array
        Arrays.fill(left, -1);
        Arrays.fill(right, length);
      
        // Initialize a stack to keep track of indices
        Deque<Integer> stack = new ArrayDeque<>();
      
        // Process the array from left to right to find the left boundaries
        for (int i = 0; i < length; ++i) {
            while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                left[i] = stack.peek();
            }
            stack.push(i);
        }
      
        // Clear the stack for the next iteration
        stack.clear();
      
        // Process the array from right to left to find the right boundaries
        for (int i = length - 1; i >= 0; --i) {
            while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                right[i] = stack.peek();
            }
            stack.push(i);
        }
      
        // Initialize variables for modulo operation and the final answer
        int mod = (int) 1e9 + 7;
        long answer = 0;
      
        // Calculate the sum of minimum values for each subarray
        for (int i = 0; i < length; ++i) {
            answer += (long) (i - left[i]) * (right[i] - i) % mod * arr[i] % mod;
            answer %= mod;
        }
      
        // Convert the final answer to an integer and return it
        return (int) answer;
    }

}
