package original;

import java.util.HashMap;
import java.util.Map;

public class A43Hashmap {
	
	public static void main(String[] args) {
		// �Ʒ� �����͸� HashMap�� ����Ͽ� �����ϰ�, 
		HashMap<String, String> emails = new HashMap<>();
		emails.put("ȫ�浿", "hongkd@korea.kr");
		emails.put("�̼���", "leess@korea.kr");
		emails.put("������", "kangkc@korea.kr");
		
		// ��� ���� ���� ����� ��������.
		System.out.println(emails.size());
		System.out.println("== key set == ");
		System.out.println(emails.keySet());
		System.out.println(" == values == ");
		System.out.println(emails.values());
		
	}

}
