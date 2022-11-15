package original;

import java.util.Scanner;

public class A07MulRem {

	public static void main(String[] args) {
		
		// 사용자 입력 
		Scanner sc = new Scanner(System.in);
		// 첫 번째 수 입력하라는 메시지 출력 
		System.out.println("첫 번째 수 입력");
		// 입력받은 거를 정수 변수에 대입
		int numOne = sc.nextInt();
		// 두 번째 수 입력하라는 메시지 출력
		System.out.println("두 번째 수 입력");
		// 입력받은 거를 정수 변수에 대입
		int numTwo = sc.nextInt();
		// 곱 출력
		System.out.println("곱 = " + numOne + " * " + numTwo + " = " + numOne * numTwo);
		// 몫 출력
		System.out.println("몫 = " + numOne + " / " + numTwo + " = " + numOne / numTwo);
		// 나머지 출력 : 변수1 - 변수2*(1/2)
		System.out.println("나머지 = " + (numOne - numTwo*(numOne / numTwo)));
		sc.close();
	}

}

