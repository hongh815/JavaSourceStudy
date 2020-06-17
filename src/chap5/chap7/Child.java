package chap7;

class Parent{
	int x = 10;
	void ma() {
		System.out.println(x);
	}
	void mp() {
		System.out.println("Parent");
	}
	
}
class Child2 extends Parent{
	int x = 100;
	void ma() {
		System.out.println(x);
	}
	void mc() {
		System.out.println("Child");
	}
}

public class Child {
	public static void main(String [] args) {
		
		Parent p1 = new Parent(); //형변환할 필요 없다
		System.out.println(p1.x);
		p1.ma();
		p1.mp();
	//	p1.mc(); ==> 메모리 없는 메소드
		
		
		Child2 c1 = new Child2(); //형변환할 필요 없다
		System.out.println(c1.x);
		c1.ma();
		c1.mp();
		c1.mc();
		
		Parent p2 = new Child2();  // 차일드2가 상속하는 것이 페어런트이므로 자동형변환 되어 가능
		System.out.println(p2.x); //페어런트 객체.변수값
		p2.ma(); // 오버라이딩되어 차일드2 객체의 값이 나온다.
		p2.mp();
		//p2.mc(); //=> 차일드 영역에 존재하나, 차일드 타입을 재변경해야 한다. : 명시적 형변환가능
					// 사용하다 보면 상위 변ㄴ수만사용 - 하위변수나 메소드 사용가능하겧 하기 위해
		//Child2 c3 = (Child2) p2;
		//c3.mc();
		((Child2)p2).mc();
		Child2 c2 = (Child2) new Parent(); 
		//차일드2는 페어런트를 상속하므로 페어런트 타입이 잇지만 페어런트는 그렇지 않다 그래서 오류
		System.out.println(c2.x);
		c2.ma();
		
		
	
		
	}

}
