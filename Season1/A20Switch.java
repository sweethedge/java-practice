// �����ι�������̽������� 4567 891011 0123
// ��� �Ҷ� ���� �䳢�� ��� ��� ���� ��� �����̶� �߶� ���� ������ 
package original;

import java.util.Scanner;

public class A20Switch {
	// �޼��� ����
	public static String tti(int a) {
		// ��ĳ�ʱ�� �䱸�� �� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է��Ͻÿ� : ");
		a = sc.nextInt();
		// ���� �����ؼ� ��ȯ�ϰ�
		if (a % 12 == 4) return "���";
		if (a % 12 == 5) return "�Ҷ�";
		if (a % 12 == 6) return "ȣ���̶�";
		if (a % 12 == 7) return "�䳢��";
		
		if (a % 12 == 8) return "���";
		if (a % 12 == 9) return "���";
		if (a % 12 == 10) return "����";
		if (a % 12 == 11) return "���";
		
		if (a % 12 == 0) return "�����̶�";
		if (a % 12 == 1) return "�߶�";
		if (a % 12 == 2) return "����";
		if (a % 12 == 3) return "������";

		// �� �� null ��ȯ
		else return null;
	}
	
	public static String tti2(int b) {
		// ��ĳ�ʱ�� �䱸�� �� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է��Ͻÿ� : ");
		b = sc.nextInt();
		sc.close();
		// switch �� ����
		switch (b % 12) {
		// case ���
		case (4) : return "���";
		case (5) : return "�Ҷ�";
		case (6) : return "ȣ���̶�";
		case (7) : return "�䳢��";

		case (8) : return "���";
		case (9) : return "���";
		case (10) : return "����";
		case (11) : return "���";
		
		case (0) : return "�����̶�";
		case (1) : return "�߶�";
		case (2) : return "����";
		case (3) : return "������";
		}
		// ��ȯ��
		return null;
		
	}
	public static void main(String[] args) {
		// ���� ���� �� ���
		int a = 0;
		int b = 0;
//		System.out.println(tti(a));
		System.out.println(tti2(b));

	}

}
