package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {

		// 키보드 연결
		Scanner scanner = new Scanner(System.in);

		// 게임 시작
		while (true) {
			
			// 수 결정하기
			int min = 1;
			int max = 100;
			Random random = new Random();
			int correctNumber = random.nextInt( max ) + min;

			// 맞추기 시작
			int tryCount = 1;
			while (true) {
				System.out.println(min + "-" + max);
				System.out.print(tryCount + ">>");

				int guessNumber = scanner.nextInt();

				// 맞췄음
				if (guessNumber == correctNumber) {
					System.out.println("맞았습니다.");
					break;
				}

				// 틀렸음
				tryCount++; // 횟 수 증가
				if (guessNumber > correctNumber) {
					System.out.println("더 낮게");
					max = guessNumber; // 추측 범위 조정
				} else {
					System.out.println("더 높게");
					min = guessNumber; // 추측 범위 조정
				}
			}

			// 한번 더?
			System.out.print("다시 하시겠습니까?(y/n)>>");
			String answer = scanner.next();
			if ("y".equals(answer) == false) { // "y"가 아니면
				break;
			}
		}
		
		// 자원 정리
		scanner.close();
	}
}