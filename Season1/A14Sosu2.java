package original;

import java.util.Scanner;

public class A14Sosu2 {
	// 소수를 판별할 메서드 개막
	public static String make_prime(int num) {
		// 2보다 적을 때의
		if (num < 2)
			// 반환값을 찍는다.
			return "소수 아님";
		// 2일 때의 반환값을 찍는다.
		if (num == 2) return "소수 맞음";
		// 3이상일 때의 반복문을 개막하고
		for (int i = 3; i < num; i++) {
			// 나누어 떨어질 때의
			if ((num % i) == 0)
				// 반환값을 찍는다.
				return "소수 아님";
		}
		// 기본 리턴값을 찍는다.
		return "잘못 입력함";
	}
	
	public static void main(String[] args) {
		// 스캐너 설치
		Scanner sc = new Scanner(System.in);
		// 입력 요구
		System.out.print("숫자를 입력하시오 : ");
		// 입력받은 값을 num에 저장
		int num = sc.nextInt();
		// 입력받은 num이 소수인지 판단을 위해 make_prime 메서드 호출
		String c = make_prime(num);
		System.out.println(c);
		System.out.println(make_prime(num));
		sc.close();
	}
}