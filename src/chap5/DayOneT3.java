package chap2;

public class DayOneT3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time = 10000;
		double hour = time/3600;
		double minute = (time%3600)/60;
		double sec = ((time%3600)%60)/1;
		
		System.out.println(time + "초는 " + hour + "시간 " + minute + "분 " + sec + "초 입니다.");

	}

}
