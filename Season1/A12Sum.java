package original;

import java.util.Scanner;

public class A12Sum {

	public static void main(String[] args) {
		
		// 스캐너 설치
		Scanner sc = new Scanner(System.in);
		// 사용자에게 입력 요구
		System.out.print("숫자를 하나 써 보세요 : ");
		// 입력 받은 값 정수 변수에 대입
		int num = sc.nextInt();

		// 전체 합을 저장할 변수
		int sum1 = 0;
		// 짝수 합을 저장할 변수
		int sum2 = 0;
		// 홀수 합을 저장할 변수
		int sum3 = 0;
		
		// 1부터 num까지 반복
		for (int i = 1; i <= num ; i++) {
			
			// i값을 출력한다.
			 System.out.println(i);
			
			// 전체 합을 더하는 변수에 값을 저장
			sum1 += i; 
			// 짝수인 경우에는 짝수 합을 저장하는 변수에 추가
			if (i % 2 == 0) {
				sum2 += i;
			// 홀수인 경우에는 홀수 합을 저장하는 변수에 추가
			} else {
				sum3 += i;
			}
			// 스캐너 문닫기
			sc.close();
			
		}
		// 최종 결과를 출력
		System.out.println("총 합 : " + sum1);
		System.out.println("짝수 합 : " + sum2);
		System.out.println("홀수 합 : " + sum3);
	}

}
