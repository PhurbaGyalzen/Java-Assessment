package arrayinjava;

public class Temperature {
	public static void main(String[] args) {
		double[] temp = {45.6, 66,7.8,55};
		
		//use of for loop in single dimensional array
		for (int i =0; i<temp.length; i++) {
			System.out.println(temp[i]);
		}
		
		// for each for single dimensional array
		
		for(double i:temp) {
			System.out.println(i);
		}
	}
}
