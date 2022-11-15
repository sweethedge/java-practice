// (원기둥의 겉넓이) = 2πr^2+2πrh
// (원기둥의 부피) = πr^2h

package original;

// 클래스 개막
class Cylinder2 {
	// 필드 선언
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

	// 겉넓이 계산 메서드 개막
	public double getArea(double r, double h) {
		return (2*(Math.PI)*r*r + 2*(Math.PI)*r*h);
	}

	// 부피 계산 메서드 개막
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
		System.out.println("면적 : " + gg.getArea()); // 이거 100 나와야 됨
		System.out.println("넓이 : " + gg.getVolume()); // 이거 75 나와야 됨
		System.out.println("=".repeat(80));
		
		
		Cylinder2 gg1 = new Cylinder2(2, 6);
		System.out.println("면적 : " + gg1.getArea());
		System.out.println("넓이 : " + gg1.getVolume());
		
	}
}
