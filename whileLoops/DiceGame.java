package whileLoops;
import java.util.Scanner;
public class DiceGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("select 6 face dice or 10 face dice");
		System.out.println("Enter the number: ");
		int range = sc.nextInt();
		int diceFace = randomNumber(range);
		if(range == 6) {
			while (true) {
				System.out.println("The dice face is: "+ diceFace);
				if(diceFace == 6) {
					System.out.println("You win.");
					break;
				} else if (diceFace ==3){
					System.out.println("You lose.");
					break;
				}
				diceFace = randomNumber(range);
			}
		} else if(range == 10){
			while (true) {
				System.out.println("The dice face is: "+ diceFace);
				if(diceFace == 10) {
					System.out.println("You win.");
					break;
				} else if (diceFace == 7) {
					System.out.println("You lose.");
					break;
				}
				diceFace = randomNumber(range);
			}
		} else {
			System.out.println("Wrong input... Please try again...");
		}
		sc.close();
	}
	public static int randomNumber(int range) {
		// random number form 0 to almost(1)

		double randomNumber = Math.random();

		 // changing range to 0 - almost(10)

		 randomNumber = randomNumber * range;
		
		 //casting to integer
		 int randomInt = (int)randomNumber;

		 // shifting to range of 10
		 randomInt = randomInt + 1;

		return randomInt;
	}
}
