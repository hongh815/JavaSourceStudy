package chap2;

public class VarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// 정수 100 선언
	 	byte b1 = 100; // -128 ~ 127 까지 가능
		short s1 = 200;
		int i1 = 2000000000;
		long l1 = 20000000000L; //int에서 표현할 수 없는 정수사이즈를 나타내고싶을때 사용. 0000l
		
		System.out.println(b1 + b1);
		// 
		System.out.println("byte데이터=" + b1 + ',' + b1);
		System.out.println("short데이터는 " + s1);
		// 괄호 안에 있는 +는 덧셈 연산자가 아닌 함께 출력하라는 것.
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(10); //10데이터 - 정수 = 기본적으로 int로 간주된다
		
		System.out.println(Byte.MAX_VALUE); 
		// byte 의 최대 표현값을 자바가 계산하여 라이브러리 형태 (=api)로 출력
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		//
		boolean bool1 = true;
		System.out.println(bool1);
		bool1 = false;
		System.out.println(bool1);
		bool1 = 10 > 5;
		System.out.println(bool1);
		bool1 = 2000000000 <= Integer.MAX_VALUE;
		System.out.println(bool1);
		//bool1 = (boolean) 1; 이건 안됌
		
		char c1 = 'j'; //j 한문자는 2byte로 취급
		String st1 = "java"; // java는 8byte로 취급
		
		double d1 = (double) 100 / 3;
		System.out.println((int)d1); //--> 33.3333 으로 나오던 값을 int값으로 변환한 문장	
		// 33.0으로 출력되는 이유 : 100과 3은 정수이기 때문 그러므로 형변환연산자 사용한다
		System.out.println(100 / 3);
		
		System.out.println(100 % 3); //나머지
		
		
		
		

	}

}
