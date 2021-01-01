package arrayOperation;
import java.util.Arrays;
public class RainProblem {

	public static void main(String[] args) {
		int[] height = {2,0,4,1,4};
		System.out.println("Height Array: "+ Arrays.toString(height));
		function(height);

	}
	public static void function(int[] height) {
		int length = height.length;
		
		int total = 0;
		if (length >2) {
			int[] leftArray = new int[length];
			int[] rightArray = new int[length];
			
			leftArray[0] = height[0];
			for (int i=1; i<length; i++) {
				leftArray[i] = Math.max(height[i],leftArray[i-1]);
			}
			System.out.println("Left Array: "+ Arrays.toString(leftArray));
			
			rightArray[length-1] = height[length-1];
			for (int i = length-2; i>-1;i-- ) {
				rightArray[i] = Math.max(height[i], rightArray[length-1]);
			}
			System.out.println("Right Array is: "+Arrays.toString(rightArray));
			
			for (int i = 0; i<length;i++) {
				total = total + (Math.min(rightArray[i], leftArray[i])-height[i]);
			}
			
			System.out.println("The total unit of water that can be stored: "+ total + " unit(s).");
		
		} else {
			System.out.println("Rain water cannot be stored.");
		}
		
		
	}

}
