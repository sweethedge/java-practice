// (������� �ѳ���) = =2��r^2+2��rh
// V=��r^2h

package original;

// Ŭ���� ����
class Cylinder1 {
	// ���� ����
	// ������� ���ϰ� �ִ�.
	private double radius, height;
	

	public Cylinder1(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	// �ѳ��� ��� �޼��� ����
	public void getArea(double r, double h) {
		System.out.println(2*(Math.PI)*r*r + 
				2*(Math.PI)*r*h);
	}
	
	// ���� ��� �޼��� ����
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
