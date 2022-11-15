package original;

import java.util.Scanner;

public class A19Three {
	// 메서드 개막
	public static String subject(int a, int b, int c) {
		// 조건 입력하고
		if ((a+b+c)/3 >= 70 && a>60 && b>60 && c>60) {
			// 넘겼을 때 통과 반환
			return "통과";
		}
		// 그 외 과락 반환
		return "과락";
	}
	public static void main(String[] args) {
		// 변수 선언
		int a; int b; int c;
		// 스캐너 깔고 입력 요구 및 대입
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");	
		a = sc.nextInt();
		System.out.print("b : ");	
		b = sc.nextInt();
		System.out.print("c : ");	
		c = sc.nextInt();
		System.out.println(subject(a,b,c));

	}

}
