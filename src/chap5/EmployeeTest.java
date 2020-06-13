package chap5;

// 실행 첫 시작 메소드
public class EmployeeTest {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 복사본 = 겍체 셍상 = HEAP 영역에 저장 = 객체 참조타입 변수 취급
		Employee e1 = new Employee();
		System.out.println(e1); //chap5.Employee@15db9742(16진수) Employee클래스의 주소값을 복사
		
		e1.id = 100; //사번 100
		e1.name = "김사원";
		e1.salary = 5000.55;
		e1.deptName = "인사부";
		System.out.println("사번="+e1.id+", 이름="+e1.name+", 급여="+e1.salary+", 부서="+e1.deptName);
	
		Employee e2 = new Employee(); //회사원객체2 복사
		System.out.println(e1); //chap5.Employee@15db9742(16진수) Employee클래스의 주소값을 복사
		
		e2.id = 200; //사번 200
		e2.name = "박사원";
		e2.salary = 6000.55;
		e2.deptName = "개발부";
		System.out.println("사번="+e2.id+", 이름="+e2.name+", 급여="+e2.salary+", 부서="+e2.deptName);

	}

}
