package original;

import java.util.Scanner;

public class A13_1Area {

	public static void main(String[] args) {
		// 스캐너 설치
		Scanner sc = new Scanner(System.in);
		// 삼각형/사각형, 종료 판별 변수 선언
		int sam = 0;

		// 밑변 변수 선언
		int numOne;
		// 높이 변수 선언
		int numTwo;
		
//		while (sam != 0) { - 이렇게 쓴다면, 0일 때의 if문을 개막하지 않아도 된다.
		// 무조건 참이라서 들어가는 while 문을 개막한다.
		while (true) {
			// 삼각형인지 사각형인지 요구 - 0이면 종료한다는 문구 삽입
			System.out.print("삼각형이면 3, 사각형이면 4, 종료하려면 0을 입력하시오 : ");
			// 입력 받은 값 판별 변수에 인입
			sam = sc.nextInt();
			// 변수에 입력된 값이 0이라면
			if (sam == 0) {
				// 반복문에서 빠져나온다.
				break;
			}
			// sam에 3이 들어갔을 때 if 문 개막
			else if (sam == 3) {
				// 밑변 입력 요구
				System.out.print("밑변을 입력하시오 : ");
				// 사용자 밑변 입력 변수에 대입
				numOne = sc.nextInt();
				// 높이 입력 요구
				System.out.print("높이를 입력하시오 : ");
				// 사용자 높이 입력 변수에 대입
				numTwo = sc.nextInt();
				// 삼각형의 면적을 계산한 변수 선언
				int area = (numOne*numTwo)/2;
				// 삼각형 프린트
				System.out.println("삼각형의 면적 = " + area);
				// 삼각형이 아니라 사각형일때의 else if문 개막
			} else if (sam == 4) {
				// 가로 길이 요구
				System.out.print("가로 길이를 입력하시오 : ");
				// 받은 가로를 대입
				numOne = sc.nextInt();
				// 세로 길이 요구
				System.out.print("세로 길이를 입력하시오 : ");
				// 세로 길이 대입
				numTwo = sc.nextInt();
				// 사각형 프린트
				System.out.println("사각형의 면적 = " + numOne*numTwo);
			}
		}
		// 스캐너 문닫기
		sc.close();
		System.out.println("Bye");
	}
}
