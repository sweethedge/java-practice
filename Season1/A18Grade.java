package original;

import java.util.Scanner;

public class A18Grade {
	// �޼��� �����. ���� ���� �ִ� ���̴�.
	public static String grade() {
		// ��ĳ�� ���
		Scanner sc = new Scanner(System.in);
		// �Է� �䱸
		System.out.print("�Է��Ͻÿ� : ");
		// ����
		int score = sc.nextInt();
		// ���⼭���ʹ� ���� ĥ �ʿ�� ���� �Ͱ���.
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
		// ���
		System.out.println(grade());
	}
}

// Test20, Test23