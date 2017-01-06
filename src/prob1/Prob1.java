package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		final int[] WONS = 
			{ 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };  
		
		Scanner scanner = new Scanner( System.in );
		
		System.out.print( "금액:" );
		int money = scanner.nextInt();
		
		for( int won : WONS ) {
			int count = money / won;
			money -= ( count * won );
			System.out.println( won + "원:" + count + "개" );
		}
		
		scanner.close();
	}
}