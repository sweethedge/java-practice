package original;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class A42Collection {

	public static void main(String[] args) {

		// ArrayList에 입력해서 출력하세요.
		// 제네릭이 없던 고대 자바에서는 이거 없이 써서 굴렸고, 지금도 잘 굴러간다.
		// 그러나 지금은 제네릭을 빼고 쓰면 좋은 소리를 못 듣는다.
		// https://plas.tistory.com/41	
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			// double 타입을 int로 바꾸면 소수점을 데이터에서 지우는 것이고,
			// 이거는 니가 알아서 감당하라는 뜻으로 이클립스가 욕을 한다.
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


// 배열의 문제점
// 1. 배열 내 데이터를 수동으로 넣고 빼야 된다
// 2. 데이터를 넣고 빼고 할 수는 있는데 하는데 시간이 많이 걸린다
// 3. 배열 크기는 한 번 설정했으면 낙장불입이다
// Sol) List를 쓴다.

// List간의 차이
// ArrayList / Vector - 비동기화 / 동기화
// LinkedList - 데이터가 저장되는 순서가 불연속적

// List / Map
// Map은 아예 인덱스가 없음
// HashMap - Key, Value 값으로 저장해야 되고 출력해야 함
// HashTable / HashMap - 동기화 X, null 저장 X / 동기화 O, null 저장 O
// TreeMap - Tree구조. 자연스럽게 정렬됨

// List / Set
// Set 또한 인덱스가 없고 HashCode만 있을 뿐임.
// Collection 중에서 검색 속도가 제일 빠름
// HashSet의 용도 - 데이터의 순서가 중요하지 않고 데이터가 중복되지 않는 컬렉션이 필요할 때. 로또.


