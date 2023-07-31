package 학생관리프로그램;

import java.util.Scanner;

public class PokeMain {

	public static void main(String[] args) {

		// 1. 게임에서 사용할 포켓몬 두마리 생성
		Pokemon pairi = new Pokemon("파이리", "불타입", 300, 1000, "불꽃세례~!");
		Pokemon kkobuk = new Pokemon("꼬부기", "물", 350, 2000, "물대포~!!");

		// 2. 사용자로부터 포켓몬을 선택하게끔 만들기
		System.out.println("포캣몬을 선택하세요. >> 1. 파이리 2. 꼬부기");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		if (num1 == 1) {
			System.out.println("파이리를 선택하셨습니다");
			System.out.println();
		} else {
			System.out.println("꼬북이를 선택하셨습니다");
			System.out.println();
		}
		// 3. 포켓몬 선택 후 공격
		while (kkobuk.getHp() > 0 && pairi.getHp() > 0) {
			System.out.println("선택한 공격유형으로 서로 공격을 한번씩 주고 받습니다!!");
			System.out.print("공격유형을 선택하시오. >> 1. 일반공격 2. 스킬공격");
			int num2 = sc.nextInt();
			if (num1 == 1) {// 파이리 선택
				if (num2 == 1) {// 일반공격 선택
					System.out.println("일반공격 선택!!");
					System.out.println();
					kkobuk.setHp(kkobuk.getHp() - pairi.getAtk());
					pairi.setHp(pairi.getHp() - kkobuk.getAtk());
				} else {// 스킬공격 선택
					System.out.println("스킬공격 선택!!");
					System.out.println();
					kkobuk.setHp(kkobuk.getHp() - (int) (1.5 * pairi.getAtk()));
					pairi.setHp(pairi.getHp() - (int) (1.5 * kkobuk.getAtk()));
				}
			}
			
			if (num1 == 2) {// 꼬북이 선택
				if (num2 == 1) {// 일반공격 선택
					System.out.println("일반공격 선택!!");
					System.out.println();
					pairi.setHp(pairi.getHp() - kkobuk.getAtk());
					kkobuk.setHp(kkobuk.getHp() - pairi.getAtk());
				} else {// 스킬공격 선택
					System.out.println("스킬공격 선택!!");
					System.out.println();
					pairi.setHp(pairi.getHp() - (int) (1.5 * kkobuk.getAtk()));
					kkobuk.setHp(kkobuk.getHp() - (int) (1.5 * pairi.getAtk()));
				}
			}
			// 체력이 바닥났을 때 탈출
			if (kkobuk.getHp() < 0 || pairi.getHp() < 0) {
				break;
			} else {
				System.out.println("파이리 체력 : " + pairi.getHp());
				System.out.println("꼬부기 체력 : " + kkobuk.getHp());
				System.out.println();
			}

		}

		if (pairi.getHp() < 0) {
			System.out.println("꼬부기 승리!!!");
			System.out.println("파이리 체력 : " + 0);
			System.out.println("꼬부기 체력 : " + kkobuk.getHp());
			System.out.println();
		} else {
			System.out.println("파이리 승리!!!");
			System.out.println("파이리 체력 : " + pairi.getHp());
			System.out.println("꼬부기 체력 : " + 0);
			System.out.println();
		}
	}
}