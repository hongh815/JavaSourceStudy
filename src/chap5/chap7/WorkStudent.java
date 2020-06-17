package chap7;

public class WorkStudent implements Worker, Student{
	String name = "실습실조교";  //클래스에서는 모디파이어를 붙여주어야한다
	void print() {//상속과 무관 추가 메소드
		System.out.println(Worker.name + ", " + Student.name + ", " + name);
	}
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("조교가 공부하다");
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println("조교가 일하다");
	}

	@Override
	public void lunch() {
		// TODO Auto-generated method stub
		System.out.println("조교가 점심먹다");
	}
	

}
