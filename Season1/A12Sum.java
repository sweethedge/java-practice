package original;

import java.util.Scanner;

public class A12Sum {

	public static void main(String[] args) {
		
		// ��ĳ�� ��ġ
		Scanner sc = new Scanner(System.in);
		// ����ڿ��� �Է� �䱸
		System.out.print("���ڸ� �ϳ� �� ������ : ");
		// �Է� ���� �� ���� ������ ����
		int num = sc.nextInt();

		// ��ü ���� ������ ����
		int sum1 = 0;
		// ¦�� ���� ������ ����
		int sum2 = 0;
		// Ȧ�� ���� ������ ����
		int sum3 = 0;
		
		// 1���� num���� �ݺ�
		for (int i = 1; i <= num ; i++) {
			
			// i���� ����Ѵ�.
			 System.out.println(i);
			
			// ��ü ���� ���ϴ� ������ ���� ����
			sum1 += i; 
			// ¦���� ��쿡�� ¦�� ���� �����ϴ� ������ �߰�
			if (i % 2 == 0) {
				sum2 += i;
			// Ȧ���� ��쿡�� Ȧ�� ���� �����ϴ� ������ �߰�
			} else {
				sum3 += i;
			}
			// ��ĳ�� ���ݱ�
			sc.close();
			
		}
		// ���� ����� ���
		System.out.println("�� �� : " + sum1);
		System.out.println("¦�� �� : " + sum2);
		System.out.println("Ȧ�� �� : " + sum3);
	}

}
