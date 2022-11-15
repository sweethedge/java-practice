package original;

import java.util.Scanner;

public class A08DataConversion {

	public static void main(String[] args) {
		// 스캐너로 입력값 받음
		Scanner sc = new Scanner(System.in);
		// 300000을 입력하라고 제시
		System.out.println("속도 입력");
		// 입력받은 거를 변수에 인입
		int sec = sc.nextInt();
		// 입력 뒤에 시속
		System.out.println("입력 : " + sec + " km/s");
		// 분속 출력
		System.out.println("분속 : " + sec*60 + " km/m" );
		// 시속 출력
		System.out.println("시속 : " + sec*3600 + " km/h");
		// 마하 출력 : 변수 / 360
		System.out.println("마하 : " + sec/360 + " mach");
		// 스캐너 문닫기
		sc.close();
	}

}
