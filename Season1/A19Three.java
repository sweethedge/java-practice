package original;

import java.util.Scanner;

public class A19Three {
	// �޼��� ����
	public static String subject(int a, int b, int c) {
		// ���� �Է��ϰ�
		if ((a+b+c)/3 >= 70 && a>60 && b>60 && c>60) {
			// �Ѱ��� �� ��� ��ȯ
			return "���";
		}
		// �� �� ���� ��ȯ
		return "����";
	}
	public static void main(String[] args) {
		// ���� ����
		int a; int b; int c;
		// ��ĳ�� ��� �Է� �䱸 �� ����
		Scanner sc = new Scanner(System.in);
		System.out.print("a : ");	
		a = sc.nextInt();
		System.out.print("b : ");	
		b = sc.nextInt();
		System.out.print("c : ");	
		c = sc.nextInt();
		System.out.println(subject(a,b,c));

	}

}
