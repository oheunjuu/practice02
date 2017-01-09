package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5_1 {

	public static void main(String[] args) {
		// Randomize 하기
		Random random = new Random();
		int num = random.nextInt(10) + 1; // 0에서부터 9
		// System.out.println(num);
		Scanner scanner = new Scanner(System.in);
		System.out.print("다시 하시겠습니까? (y/n)");
		String answer = scanner.next();
		System.out.println(answer.equals("y"));
		// if(answer.equals("y")==true){
		//
		// }
	}
}