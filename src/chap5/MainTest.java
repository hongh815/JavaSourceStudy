package chap5;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 명령형매개변수 입력받은 갯수만큼 내용 출력
		System.out.println("입력값갯수="+ args.length);
		
		for(int i = 0; i < args.length; i++) {
		System.out.println(args[i]); 
		}
		
		//연산식을 만들고 싶을때 ex)2개의 정수 입력
		
		System.out.println(args[0] + args[1]); //100+200=300 하곳싶을때
		// 문자열을 정수로 변환시켜야 한다.--> 정수 변환 라이브러리를 불러온다.
		int result1 = Integer.parseInt(args[0]);
		int result2 = Integer.parseInt(args[1]); //정수형 변환 라이브러리
		
		System.out.println("살술연산 결과는 " + (result1 + result2)); //300출력

	}

}
