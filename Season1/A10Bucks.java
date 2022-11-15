package original;

import java.util.Scanner;

public class A10Bucks {

	public static void main(String[] args) {
		// 일단은 스캐너 설치.
		Scanner sc = new Scanner(System.in);

		// 입력받을 변수 선언. (받은 금액)
		System.out.print(" 금액을 입력하시오 : ");
		// 입력받은 값을 대입
		int one = sc.nextInt();
		// 권종 별 변수 선언.
		// 5만원
		int a = one / 50000; 
		// 만원
		int b = (one - (a * 50000)) / 10000; 
		// 5천원
		int c = (one - (a * 50000 + b * 10000)) / 5000; 
		// 천원
		int d = (one - (a * 50000 + b * 10000 + c * 5000)) / 1000;  
		// 스캐너 문닫기
		sc.close();
		// 프린트
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}

// for 문을 찍어서 예쁘게 코드를 짜도 될 거다.