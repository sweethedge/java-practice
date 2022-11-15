package original;

import java.util.Scanner;

public class A13Area {

	public static void main(String[] args) {
		// 스캐너 설치
		Scanner sc = new Scanner(System.in);
		// 삼각형/사각형 판별 변수 선언
		int sam;

		// 밑변 변수 선언
		int numOne = 0;
		// 높이 변수 선언
		int numTwo = 0;
		// 1을 2로 나눈 변수를 선언
		

		// 삼각형인지 사각형인지 요구
		System.out.print("삼각형이면 3, 사각형이면 4를 입력하세요 : ");
		// 입력 받은 값 판별 변수에 인입
		 sam = sc.nextInt();
		// sam에 1이 들어갔을 때 if 문 진행
		if (sam == 3) {
		// 밑변 입력 요구
			System.out.print("밑변을 입력하세요: ");
		// 사용자 밑변 입력 변수에 대입
			numOne = sc.nextInt();
		// 높이 입력 요구
			System.out.print("높이를 입력하세요: ");
		// 사용자 높이 입력 변수에 대입
			numTwo = sc.nextInt();
		// 삼각형의 면적을 계산한 변수 선언
			int area = (numOne*numTwo)/2;
			// 삼각형 프린트
			System.out.println("삼각형의 면적 = " + area);
			
		} else if (sam == 4) {
			// 가로 길이 요구
			System.out.print("가로 길이를 입력하세요: ");
			// 받은 가로를 대입
			numOne = sc.nextInt();
			// 세로 길이 요구
			System.out.println("세로 길이를 입력하세요: ");
			// 세로 길이 대입
			numTwo = sc.nextInt();
			// 사각형 프린트
			System.out.println("사각형의 면적 = " + numOne*numTwo);
		}
		// 스캐너 문닫기
		sc.close();
	}
}
