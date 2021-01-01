package arrayinjava;
import java.util.Scanner;
public class UserArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// take input from user asking size of array
		int size = sc.nextInt();
		//create the array defining memory location(size) 
		int[] arr = new int[size];
		// insert the data into the array
		for(int i=0; i < size; i++) {
			System.out.println("Insert your item in the arry's index: "+ i);
			arr[i]= sc.nextInt();
		}
		// display the array
		for(int j:arr) {
			System.out.println("Our data in arry is "+ j);
		}
		sc.close();
	}
}
