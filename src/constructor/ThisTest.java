package constructor;

class A{
	int i; //필드변수
	int j; //필드변수
	A(int i){ //매개변수(메소드 나 생성자)
		int j = 10; //지역변수
		System.out.println(this.i+this.j);
		
	}
	A() { //매개변수 없고 지역변수도 없는.
		System.out.println(i+j);
	}
}
public class ThisTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a1 = new A(100); //100 + 10
		A a2 = new A(200); //200 + 10

	}

}
