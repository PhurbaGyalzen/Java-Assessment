package arrayinjava;

public class RubicCubeCampions {

	public static void main(String[] args) {
		double[] speed = {23,6,3.9,7,6.6,12,11,10.4,8};
		System.out.println("The world record is: " + findChampion(speed));;
	}
	public static double findChampion(double[] speed) {
		
		int size = speed.length;
		double min= speed[0];
		for(int i= 1; i<size; i++) {
			if(min>speed[i]) {
				min = speed[i];
			}
		}
		
		return min;
	}
}
