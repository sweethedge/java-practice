package original;

import java.util.Scanner;

public class A14Sosu3 {
	public String make_prime(int num) {
		if (num < 2) 
			return "소수 아님";
		if (num == 2) return "소수 맞음";
		for (int i = 3; i < num; i++) {
			if ((num % i) == 0) 
				return "소수 아님";
		}
		return "잘못 입력함";
	}
	
	public static void main(String[] args) {
		// 스캐너 설치
		Scanner sc = new Scanner(System.in);
		// 입력 요구
		System.out.print("숫자를 입력하시오 : ");
		// 입력받은 값을 num에 저장
		int num = sc.nextInt();
		// 객체를 만든다.
		A14Sosu3 d = new A14Sosu3();
		// 소수인지를 판별하기 위해 객체의 메서드를 호출해서 출력
		System.out.println(d.make_prime(num));
		sc.close();
	}
}
