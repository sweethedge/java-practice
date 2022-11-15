// (원기둥의 겉넓이) = =2πr^2+2πrh
// V=πr^2h

package original;

// 클래스 개막
class Cylinder1 {
	// 변수 선언
	// 써먹지를 못하고 있다.
	private double radius, height;
	

	public Cylinder1(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	// 겉넓이 계산 메서드 개막
	public void getArea(double r, double h) {
		System.out.println(2*(Math.PI)*r*r + 
				2*(Math.PI)*r*h);
	}
	
	// 부피 계산 메서드 개막
	public void getVolume(double r, double h) {
		System.out.println((Math.PI)*r*r*h);
	}
	
}

public class A35CylinderQ {

	public static void main(String[] args) {
		Cylinder1 gg = new Cylinder1(2, 6);
		gg.getArea(2, 6);
		gg.getVolume(3, 6);
	}

}
