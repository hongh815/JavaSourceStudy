package chap7;
class A{ // extends java.lang.Object 가 숨어있다/
	double da; //필드변수	
	A() {super();}  //상속된 비에 에러를 막기 위해 새로 생성자를 호출한다.
	A(String s) { //A의 기본생성자에서 String s가 들어갓으므로 기본생성자가 사라졋다. 그러므로 
		super(); //모든 생성자는 보이지 않지만 super()가 만들어져 있다. -> Object 기본생성자 호출
		System.out.println("A생성자호출");
		this.da = 100;
	}
}
class B extends A {
	double db; //필드변수
	B() { //B의 기본생성자
		super("b"); //A(String s) 타입의 생성자 호출하는 super() 스트링타입의 b를 호출한거라 의미는 없다.
					// 이건 생략 불가능하다.
		
		// super(); 안써도 기본적으로 생성되어 있다. 숨어있다. -> A 기본생성자 호출
		System.out.println("B생성자호출");
		db = 1000;
	}
}
public class SuperTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	A a1 = new A();
		B b1 = new B();
		//Object -> A(da변수할당) -> B(db변수할당)
		System.out.println(b1.da);
		System.out.println(b1.db);
		
	}

}
