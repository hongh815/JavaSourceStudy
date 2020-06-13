package chap5;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		String s4 = new String("java");
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3); // 연산자구조로 주소값을 가져오기 때문에 false
		System.out.println(s3 == s4); // false
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		s1="JAVAPROGRMING";
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		
		String s5 = null; //지정한 주소가 없다는 의미
		System.out.println(s5); //null 참조하는 문자열 주소값이 없다.
		System.out.println(s5.equals("java")); //프로그램 오류 발생 : 값이 없는 비교를 하는 것이 오류

	}

}
