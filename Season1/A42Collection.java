package original;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class A42Collection {

	public static void main(String[] args) {

		// ArrayList�� �Է��ؼ� ����ϼ���.
		// ���׸��� ���� ��� �ڹٿ����� �̰� ���� �Ἥ ���Ȱ�, ���ݵ� �� ��������.
		// �׷��� ������ ���׸��� ���� ���� ���� �Ҹ��� �� ��´�.
		// https://plas.tistory.com/41	
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			// double Ÿ���� int�� �ٲٸ� �Ҽ����� �����Ϳ��� ����� ���̰�,
			// �̰Ŵ� �ϰ� �˾Ƽ� �����϶�� ������ ��Ŭ������ ���� �Ѵ�.
			list.add((int) ((Math.random())*100));
		}

		System.out.print("ArrayList : ");
		System.out.println(list);
		System.out.println("=".repeat(80));

		Vector<Integer> list2 = new Vector<>();
		for (int i = 0; i < 100; i++) {
			list2.add((int) ((Math.random())*100));
		}

		System.out.print("Vector : ");
		System.out.println(list2);
		System.out.println("=".repeat(80));

		LinkedList<Integer> list3 = new LinkedList<Integer>();
		for (int i = 0; i < 100; i++) {
			list3.add((int) ((Math.random())*100));
		}

		System.out.print("LinkedList : ");
		System.out.println(list3);
		System.out.println("=".repeat(80));

		HashMap<Integer, Integer> list4 = new HashMap<>();
		for (int i = 0; i < 100; i++) {
			list4.put(i, (int) ((Math.random())*100));
		}

		System.out.print("HashMap : ");
		System.out.println(list4);
		System.out.println("=".repeat(80));


		HashSet<Integer> list5 = new HashSet<Integer>();
		for (int i = 0; i < 100; i++) {
			list5.add((int) ((Math.random())*100));
		}

		System.out.print("HashSet : ");
		System.out.println(list5);
		System.out.println("=".repeat(80));
		
		TreeSet<Integer> list6 = new TreeSet<Integer>();
		for (int i = 0; i < 100; i++) {
			list6.add((int) ((Math.random())*100));
		}
		System.out.print("TreeSet : ");
		System.out.println(list6);
		System.out.println("=".repeat(80));
	}

}


// �迭�� ������
// 1. �迭 �� �����͸� �������� �ְ� ���� �ȴ�
// 2. �����͸� �ְ� ���� �� ���� �ִµ� �ϴµ� �ð��� ���� �ɸ���
// 3. �迭 ũ��� �� �� ���������� ��������̴�
// Sol) List�� ����.

// List���� ����
// ArrayList / Vector - �񵿱�ȭ / ����ȭ
// LinkedList - �����Ͱ� ����Ǵ� ������ �ҿ�����

// List / Map
// Map�� �ƿ� �ε����� ����
// HashMap - Key, Value ������ �����ؾ� �ǰ� ����ؾ� ��
// HashTable / HashMap - ����ȭ X, null ���� X / ����ȭ O, null ���� O
// TreeMap - Tree����. �ڿ������� ���ĵ�

// List / Set
// Set ���� �ε����� ���� HashCode�� ���� ����.
// Collection �߿��� �˻� �ӵ��� ���� ����
// HashSet�� �뵵 - �������� ������ �߿����� �ʰ� �����Ͱ� �ߺ����� �ʴ� �÷����� �ʿ��� ��. �ζ�.


