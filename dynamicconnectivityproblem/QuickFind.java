package dynamicconnectivityproblem;

import java.util.Arrays;

public class QuickFind {

	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i=0; i<arr.length;i++) {
			arr[i] = i;
		}
		System.out.println("Initial Array is: "+Arrays.toString(arr));
		union(arr, 0, 9);
		union(arr, 6, 8);
		System.out.println("Connected Array is: "+Arrays.toString(arr));
		System.out.println("They are connected: " + connected(arr, 0, 1));
		union(arr, 0,1);
		System.out.println("They are connected: "+ connected(arr, 0, 1));
		union(arr, 4,5);
		

	}
	
	public static void union(int[] arr,int a, int b) {
		for (int i = 0; i< arr.length; i++) {
			if (arr[a] == arr[b]) {
				return;
			} else if (i != a && arr[i] == arr[a]){
				arr[i] = arr[b];
			}
		}
		arr[a] = arr[b];
		
		System.out.println("Connected Array is: "+Arrays.toString(arr));
		
	}
	
	public static boolean connected(int[] arr, int a, int b) {
		return (arr[a] == arr[b]);
	}

}
