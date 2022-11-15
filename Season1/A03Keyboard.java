package original;
import java.util.*;

public class A03Keyboard {

	public static void main(String[] args) {
		// 입력 객체 생성
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = sc.nextLine();
		System.out.println("나이 : ");
		int age = sc.nextInt();
		System.out.println( " name :" + name + " age : " + age);
		sc.close();
	}
}
