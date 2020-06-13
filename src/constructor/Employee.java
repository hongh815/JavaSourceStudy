package constructor;

public class Employee {
	//회사원객체 표현 클래스 : 정적 파악
	//사번 이름 급여 부서명 : 변수   --> 변수 타입 = 값
	int id;
	String name;
	double salary;
	String deptName;
	// 복사본 = 객체생성 = HEAP 영역에 저장 = 객체 참조타입 변수 취급
	//생성자 정의
	Employee(int id, String name, double salary, String deptName){
		System.out.println
		("생성자 호출");				
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.deptName = deptName;
	}
	// Employee e1 = new Employee();
	// 객체가 생성이 될때 생성자도 같이 생성이 된다.
	/* 보이지 않는 이유는 생성자 내부에 아무것도 호출된것이 없기때문이다.
	 * 
	 * 평소 (기본 생성자): Employee() {  }
	 * 
	 * 임의로 정의 : Employee() {system.out.println("생성자 호출");}
	 * 
	 * 생성자 정의 변경하면 기본 생성자는 자동 삭제된다.
	 * */
	
	//이름은 같고 "전달변수" 다르게 정의 가능 = 생성자 overloading 정의 (아직 정해지지 않은 값이 있을 경우에도 급하게 생성해야 하는경우 사용)
	// 전달 변수 갯수 또는 순서 또는 타입중 1개 이상 다르게 정의 할 수 있다.
	// 정의하고 싶은 만큼 만들 수 있다.
	Employee(int id , String name) {
		this (id, name, -1, "미정");
		//this.id = id;
		//this.name = name;
		//this.salary = -1;
		//deptName = "미정";
	}
	
	Employee() {
		this(0, "미상", -1, "미정");
		//System.out.println("생성자 호출3");
		//id = 0;
		//name = "미상";
		//salary = -1;
		//deptName = "미정";
	}
	//필드변수 4개 값 출력 기능 메소드
	void printField() {
		setSalary(5000);
		System.out.println
		("사번=" + id + ",이름=" + name + ",급여=" + salary + ",부서=" + deptName);
	}
	
	void setSalary(double salary) {
		this.salary = this.salary + salary;// == this.salary += salary;
		
	}
 
}
