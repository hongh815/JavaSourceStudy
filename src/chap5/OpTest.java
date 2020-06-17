package chap2;

public class OpTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		System.out.println("a원래값 =" + a);
		System.out.println("b원래값 =" + b);
		
		int c = a; //c = 10
		a = b; // a = 20
		b = c;// b = c
		System.out.println("a대체값 =" + a);
		System.out.println("b대체값 =" + b);
		
		/*b = a의 결과값이 b의 값이 원하는 10이 되지 않는것을 보았다. 
		 * 그래서 위와 같이 c를 따로 선언하여 a가 20으로 변하기 전 값을 c에 저장한다 
		 */
		
		int d = 1;
		d = d + 1; // == d++; , d+=1;

	}

}
