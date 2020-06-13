package chap5;

class Trainee{
	
	String name;
	String dept;
	String subject;
	
	double eduFee , addFee , returnFee ;
}

public class StudentF {
	
	public static void main(String [] args) {
		
		Trainee stu = new Trainee();
		stu.name = args[0];
		stu.dept = args[1];
		stu.subject = args[2];
		stu.eduFee = Double.parseDouble(args[3]);
		stu.addFee = Double.parseDouble(args[4]);
		
		if(stu.subject.equals("자바프로그래밍")) {
			stu.returnFee = (stu.eduFee*0.25) + stu.addFee;
			
		}
		else if (stu.subject.equalsIgnoreCase("JDBC프로그래밍")) {
			stu.returnFee = (stu.eduFee*0.20) + stu.addFee;
			
		}
		else if (stu.subject.equalsIgnoreCase("JSP프로그래밍")) {
			stu.returnFee = (stu.eduFee*0.15) + stu.addFee;
			//대소문자 무시하고 다 입력 받는 equalsIgnoreCase
		} else stu.returnFee = 0;
		
		if(stu.returnFee == 0)
			System.out.println("잘못 입력되었습니다.");
		else {
			System.out.println("이름 = " + stu.name);
			System.out.println("소속 = " + stu.dept);
			System.out.println("과정명 = " + stu.subject);
			System.out.println("교육비 = " + stu.eduFee);
			System.out.println("부가금 = " + stu.addFee);
			System.out.println("환급금 = " + stu.returnFee);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
