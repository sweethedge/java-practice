// (������� �ѳ���) = 2��r^2+2��rh
// (������� ����) = ��r^2h

package original;

// Ŭ���� ����
class Cylinder {
	// �ʵ� ����...?
	private double radius = 0;
	private double height = 0;

	// �ѳ��� ��� �޼��� ����
	public void getArea(double r, double h) {
		System.out.println(2*(Math.PI)*r*r + 2*(Math.PI)*r*h);
	}

	// ���� ��� �޼��� ����
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
