package arrayOperation;
import java.util.Arrays;
import java.util.Scanner;
public class RemoveItem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {0,1,2,0,4,5};
		System.out.println("The array: "+ Arrays.toString(arr));
		System.out.println("Which index do you want to remove from the array??? ");
		int index = sc.nextInt();
		
		System.out.println("Array after removing item: "+ Arrays.toString(remove(arr, index)));
		sc.close();

	}
	public static int[] remove(int[] arr, int index) {
		for (int i = index; i< arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = 0;
		return arr;
	}
}
