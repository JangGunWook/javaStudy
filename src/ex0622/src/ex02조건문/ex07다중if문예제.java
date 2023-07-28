package ex02조건문;

import java.util.Scanner;

public class ex07다중if문예제 {

	public static void main(String[] args) {
		
		// int타입의 변수 totalScore를 선언하고 키보드로 값을 입력 받으세요.
		// totalScore가 90점 이상이면 "A학점"입니다.
		// 80점 이상 90점 미만일 경우 "B학점"입니다.
		// 70점 이상 80점 미만일 경우 "C학점"입니다.
		// 70점 밈나일 경우 "D학점"입니다.를 출력하는 프로그램을 만드세요
		Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요: ");
        int totalScore = scanner.nextInt();

        if (totalScore >= 90) {
            System.out.println("A 학점");
        } else if (totalScore >= 80) {
            System.out.println("B 학점");
        } else if (totalScore >= 70) {
            System.out.println("C 학점");
        } else {
            System.out.println("D 학점");
        }
		

	}

}
