package chap4;

public class PrimenumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String title = "소수 구한 결과";
		int target = 13;
		
		System.out.println
		("1부터" + target + " 까지의 숫자 중에서" + title + " 입니다.");
		
		/* 소수 판별하는 코딩하라
		 * 13 소수인지 판단 : 1, 자기 자신으로만 나누어지는 자연수
		 */
		for(int i = 1; i <= target; i++) {
			int con;
			int zeroCount = 0;
			for(int j = 1; j <= i; j++) {
				
				con = i%j;
				if(con == 0) zeroCount += 1;
				else continue;
			}
			if(zeroCount <= 2) System.out.println(i+":"+"소수.");
			else System.out.println(i+":"+"소수아니다.");
		}
		
		// 선생님 답안 ============================================================
		int num = 13;
		for(int j=3; j<=num; j+=2) {
			
			int cnt = 0;
			for(int i=1; i<=j; i++) {
				if(j%i==0) {
					cnt++;
				}
			}
			
			if(cnt==2) {
				System.out.println(j+" : 소수다");
			}
			else System.out.println(j+" : 소수가 아니다");
		}
		// ====================================================================

	}

}
