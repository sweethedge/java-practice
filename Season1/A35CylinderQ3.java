// (������� �ѳ���) = 2��r^2+2��rh
// (������� ����) = ��r^2h

package original;

// Ŭ���� ����
class Cylinder2 {
	// �ʵ� ����
	private double radius = 0;
	private double height = 0;

	public Cylinder2 () {
	}

	public Cylinder2(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	// �ѳ��� ��� �޼��� ����
	public double getArea(double r, double h) {
		return (2*(Math.PI)*r*r + 2*(Math.PI)*r*h);
	}

	// ���� ��� �޼��� ����
	public double getVolume(double r, double h) {
		return (Math.PI)*r*r*h;
	}	
	
	public double getArea() {
		return getArea(radius, height);
	}
	
	public double getVolume() {
		return getVolume(radius, height);
	}
}

public class A35CylinderQ3 {

	public static void main(String[] args) {
//		Cylinder gg = new Cylinder();
//		gg.getArea(2, 6);
//		gg.getVolume(2, 6);
		
		Cylinder2 gg = new Cylinder2();
		// Mistyping.
		gg.setHeight(6);
		gg.setRadius(2);
		System.out.println("���� : " + gg.getArea()); // �̰� 100 ���;� ��
		System.out.println("���� : " + gg.getVolume()); // �̰� 75 ���;� ��
		System.out.println("=".repeat(80));
		
		
		Cylinder2 gg1 = new Cylinder2(2, 6);
		System.out.println("���� : " + gg1.getArea());
		System.out.println("���� : " + gg1.getVolume());
		
	}
}
