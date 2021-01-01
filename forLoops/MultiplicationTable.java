package forLoops;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.print('*' + " ");
		for(int i=1; i<=20; i++) {
			System.out.print(i+ " ");
		}
		System.out.println();
		for(int num=1; num<=11;num++) {
			System.out.print(num + " ");
			
			for(int mul=1; mul<=20; mul++) {
				System.out.print(num*mul+ " ");
			}
			System.out.println();
		}
	}

}
