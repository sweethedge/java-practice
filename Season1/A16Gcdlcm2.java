package original;

import java.util.Scanner;

public class A16Gcdlcm2 {

	// 최대공약수 계산 메서드 개막. 두 개의 인수를 갖는다.
	public static int gcd(int a, int b) {
		// b가 0이 아닌 동안
		while (b != 0) {
			// a를 b로 나눈 나머지를 대입하는 변수를 만든 뒤
			int temp = a % b;
			// 복사하는 두 줄을 쓴다.
			a = b;
			b = temp;
		}
		// a를 반환하고.
		return a;
	}
	// 최소공배수 계산 메서드 개막
	public static int lcm(int a, int b) {
		// 최대공약수의 값을 받아오고
		int gcd_value = gcd(a, b);
		// 두 개를 곱해서 최대공약수로 나눈게 최소공배수다.
		return (a * b) / gcd_value;
	}

	public static void main(String[] args) {
		// 스캐너 설치
		Scanner sc = new Scanner(System.in);
		// while 문에서 쓸 변수 초기화
		int f = 0;
		// 일단 무조건 돌게 하고
		while(true) {
			// 입력 요구 : "최대공약수를 계산하려면 1, 최소공배수를 계산하려면 2, 종료하려면 3을 입력하시오: "
			System.out.print("최대공약수를 계산하려면 1, 최소공배수를 계산하려면 2, 종료하려면 3을 입력하시오: ");
			// 스캐너에서 받은 값 집어넣고
			f = sc.nextInt();
			// 3 들어가면 빠져나오기
			if (f == 3) {
				// 한 마디 하고
				System.out.println("Bye!");
				// 빠져나오기
				break; 
			}
			// 그게 아니라
			else {
				// 1이라면
				if (f == 1) {
					// a 입력 요구
					System.out.print("숫자 a를 입력하시오 : ");
					// a에 대입
					int a = sc.nextInt();
					// b 입력 요구
					System.out.print("숫자 b를 입력하시오 : ");
					// b에 대입
					int b = sc.nextInt();
					// 최대공약수 출력
					System.out.println(gcd(a,b));
					// 2라면
				} if (f == 2) {
					// 위에서 친 거 한 번 더 치고, 최소공배수 입력
					System.out.print("숫자 a를 입력하시오 : ");
					int a = sc.nextInt();
					System.out.print("숫자 b를 입력하시오 : ");
					int b = sc.nextInt();
					System.out.println(lcm(a,b));
					// 다른 거 쳤을 때 멘트 하나
				} else System.out.println("잘못 입력함");
			} 
		}
	}
}
