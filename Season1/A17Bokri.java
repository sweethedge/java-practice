package original;

import java.util.Scanner;

public class A17Bokri {

	public static void main(String[] args) {
		// 스캐너
		Scanner sc = new Scanner(System.in);
		// 목돈 a 입력 요구
		System.out.print("목돈 a를 입력하시오 : ");
		// 대입
		int a = sc.nextInt();
		// 이율 r 입력 요구
		System.out.print("이율 r을 입력하시오 : ");
		// 대입
		double r = sc.nextDouble();
		// 만기 년수 n 입력 요구
		System.out.print("만기 년수 n을 입력하시오 : ");
		// 대입
		int n = sc.nextInt();
		
		// 변수 하나 1로 초기화하고
		double temp = 1;
		// n번 곱할 반복문 개막
		for (int i = 1; i <= n; i++) {
			// n번 곱하고
			temp = temp*(1+r);
		}
		// 원금에 식 곱한 거 대입
		int S = (int)(a*temp);
		// 출력
		System.out.println(S);
		sc.close();
		
	}
}
