package original;

import java.util.Scanner;

public class A14Sosu {

	public static void main(String[] args) {
		// 스캐너 설치
		Scanner sc = new Scanner(System.in);
		// 입력 요구
		System.out.print("입력하시오 : ");
		// 입력받은 수 대입
		int num = sc.nextInt();
		// 0 과 1 은 소수가 아니므로 받은 값이 2보다 적을 때의 조건문 개막
		if (num < 2) {
			// 아니라고 출력
			System.out.println("소수 아님");
			// 디버그로 return; 을 찍으면 exit(); 메서드에 들어가서 결국 빠져나오게 된다.
			return;
		}
		// 2 는 소수이므로 들어온게 2라면
		if (num == 2) {
			// 맞다고 찍어주고
			System.out.println("소수 맞음");
			// 빠져나오기.
			return;
		}			
		// 2보다 클 때의 반복문 개막
		for (int i = 3; i < num; i++) {
			// @ 그러니까 i가 점점 커지면서 집어넣은 값을 나눠볼 거다. 적은 수부터 나누니까 나머지가 0이라는 얘기는 나누어 떨어졌다는 얘기다.
			// 그래서 나머지가 0이라면
			if ((num % i) == 0) {
				// 아니라고 출력하고
				System.out.println("소수 아님");
				// 빠져나온다.
				return;
			}
				}
		// 위와 같은 상황이 아니라면 소수라고 출력
		System.out.println("소수 맞음");
		// 빠져나오기.
		return;
	}
}

// https://st-lab.tistory.com/81