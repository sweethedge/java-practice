package original;

import java.util.Scanner;

public class A14Sosu3 {
	public String make_prime(int num) {
		if (num < 2) 
			return "�Ҽ� �ƴ�";
		if (num == 2) return "�Ҽ� ����";
		for (int i = 3; i < num; i++) {
			if ((num % i) == 0) 
				return "�Ҽ� �ƴ�";
		}
		return "�߸� �Է���";
	}
	
	public static void main(String[] args) {
		// ��ĳ�� ��ġ
		Scanner sc = new Scanner(System.in);
		// �Է� �䱸
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		// �Է¹��� ���� num�� ����
		int num = sc.nextInt();
		// ��ü�� �����.
		A14Sosu3 d = new A14Sosu3();
		// �Ҽ������� �Ǻ��ϱ� ���� ��ü�� �޼��带 ȣ���ؼ� ���
		System.out.println(d.make_prime(num));
		sc.close();
	}
}
