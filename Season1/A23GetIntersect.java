// https://gaussian37.github.io/math-algorithm-intersection_point/

package original;

public class A23GetIntersect {
	double x1, x2, x3, x4, y1, y2, y3, y4;

	public void printIntersect(double x1, double x2, double x3, double x4, double y1, double y2, double y3, double y4) {
		double a = (x1*y2) - (y1*x2);
		double b = (x3-x4);
		double c = (x1-x2);
		double d = (x3*y4) - (y3*x4);
		double e = (x1-x2);
		double f = (y3-y4);
		double g = (y1-y2);
		double h = (x3-x4);

		if ((e * f) == (g * h)) {
			System.out.println("이런 경우는 부정이거나 불능이다.");
		} else {
			System.out.println("x = " + ((a*b - c*d) / (e*f)-(g*h)));
			System.out.println ("y = " + ((a*f) - (g*d)) / ((e*f) - (g*h)));
		}
	}

	public static void main(String[] args) {
		A23GetIntersect gg = new A23GetIntersect();
		gg.printIntersect(1.3548, 2.15497, 32154.5148, 21.2158, 24.1574, 2.15647, 23.1247, 223.1254);
	}
}


