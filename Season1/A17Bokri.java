package original;

import java.util.Scanner;

public class A17Bokri {

	public static void main(String[] args) {
		// ��ĳ��
		Scanner sc = new Scanner(System.in);
		// �� a �Է� �䱸
		System.out.print("�� a�� �Է��Ͻÿ� : ");
		// ����
		int a = sc.nextInt();
		// ���� r �Է� �䱸
		System.out.print("���� r�� �Է��Ͻÿ� : ");
		// ����
		double r = sc.nextDouble();
		// ���� ��� n �Է� �䱸
		System.out.print("���� ��� n�� �Է��Ͻÿ� : ");
		// ����
		int n = sc.nextInt();
		
		// ���� �ϳ� 1�� �ʱ�ȭ�ϰ�
		double temp = 1;
		// n�� ���� �ݺ��� ����
		for (int i = 1; i <= n; i++) {
			// n�� ���ϰ�
			temp = temp*(1+r);
		}
		// ���ݿ� �� ���� �� ����
		int S = (int)(a*temp);
		// ���
		System.out.println(S);
		sc.close();
		
	}
}
