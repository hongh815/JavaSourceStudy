package chap5;

public class StudentPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student();
		int pay = Integer.parseInt(args[3]);
		int payP = Integer.parseInt(args[4]);
		
		
		s1.pay=pay;
		s1.payP=payP;
		s1.name=args[0];
		s1.id=args[1];
		s1.cul=args[2];
		int c=0;
		
		if(s1.cul.equals("자바프로그래밍")) {
			s1.payB = pay*0.25 + payP;
			c=1;
		}
		else if(s1.cul.equals("JDBC프로그래밍")) {
			s1.payB = pay*0.20 + payP;
			c=1;
		}
		else if(s1.cul.equals("JSP프로그래밍")) {
			s1.payB = pay*0.15 + payP;
			c=1;
		}
		else s1.payB=0;
		
		if (c == 1) {
			System.out.println("이름="+s1.name + "\n"
								+ "소속="+s1.id + "\n"
								+ "과목"+s1.cul + "\n"
								+ "교육비"+s1.pay + "\n"
								+ "부가금="+s1.payP + "\n"
								+ "환급금="+s1.payB);
		}
		else System.out.println("잘못입력되었습니다.");
		}

}
