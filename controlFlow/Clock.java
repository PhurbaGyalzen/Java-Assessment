package controlFlow;
import java.util.Scanner;
import java.time.LocalTime;
public class Clock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the hour: ");
		int hour = sc.nextInt();
		System.out.println("Enter the min: ");
		int min = sc.nextInt();
		alram(hour, min);
		sc.close();
	}
	public static void alram(int hour, int min) {
		boolean on = checkAlram(hour, min);
		while(on){
			beep();
			on = checkAlram(hour, min);
		}
		
	}
	public static boolean checkAlram(int hour, int min) {
		LocalTime time = LocalTime.now();
		if (hour==time.getHour() && min==time.getMinute()) {
			return true;			
		}
		return false;
	}
	public static void beep() {
		System.out.println("beep beep beep");
	}
}
