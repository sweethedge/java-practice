/*
 * .charAt(num) �̶�� �Լ��� mdn���� �о��
 * num�� �ִ� ���ڿ��� ��ȯ�Ѵ�.
 * �ݺ����� ���ǹ��� ������ Ȱ���ϸ� ���ϴ� ���ڿ��� ���� �� �ִ�.
 * */

package original;

public class A29JamoTry1 {
	// ������ ���ǹ��� ���� ���� ����
	int b = 0, c = 0, d = 0;
	// �޼��� ����
	public void asdf(String a) {
		// ���ڿ��� ���̸�ŭ ���� �ݺ��� ����
		for (int i = 0; i < a.length(); i++) {

			if (
					a.charAt(i) == 'a' || 
					a.charAt(i) == 'e' || 
					a.charAt(i) == 'i' || 
					a.charAt(i) == 'o' || 
					a.charAt(i) == 'u') {
				b++;

			} else if (
					a.charAt(i) == ' ' || 
					a.charAt(i) == '!' || 
					a.charAt(i) == '?'
					) {
				c++;
				
			} else d++;

		}

		System.out.println("���� : " + d);
		System.out.println("���� : " + b);
		
	}


	public static void main(String[] args) {
		A29JamoTry1 gg = new A29JamoTry1();
		gg.asdf("Programming is fun! right?");

	}

}
