package original;

public class A23General {

	public void calculate(double a, double b, double c, double d) {
		if (a == c) {
			System.out.println("기울기가 같으면 부정이거나 불능이다.");
		} else {
			System.out.println("f(x) = " + a + "x" + "+" + b);
			System.out.println("g(x) = " + c + "x" + "+" + d + " 일때");

			System.out.println("x = " + (d-b)/(a-c) + ", " + "y = " + (a*d-b*c)/(a-c));
		}
	}

	public static void main(String[] args) {
		A23General gg = new A23General();
		gg.calculate(1, 2, -1, 3);
		gg.calculate(2, 3, 2, 5);

	}
}

/*
 * WolframAlpha를 돌려보면 두 연립방정식 y=ax+b, y=cx+d의
 * 일반해를 따지기 위한 조건은
 * 일단 두 직선의 기울기가 다를 때 (a ≠ c, 기울기가 같다면 해가 무한하거나 없다.)
 * x = (d-b)/(a-c), y = (ad-bc)/(a-c) 이므로
 * 정수 필드 a, b, c, d를 선언하고
 * 그에 따른 생성자와 매개변수 (int a, b, c, d)를 넣고
 * a와 c에 같은 값을 집어넣었으면 잘못 넣었다고 하고 break;
 * 아니면 그에 따른 일반해를 계산하는 메서드를 만들고
 * 밑에서 출력한다.
 */