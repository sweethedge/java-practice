package original;

import java.util.HashMap;
import java.util.Map;

public class A43Hashmap {
	
	public static void main(String[] args) {
		// 아래 데이터를 HashMap을 사용하여 저장하고, 
		HashMap<String, String> emails = new HashMap<>();
		emails.put("홍길동", "hongkd@korea.kr");
		emails.put("이순신", "leess@korea.kr");
		emails.put("강감찬", "kangkc@korea.kr");
		
		// 출력 예와 같은 결과를 얻으세요.
		System.out.println(emails.size());
		System.out.println("== key set == ");
		System.out.println(emails.keySet());
		System.out.println(" == values == ");
		System.out.println(emails.values());
		
	}

}
