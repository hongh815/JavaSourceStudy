package chap7;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WorkStudent ws = new WorkStudent();
		ws.work();
		ws.lunch();
		ws.study();
		//하위클래스 객체를 생성하여 상위 인터페이스 자동형변환 하는 것
		Student s = new WorkStudent();
		//s.work();
		s.lunch();
		s.study();
		
		System.out.println(Worker.name);
		System.out.println(Student.name);
		WorkStudent ws2 = new WorkStudent();
		System.out.println(Worker.name);

	}

}
