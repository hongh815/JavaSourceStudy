package constructor;

class B{ //기본타입 + 참조타입 + void
	void m1(int i) {           //m1메소드
		System.out.println(i*i);
		//return 문장이 없다; --> 돌려주는 결과값이 없다.
		// void는 return문이 없어야 한다.
	}
	
	int m2(int i) {				//m2메소드
		return i*i;
	}
	// m2가 실행되면 i*i 연산으로 되돌려줘 리턴타입은 int 야 
	String m3(int i) {
		return i + "의 제곱은 " + i*i; 
	}
	//return문이 있고 그 안에 문자형이 있으므로 String 으로 리턴타입을 잡는다.
	
	int [] m4(int i){
		int result[] = new int[2];
		result[0] = i;		//자바는 return문이 두개인것을 허용하지 않는다.
		result[1] = i*i;	//그래서 지역변수를 선언한 후에 변수 자체를 return해준다.
		return result;
	}
	
	Employee m5(int i, String n) {
		//i 가 id이고 n 이 name인 Employee 객체 생성하고 리턴하는 예제
		Employee e = new Employee(i, n);
		return e;
	}
	void m6(int i) {
		System.out.println("m6 메소드 실행 시작");
		//if(i==0) 이면 메소드를 중단시키고 싶다면?
		//반복문 중단: break 한번만 중단 : continue
		if(true) return; // 조건문에 따라서 참이면 중단시키고 싶다면? 이렇게
		System.out.println("m6 메소드 실행 종료");
	}

}

public class ReturnTyteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b1 = new B();  //객체 생성
		
		b1.m1(10);
		b1.m2(10); //100
		int result2 = b1.m2(10); // m2의 return문은 m2를 호출했던 이자리로 돌아간다는 것을 의미
		System.out.println(result2); //100을 되돌려 받아서 출력하라;
		
		int[] result4 = b1.m4(10);
		for(int j = 0; j < result4.length; j++) {
			System.out.println(result4[j]);
		}
		
		Employee e = b1.m5(300,"김과장");
		e.printField();
		
		System.out.println("main에서 m6호출 시작");
		b1.m6(10);
		System.out.println("main에서 m6호출 종료");
		
		
	}

}
