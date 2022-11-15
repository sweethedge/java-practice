package original;

import java.util.Scanner;

public class A06Currency {

	public static void main(String[] args) {
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 입력하라는 메시지 출력
		System.out.print("달러를 입력하시오 : ");
		// 정수 변수 선언
		int num;
		// 입력받은 값을 정수 변수에 인입
		num = sc.nextInt();
		// 출력. 1달러 : 1350원
		System.out.println(num + " 달러 → " + num*1350 + "원");
		// 스캐너 문닫기
		sc.close();
	}
}