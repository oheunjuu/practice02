package prob1;

import java.util.Scanner;

public class Prob1 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("금액: ");

		int input = scanner.nextInt();

		final int[] wons = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		for (int won : wons) {

			int count = input / won;

			input = input - (count * won);

			System.out.println(won + "원: " + count + "개 ");

		}

		scanner.close();

	}

}