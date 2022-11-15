/*
 * .charAt(num) 이라는 함수를 mdn에서 읽어보면
 * num에 있는 문자열을 반환한다.
 * 반복문과 조건문을 적절히 활용하면 원하는 문자열을 뽑을 수 있다.
 * */

package original;

public class A29JamoTry1 {
	// 각각의 조건문을 받을 변수 선언
	int b = 0, c = 0, d = 0;
	// 메서드 개막
	public void asdf(String a) {
		// 문자열의 길이만큼 도는 반복문 개막
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

		System.out.println("자음 : " + d);
		System.out.println("모음 : " + b);
		
	}


	public static void main(String[] args) {
		A29JamoTry1 gg = new A29JamoTry1();
		gg.asdf("Programming is fun! right?");

	}

}
