//Textbook > edu > Test32.java

package original;

public class A26Connector {
	public static void main(String[] args) {


		// 배열 선언 2 : new 연산자 생략
		String arr[] = {
				"서울 : 599 명", 
				"부산 : 51 명", 
				"인천 : 46 명", 
				"대전 : 43 명", 
				"대구 : 27 명"
		}; 

		// 반복문으로 출력
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
		
		// 확장 for 문으로 출력
		for (String a : arr)
			System.out.println(a);
		}
	}



// 배열 선언 1 
// String arr[] = new String[5]; 

// 배열에 값 저장 
//arr[0] = "서울 : 599 명";
//arr[1] = "부산 : 51 명"; 
//arr[2] = "인천 : 46 명"; 
//arr[3] = "대전 : 43 명"; 
//arr[4] = "대구 : 27 명";


/* 배열 선언 3 : 굳이 new 연산자를 쓰기
		String arr[] = new String[] {
				"서울 : 599 명", 
				"부산 : 51 명", 
				"인천 : 46 명", 
				"대전 : 43 명", 
				"대구 : 27 명"
		};

 */