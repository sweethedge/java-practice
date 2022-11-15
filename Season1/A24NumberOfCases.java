package original;

import java.util.Scanner;

public class A24NumberOfCases {
		
	public static void main(String[] args) {
		// 스캐너 설치
		Scanner sc = new Scanner(System.in);
		// 입력 요구 : 10 ~ 100
		System.out.print("수를 입력하시오 : ");
		// 입력받은 값 대입
		int num = sc.nextInt();
		// 조건문 내에서 숫자를 세어 줄 변수 선언 및 초기화
		int cnt = 0;
		// for 문 1/2/3
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				for (int k = 1; k <= 10; k++) {
					// 각각의 무게가 입력한 수와 같아지면
					if(2*i + 3*j + 5*k == num) {
						// 카운트를 올리고
						cnt++;
						// 각각의 추를 프린트
						System.out.print(String.format("(%d,%d,%d)", i, j, k));
					}
				}
			}
		}
		// 카운트를 프린트
		System.out.print(String.format(" : %d", cnt));
		sc.close();
	}
}