package chap5;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//배열 생성 후 확인하는 작업
		int [] scores = new int[10]; //배열 선언 생성 하지만 배열값은 지정 안된 단계
		String names [] = 
			{"첫","두","셋", "넷", "다섯", "여섯", "일곱", "여덟", "아홈","열"};
			// 배열 선언 + 10개 배열 생성 + 배열값 저장 ㅇ
		//new String[scores.length];
		System.out.println("scores배열길이는" + scores.length);
		System.out.println("names 배열길이는" + names.length); 
		
		for(int index = 0; index < scores.length; index++) {
		scores[index] = (int)(Math.random()*100)+1;
		//임의 1~100 정수 10개 생성
		System.out.println
		("이름:"+names[index]+" 의 점수="+scores[index]+"\t");
	
		}
		System.out.println();
		
		//총점
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum =sum + scores[i];
		}
		System.out.println("총점="+sum);
		int avg = sum / scores.length;
		System.out.println("평균="+avg);
		
	}

}


/*****************************/
//                                //
//                                //
//                                //
//                                //
//        PUSH TEST!          //
//                                //
//                                //
//                                //
/*****************************/