package original;

import java.util.Scanner;

public class A08DataConversion {

	public static void main(String[] args) {
		// ��ĳ�ʷ� �Է°� ����
		Scanner sc = new Scanner(System.in);
		// 300000�� �Է��϶�� ����
		System.out.println("�ӵ� �Է�");
		// �Է¹��� �Ÿ� ������ ����
		int sec = sc.nextInt();
		// �Է� �ڿ� �ü�
		System.out.println("�Է� : " + sec + " km/s");
		// �м� ���
		System.out.println("�м� : " + sec*60 + " km/m" );
		// �ü� ���
		System.out.println("�ü� : " + sec*3600 + " km/h");
		// ���� ��� : ���� / 360
		System.out.println("���� : " + sec/360 + " mach");
		// ��ĳ�� ���ݱ�
		sc.close();
	}

}
