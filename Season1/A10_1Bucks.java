package original;

import java.util.Scanner;

public class A10_1Bucks {

	public static void main(String[] args) {
		// �ϴ��� ��ĳ�� ��ġ.
		Scanner sc = new Scanner(System.in);
		// �Է¹��� ���� ����. (���� �ݾ�)
		System.out.print("�ݾ��� �Է��Ͻÿ� : ");
		// �Է¹��� ���� ����
		int num = sc.nextInt();
		// �ϴ� �Է¹��� ���� ������ ǥ��
		System.out.println(num + "��");
		// ������ �迭 ����
		int [] e = {50000, 10000, 5000, 1000};
		// 0���� �����ؼ� �迭�� ���� ������ ���� �ݺ��� ����
		for (int i = 0; i < e.length; i++) {
			// �� �迭�� ���� ���� ���
			System.out.println(num / e[i] + "��");
			// ���� �������� �Էµ� ���� ����
			num %= e[i];
		}
		// ��ĳ�� ���ݱ�
		sc.close();
	}
}