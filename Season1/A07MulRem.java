package original;

import java.util.Scanner;

public class A07MulRem {

	public static void main(String[] args) {
		
		// ����� �Է� 
		Scanner sc = new Scanner(System.in);
		// ù ��° �� �Է��϶�� �޽��� ��� 
		System.out.println("ù ��° �� �Է�");
		// �Է¹��� �Ÿ� ���� ������ ����
		int numOne = sc.nextInt();
		// �� ��° �� �Է��϶�� �޽��� ���
		System.out.println("�� ��° �� �Է�");
		// �Է¹��� �Ÿ� ���� ������ ����
		int numTwo = sc.nextInt();
		// �� ���
		System.out.println("�� = " + numOne + " * " + numTwo + " = " + numOne * numTwo);
		// �� ���
		System.out.println("�� = " + numOne + " / " + numTwo + " = " + numOne / numTwo);
		// ������ ��� : ����1 - ����2*(1/2)
		System.out.println("������ = " + (numOne - numTwo*(numOne / numTwo)));
		sc.close();
	}

}

