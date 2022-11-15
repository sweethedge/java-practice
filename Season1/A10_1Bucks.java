package original;

import java.util.Scanner;

public class A10_1Bucks {

	public static void main(String[] args) {
		// 일단은 스캐너 설치.
		Scanner sc = new Scanner(System.in);
		// 입력받을 변수 선언. (받은 금액)
		System.out.print("금액을 입력하시오 : ");
		// 입력받은 값을 대입
		int num = sc.nextInt();
		// 일단 입력받은 값이 얼마인지 표기
		System.out.println(num + "원");
		// 권종별 배열 선언
		int [] e = {50000, 10000, 5000, 1000};
		// 0부터 시작해서 배열의 길이 전까지 도는 반복문 개막
		for (int i = 0; i < e.length; i++) {
			// 그 배열로 나눈 값을 출력
			System.out.println(num / e[i] + "장");
			// 나눈 나머지를 입력된 값에 대입
			num %= e[i];
		}
		// 스캐너 문닫기
		sc.close();
	}
}