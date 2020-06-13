package modifier;

class Person{
	
	String name;
	int age;
	final static String nation = "대한민국"; //1개의 동일한 값을 정해서 공유해도 될때, static을 쓴다. 이 글은 nation 변수를 저장하여 공유한다.
	
	Person() {  } //기본 생성자
}

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Person.nation); //2>클래스명.static필드변수명 은 쓸수 있다. 3>객체 생성 이전에 사용가능하다.
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 25;
		//p1.nation = "대한민국"; // 이렇게 국적을 바꾸면 모든 nation값이 바뀌기 때문에 바뀔수 없게 final을 붙인다.
		//4> p1.nation = "대한민국";ㅇ 위에서 이미 공유 변수로 지정했기 때문에 쓸필요 없다. 하지만 이렇게 써도 무관하다.
		
		
		System.out.println
		("p1의 객체 이름 = " + p1.name + ", 나이=" + p1.age + ", 국적=" +p1.nation);

		
		Person p2 = new Person();
		p2.name = "이순신";
		p2.age = 28;
		//p2.nation = "대한민국";
		
		System.out.println
		("p2의 객체 이름 = " + p2.name + ", 나이=" + p2.age + ", 국적=" +p2.nation);
		
		System.out.println(Integer.MAX_VALUE); //int 최대값
		System.out.println(Integer.MIN_VALUE); // int 최소값
		System.out.println(Integer.parseInt("100")); // 100을 int값으로 변환해주는 값

		// integer 클래스의 parseint 메소드의 100 변수 ==> 이 메소드의 설명을 보면 이또한 static을 사용하였다.
		
		String s = new String("java");
		s.equals("java"); //equals 메소드에서는 static이 선언 안되있으므로 String을 바로 붙일 수 없다.
	}

}
