package chap5;

public class GugudanQuest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단 출력
		System.out.print("====구구단");
		System.out.println("테스트===="); // 문장이 출력 된 후에 밑줄로 이동하는 프린트
		
		// 사용자 입력 : 5 : 5단 이후 출력 중단 = break, 5단만 출력x = continue
		for (int i = 1; i < 10; i++) {
			for (int dan = 2; dan < 10; dan++) {
				
				if(dan == 5) break; // (break / continue) 반복문 안에서의 break의 사용 예
				System.out.print(dan + "*" + i +"=" + dan*i + "\t");
				
				//2*1 부터 9*1까지가 내부 반복문의 첫번째 싸이클이다.
			}
			System.out.println(); //내부의 반복문 한싸이클이 끝나면 엔터를 누르는 기능과 같은 명령문
			
		}

	}

}
