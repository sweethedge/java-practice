package original;

import java.util.Scanner;

public class A06Currency {

	public static void main(String[] args) {
		// ��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		// �Է��϶�� �޽��� ���
		System.out.print("�޷��� �Է��Ͻÿ� : ");
		// ���� ���� ����
		int num;
		// �Է¹��� ���� ���� ������ ����
		num = sc.nextInt();
		// ���. 1�޷� : 1350��
		System.out.println(num + " �޷� �� " + num*1350 + "��");
		// ��ĳ�� ���ݱ�
		sc.close();
	}
}