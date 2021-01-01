package arrayinjava;

public class WeekTemp {

	public static void main(String[] args) {
		double[] temp = {45.6, 66,7.8,55,45.6, 66,7.8};
		int result = (int)avg(temp);
		System.out.println("Average week temp is: "+result);
	}
	public static double avg(double temp[]) {
		int size = temp.length;
		double total =0;
		for(int i=0; i<size; i++) {
			total += temp[i];
		}
		return total/size;
	}
}
