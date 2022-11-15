package original;

import java.util.Scanner;

public class A09FreeFall {

	public static void main(String[] args) {
		// 공식 : 1000 - 4.905 * n * n 
		// 스캐너 생성
		Scanner sc = new Scanner(System.in);
		// 변수 선언
		int n;
		// 값 입력 요구
		System.out.print("n초 후 위치를 입력하시오 : ");
		// 입력받은 값을 변수에 대입 
		n = sc.nextInt();
		// 공식을 대입받을 변수 선언
		float o = (float) (1000-4.905*n*n); 
		// 변수가 0보다 작거나 같다면
		if (o <= 0) {
		// 지상이라고 메시지 출력
			System.out.println("이미 땅바닥입니다.");
		// 그게 아닐 때 메시지 출력
		} else System.out.println(n + "초 후 위치 : " + o + "m");
		// 스캐너 문 닫기
		sc.close();
	}

}
