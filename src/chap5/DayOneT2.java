package chap2;

public class DayOneT2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int book = 52;
		int stu = 67;
		int d1 = book / stu;
		int d2 = book - stu;
		
		String con = book > stu ? ("한명의 학생당 " + d1 + "권씩 가질수 있습니다. 남아있는 책은" + d2 + "권입니다.") : "나눠줄 수 없습니다.";
		System.out.println(con);
	

	}

}
