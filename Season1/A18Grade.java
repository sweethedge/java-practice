package original;

import java.util.Scanner;

public class A18Grade {
	// 메서드 만들기. 아직 절고 있는 중이다.
	public static String grade() {
		// 스캐너 깔고
		Scanner sc = new Scanner(System.in);
		// 입력 요구
		System.out.print("입력하시오 : ");
		// 대입
		int score = sc.nextInt();
		// 여기서부터는 굳이 칠 필요는 없을 것같다.
		if (score >= 95) return "A+";
		else if (score >= 90) return "A0";
		else if (score >= 85) return "B+";
		else if (score >= 80) return "B0";
		else if (score >= 75) return "C+";
		else if (score >= 70) return "C0";
		else if (score >= 65) return "D+";
		else if (score >= 60) return "D0";
		else return "F";
	}

	public static void main(String[] args) {
		// 출력
		System.out.println(grade());
	}
}

// Test20, Test23