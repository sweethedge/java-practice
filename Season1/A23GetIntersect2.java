package original;


// 클래스 개막
class GetIntersect {
	// 변수 선언
	double x1, x2, x3, x4, y1, y2, y3, y4;

	// 기본 생성자
	public GetIntersect() {
		// TODO Auto-generated constructor stub
	}

	// 메서드 개막
	public void printIntersect(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4) {
		
		// 계산식 모듈화
		double a = (x1*y2) - (y1*x2);
		double b = (x3-x4);
		double c = (x1-x2);
		double d = (x3*y4) - (y3*x4);
		double e = (x1-x2);
		double f = (y3-y4);
		double g = (y1-y2);
		double h = (x3-x4);

		// e*f = g*h 이면
		if ((e * f) == (g * h)) {
			// 계산 불가 메시지
			System.out.println("이런 경우는 부정이거나 불능이다.");
			// 아니면
		} else {
			// 계산식 처리
			System.out.println("x = " + ((a*b - c*d) / (e*f)-(g*h)));
			System.out.println ("y = " + ((a*f) - (g*d)) / ((e*f) - (g*h)));

		}
	}
}

public class A23GetIntersect2 {

	public static void main(String[] args) {
		GetIntersect gg = new GetIntersect();
		gg.printIntersect(1, 1.7, 3.5, 2.6, 7.5, 1.25, 145.2, 48.21);
		gg.printIntersect(1, 1, 1, 1, 1, 1, 1, 1);
		gg.printIntersect(1, 2, 3, 4, 5, 6, 7, 8);
		gg.printIntersect(1, 3, 4, 5, 7, 9, 10, 8);

	}
}

//public GetIntersect(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4) {
//		this.x1 = x1;
//		this.x2 = x2;
//		this.x3 = x3;
//		this.x4 = x4;
//		this.y1 = y1;
//		this.y2 = y2;
//		this.y3 = y3;
//		this.y4 = y4;
//	}

