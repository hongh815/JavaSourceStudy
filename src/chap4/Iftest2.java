package chap4;

public class Iftest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학생 : 국어 영어 수학
		String name = "김학생";
		int kor, mat, eng; //변수 메모리 , 이름만 저장된 상태
		// 1~100 정수 임의로 랜덤생성
		kor = (int)(Math.random()*100) + 1;
		mat = (int)(Math.random()*100) + 1;
		eng = (int)(Math.random()*100) + 1;
		
		System.out.println("학생의 이름=" + name);
		System.out.println("국어=" + kor + ", 영어=" + eng + ", 수학=" + mat);
		
		
		// 총점계산 , 정수 평균, 실수 평균
		int sum = kor + mat + eng;
		int avg_int = sum / 3;
		double avg_double = (double)sum / 3;
		System.out.println("총점=" + sum);
		System.out.println("정수평균=" + avg_int);
		System.out.println("실수평균=" + avg_double);
		
		//정수평균 80 이상은 수료고 아니면 미수료
		String result;
		if(avg_int >= 80) {
			result = "수료"; //최초의 값 저장 == 변수 초기화라 한다.
			
		}
		else {
			result = "미수료";
			
		}
		System.out.println(result);
		
		/*정수평균 90 이상 = A
		 * 		80 이상이고 90 미만 = B
		 * 		70 이상이고 80 미만 = C
		 * 		나머지는 F
		 */
		// 위의 이미 난수로 범위를 지정하여 따로 if문으로 범위 지정하지 않아도 된다.
			if(avg_int >= 90) {
				
				result = "A등급";
			}
			else if(avg_int >= 80) {
				
				result = "B등급";
			}
			else if(avg_int >= 70) {
				
				result = "C등급";
			}
			else {
				result = "F등급";
			}
			
		
		//else {
		//	result = "점수에 음수가 포함되어있습니다. 다시 입력하세요.";
		//}
		System.out.println(result);
		
		// 1~45까지 범위 지정
		//(int)(Math.random()*범위) + 시작값;
		//(int)(Math.random()*45) + 1;

		
	}

}
