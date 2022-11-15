// (원기둥의 겉넓이) = 2πr^2+2πrh
// (원기둥의 부피) = πr^2h

package original;

// 클래스 개막
class Cylinder {
	// 필드 선언...?
	private double radius = 0;
	private double height = 0;

	// 겉넓이 계산 메서드 개막
	public void getArea(double r, double h) {
		System.out.println(2*(Math.PI)*r*r + 2*(Math.PI)*r*h);
	}

	// 부피 계산 메서드 개막
	public void getVolume(double r, double h) {
		System.out.println((Math.PI)*r*r*h);
	}	

}

public class A35CylinderQ2 {

	public static void main(String[] args) {
		Cylinder gg = new Cylinder();
		gg.getArea(2, 6);
		gg.getVolume(2, 6);
	}
}
