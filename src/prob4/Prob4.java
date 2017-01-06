package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		
		char[] c = reverse( s );
		printCharArray( c );
		
		scanner.close();
	}
	
	public static char[] reverse(String str) {
		char[] c = str.toCharArray();
		for( int i = 0; i < c.length / 2; i++){
			char temp = c[ i ]; 
			c[ i ] = c[ c.length - (i + 1 )  ];
			c[ c.length - (i + 1) ] = temp;
		}
		
		return c;
	}

	public static void printCharArray(char[] array){
		System.out.println( array );
	}
}
