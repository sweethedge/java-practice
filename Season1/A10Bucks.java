package original;

import java.util.Scanner;

public class A10Bucks {

	public static void main(String[] args) {
		// �ϴ��� ��ĳ�� ��ġ.
		Scanner sc = new Scanner(System.in);

		// �Է¹��� ���� ����. (���� �ݾ�)
		System.out.print(" �ݾ��� �Է��Ͻÿ� : ");
		// �Է¹��� ���� ����
		int one = sc.nextInt();
		// ���� �� ���� ����.
		// 5����
		int a = one / 50000; 
		// ����
		int b = (one - (a * 50000)) / 10000; 
		// 5õ��
		int c = (one - (a * 50000 + b * 10000)) / 5000; 
		// õ��
		int d = (one - (a * 50000 + b * 10000 + c * 5000)) / 1000;  
		// ��ĳ�� ���ݱ�
		sc.close();
		// ����Ʈ
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}

// for ���� �� ���ڰ� �ڵ带 ¥�� �� �Ŵ�.