package arrayinjava;
import java.util.Scanner;
public class FootballClub {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		pattern(number);
		sc.close();
	}	
	 
	public static void pattern(int n){
		for(int i = 1; i<=n; i++){
		    for(int j=1; j<=i; j++){
			System.out.print("* ");
		    }
		    System.out.println();
		}
    }
}
