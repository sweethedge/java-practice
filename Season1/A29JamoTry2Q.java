//  .charAt(num) �̶�� �Լ��� mdn���� �о��
//  num�� �ִ� ���ڿ��� ��ȯ�Ѵ�.
//  �ݺ����� ���ǹ��� ������ Ȱ���ϸ� ���ϴ� ���ڿ��� ���� �� �ִ�.

package original;

public class A29JamoTry2Q {
	// ������ ���ǹ��� ���� ���� ����
	int b = 0, c = 0, d = 0, e = 0, z = 0;
	// �޼��� ����
	public void asdf(String a) {
		// ���� �ڸ���
		String b = a.replace(" ", "");
		// Ư������ �ڸ���.
		String c = b.replaceAll("[^��-����-�Ӱ�-�Ra-zA-Z0-9]", "");
		// �� �߷ȴ��� �� �� ����Ʈ�� ����
		System.out.println(c);
		
		// ���ڿ��� ���̸�ŭ ���� �ݺ��� ����
		for (int i = 0; i < c.length(); i++) {
			// ������ ������
			if (
					c.charAt(i) == 'a' || 
					c.charAt(i) == 'e' || 
					c.charAt(i) == 'i' || 
					c.charAt(i) == 'o' || 
					c.charAt(i) == 'u') {
			
				// ������ ��Ƶΰ�
				d++;
				// �ƴ� �� �ٸ� �ſ� �־�д�.
			} else e++;
		}
		// ����Ʈ
		
		System.out.println("���� : " + d);
		System.out.println("���� : " + e);
	}


	public static void main(String[] args) {
		A29JamoTry2Q gg = new A29JamoTry2Q();
		gg.asdf("Programming is fun! right?");

	}

}
