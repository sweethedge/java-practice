package original;

import java.util.Scanner;

public class A14Sosu2 {
	// �Ҽ��� �Ǻ��� �޼��� ����
	public static String make_prime(int num) {
		// 2���� ���� ����
		if (num < 2)
			// ��ȯ���� ��´�.
			return "�Ҽ� �ƴ�";
		// 2�� ���� ��ȯ���� ��´�.
		if (num == 2) return "�Ҽ� ����";
		// 3�̻��� ���� �ݺ����� �����ϰ�
		for (int i = 3; i < num; i++) {
			// ������ ������ ����
			if ((num % i) == 0)
				// ��ȯ���� ��´�.
				return "�Ҽ� �ƴ�";
		}
		// �⺻ ���ϰ��� ��´�.
		return "�߸� �Է���";
	}
	
	public static void main(String[] args) {
		// ��ĳ�� ��ġ
		Scanner sc = new Scanner(System.in);
		// �Է� �䱸
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		// �Է¹��� ���� num�� ����
		int num = sc.nextInt();
		// �Է¹��� num�� �Ҽ����� �Ǵ��� ���� make_prime �޼��� ȣ��
		String c = make_prime(num);
		System.out.println(c);
		System.out.println(make_prime(num));
		sc.close();
	}
}