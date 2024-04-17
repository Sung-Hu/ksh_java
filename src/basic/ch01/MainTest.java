package basic.ch01;

import java.util.Scanner;

public class MainTest {
//코드의 시작점 -->실행의 흐름을 만들수 있다.
	public static void main(String[] args) {
		
		Warrior wo1 = new Warrior("작은오크", 10);
		Warrior wo2 = new Warrior("큰오크", 30);
		Wizard wz1 = new Wizard("7급마법사", 70);
		
		System.out.println("작은오크 가 7급마법사 를 몇번 공격하시겠습니까?");
		Scanner sc = new Scanner(System.in);
		int inputData = sc.nextInt();
		
		for(int i = 0; i < inputData; i++) {
		wo1.attackWizard(wz1);
		}
		
		
		System.out.println("큰오크 가 7급마법사 를 몇번 공격하시겠습니까?");
		Scanner sc1 = new Scanner(System.in);
		int inData = sc.nextInt();
		
		for(int i = 0; i < inData; i++) {
		wo2.attackWizard(wz1);
		}
		
		System.out.println("마법사 hp 확인 : " + wz1.hp);
	}//end of main

}//end of class
