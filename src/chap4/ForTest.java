package chap4;

public class ForTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1~10 정수 총합
		int sum = 0; // main 매소드 블록의 지역변수라 한다.
		for(int f = 1; f <= 10; f++) {
			
			//int j = 10; //for 블록 안에 있는 지역변수라 한다.
			sum = sum + f;
			//System.out.println("i=" + i + " , sum=" + sum);
			
		}
		System.out.println("for 반복문 결과=" + sum); //최종 sum값 출력
		
		// for문과 같은 결과를 while문으로 해보는 과정
		sum = 0;
		int i = 1;
		while (i <= 10) {
			
			sum = sum + i;
			System.out.println("i =" + i + ", sum=" + sum);
			i++;
			
		}
		System.out.println("while 반복문 결과 " + sum);
		
		// 위와 같은 결과를 do-while문으로 
		
		
		sum = 0;
		i = 1; //위에서 이미 i가 정수형으로 쓰이고 있으므로 게속 변하고 있는 i를 1로 다시 초기화 한다음 사용
		do {
			
			sum = i + sum;
			System.out.println("i=" + i + ", sum=" + sum);
			i++;
			
		} while(i <= 10);

	}

}
