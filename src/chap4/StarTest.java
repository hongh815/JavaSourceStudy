package chap4;

public class StarTest {

	public static void main(String[] args) {
		/* 별 5줄의 정사각형 만들어봐라.
		 * 
		 * * * * *
		 * * * * *
		 * * * * *
		 * * * * *
		 * * * * *
		 * 
		 */
		
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j < 6; j ++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		/*
		 * *****
		 * *   *
		 * *   *
		 * *   *
		 * *****
		 * 이거 만들어봐라
		 */
		int line = 5;
		for(int i=1; i<6; i++) {
			for(int j=1; j<6; j++) {
				if(i==1 || i==5 || j==1 || j==5)
					System.out.print("* ");
				else System.out.print("  ");
			}
			System.out.println();
		}
		
		
		// 직각 삼각형 만들어보라
		/* 
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 */
		
		for(int i = 1; i < 6; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		// 직각 삼각형 만들어보라
				/* 
				 * *****
				 * ****
				 * ***
				 * **
				 * *
				 */
		
		for(int i=1; i<=5; i++) {
			for(int j = 5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
				


	}

}
