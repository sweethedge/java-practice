package original;

import java.util.Scanner;


public class A15Binary {
	public static void main(String[] args) {
		// 스캐너 깔고
		Scanner sc = new Scanner(System.in);
		// 입력 요구
		System.out.print("수를 입력하시오 : ");
		// 입력 받음
		int num = sc.nextInt();
		// 내장함수 사용
		String b = Integer.toBinaryString(num);
		// 출력
		System.out.println(b);
		sc.close();
		
	}

}
