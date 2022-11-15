package original;

import java.util.Scanner;

public class A05Income {
	public static void main(String[] args) {
		
		// 사용자로부터 값을 입력받기 위해서 스캐너 객체를 생성한다.
		Scanner sc = new Scanner(System.in);

		// 스캐너로부터 값을 입력받을 때 아무런 메시지가 나오지 않으면 실행여부를 판단할 수 없으므로
		// 입력 메시지를 콘솔화면에 출력한다.
		System.out.print("총 수입 : ");
		
		// 스캐너로 부터 값을 입력받아서 int형 변수에 저장한다.
		int income = sc.nextInt();
		
		// 저장된 값을 이용해서 출력한다.
		System.out.printf("총 수입 : %d 원", income);
		
		System.out.println();
		
		System.out.printf("일 평균 수입 : %d 원", income / 7);
		sc.close();
	}

}
