package original;

import java.util.Scanner;


public class A15Binary {
	public static void main(String[] args) {
		// ��ĳ�� ���
		Scanner sc = new Scanner(System.in);
		// �Է� �䱸
		System.out.print("���� �Է��Ͻÿ� : ");
		// �Է� ����
		int num = sc.nextInt();
		// �����Լ� ���
		String b = Integer.toBinaryString(num);
		// ���
		System.out.println(b);
		sc.close();
		
	}

}
