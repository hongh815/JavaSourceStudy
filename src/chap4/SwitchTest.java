package chap4;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학생 : 국어 영어 수학
		String name = "김학생";
		int kor, mat, eng; //변수 메모리 , 이름만 저장된 상태
		// 1~100 정수 임의로 랜덤생성
		kor = 100;//(int)(Math.random()*100) + 1;
		mat = (int)(Math.random()*100) + 1;
		eng = 100;//(int)(Math.random()*100) + 1;
		
		System.out.println("학생의 이름=" + name);
		System.out.println("국어=" + kor + ", 영어=" + eng + ", 수학=" + mat);
		
		
		// 총점계산 , 정수 평균, 실수 평균
		int sum = kor + mat + eng;
		int avg_int = sum / 3;
		double avg_double = (double)sum / 3;
		System.out.println("총점=" + sum);
		System.out.println("정수평균=" + avg_int);
		System.out.println("실수평균=" + avg_double);
		
		/*정수평균 90 이상 = A
		 * 		80 이상이고 90 미만 = B
		 * 		70 이상이고 80 미만 = C
		 * 		나머지는 F
		 */
		
		String result;
		int avg_int2 = avg_int / 10;
		
		switch(avg_int2) {

		case 10: // case 9 와 같은 값을 출력할 거라면 이렇게 생략하여 10이 나와도 그 다음으로 넘어가게 한다.		
		case 9: //if(avg_int >= 90)와 같은 의미이다.
			result = "A등급";
			break; //switch 중단한다
			
		case 8:
			result = "B등급";
			break;
		
		case 7:
			result = "C등급";
			break;
			
		default:
			result = "F등급";
			
		}
		
		System.out.println(result);
	}

}
