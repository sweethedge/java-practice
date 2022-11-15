package original;

// 클래스 짜는 법을 홍교수님께서 알려주셔서 본능적으로 짜긴 짰는데 이게...
// 좀 운으로 돌아가게 된 것같다.

/*
 * 클래스 짜는 법
 * 1. public class 파일 이름 위에 선언
 * 2. private 변수 선언
 * 3. 생성자
 * 4. get/setter
 * 5. toString
 * */

// 클래스 개막
class Function {
	// 변수 선언
	double a, b, c, d;

//	public Function(double a, double b, double c, double d) {
//		this.a = a;
//		this.b = b;
//		this.c = c;
//		this.d = d;
//	}
	
	// 기본 생성자
	public Function() {
		// TODO Auto-generated constructor stub
	}
	
	// 메서드 개막
	public void calculate(double a, double b, double c, double d) {
		// a 가 c 가 같으면
		if (a == c) {
			// 계산 불가 메시지
			System.out.println("기울기가 같으면 부정이거나 불능이다.");
			// 아니면
		} else {
			// f(x) = ax+b, g(x) = cx+d 일때 
			System.out.println("f(x) = " + a + "x" + "+" + b);
			System.out.println("g(x) = " + c + "x" + "+" + d + " 일때");
			
			// x, y값 계산 메시지 출력
			System.out.println("x = " + (d-b)/(a-c) + ", " + "y = " + (a*d-b*c)/(a-c));
		}
	}
}

public class A23General2 {
	public static void main(String[] args) {
		Function gg = new Function();
		gg.calculate(1, 2, 1, 4);
		gg.calculate(2, 3, 4, 5);
	}
}

