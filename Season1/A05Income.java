package original;

import java.util.Scanner;

public class A05Income {
	public static void main(String[] args) {
		
		// ����ڷκ��� ���� �Է¹ޱ� ���ؼ� ��ĳ�� ��ü�� �����Ѵ�.
		Scanner sc = new Scanner(System.in);

		// ��ĳ�ʷκ��� ���� �Է¹��� �� �ƹ��� �޽����� ������ ������ ���࿩�θ� �Ǵ��� �� �����Ƿ�
		// �Է� �޽����� �ܼ�ȭ�鿡 ����Ѵ�.
		System.out.print("�� ���� : ");
		
		// ��ĳ�ʷ� ���� ���� �Է¹޾Ƽ� int�� ������ �����Ѵ�.
		int income = sc.nextInt();
		
		// ����� ���� �̿��ؼ� ����Ѵ�.
		System.out.printf("�� ���� : %d ��", income);
		
		System.out.println();
		
		System.out.printf("�� ��� ���� : %d ��", income / 7);
		sc.close();
	}

}
