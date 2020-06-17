package chap7;
//extends 상속응용
class Employee{ //회사원 
	int id;
	String name ;
	double pay;
	
	void printField() {
		System.out.println("사번=" + id + ",이름 =" + name + ",급여=" + pay);
	}
}

class Manager extends Employee {//관리자 
	/*
	 * 상위 메소드 상속받은 후에 내요 변경
	 * 메소드 선언부 그대로, 내용 재정의
	 * void printField() {
		System.out.println("사번=" + id + ",이름 =" + name + ",급여=" + pay);
	
	 * 
	 *
	 */
	// Employee를 상속 받고 있는 Manager클래스는 name이 두개가 되버린다,
	String job;
	@Override
	void printField() {
		// TODO Auto-generated method stub
		super.printField(); // 상위클래스의  printField 를 출력하겠ㄸ다.
	//	System.out.println("사번=" + id + ",이름 =" + name + ",급여=" + pay);
		System.out.println("직종=" + job + ",직급=" + title);
		
	}


	String title;

	
	void test() { //메소드 정의/ main : 호출, 실행
		String name = "test"; //지역변수
		System.out.println(name); //지역변수 name
		System.out.println(this.name); //하위 필드변수
		System.out.println(super.name); //상위 필드변수  main에 super를 넣어봣자 EmploeeTest에는 상속된 클래스가 없으니 오류가 뜬가 그러므로 Manager에 쓰는것이 맞다
	}
}

public class EmploeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee e = new Employee();
		e.id = 100;
		e.name = "김사원";
		e.pay = 6000.99;
		System.out.println("사번=" + e.id + ",이름 =" + e.name + ",급여=" + e.pay);
		
		Manager m = new Manager();
		m.id = 200;
		m.name = "박임언";
		m.pay = 10000.5;
		m.job = "인사업무";
		m.title = "부장";
		System.out.println("사번=" + m.id + ",이름 =" + m.name + ",급여=" + m.pay + ",업무=" + m.job + ",직급="+ m.title);
		
		m.test();
		m.printField(); //manager의 void값을 출력 왜 썻냐... 기존의값을 고치고싶어서
	
	}

}
