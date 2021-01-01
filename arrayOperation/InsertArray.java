package arrayOperation;
import java.util.Arrays;
import java.util.Scanner;
public class InsertArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of array: ");
		int length = sc.nextInt();
		int[] arr = new int[length];
		int count = 0;
		for (int i=0; i<arr.length; i++) {
			System.out.print("Press 'i' to insert value into the array or press anyother key to quit: ");
			char oper = sc.next().charAt(0);
			System.out.println();
			if (oper == 'i') {
				System.out.print("Enter the value for index " + i +": ");
				int value = sc.nextInt();
				arr[i] = value;
				count = count + 1;
			} else {
				break;
			}
			
		}
		System.out.println("The array formed is: "+ Arrays.toString(arr));
		
		if (arr.length == count) {
			System.out.println("You cannot insert more value the array is full.");
		}else {
			System.out.println("In which index do you want to insert? ");
			int index = sc.nextInt();
			System.out.println("Enter value: ");
			int value = sc.nextInt();
			System.out.println("The arry after insertion is: " + Arrays.toString(insert(arr,index,value,count)));
		}
		sc.close();
	}
		
	public static int[] insert(int[] arr, int index, int value, int count) {
		for (int i = index + 1; i < count; i++) {
			arr[i] = arr[i-1];
		}
		arr[index] = value;

	
		return arr;
	}
}