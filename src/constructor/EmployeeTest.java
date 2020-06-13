package constructor;

// 실행 첫 시작 메소드
public class EmployeeTest {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 복사본 = 겍체 셍상 = HEAP 영역에 저장 = 객체 참조타입 변수 취급
		Employee e1 = new Employee(100, "김사원", 5000.55, "인사부"); //생성자라인
		e1.setSalary(50000);
		e1.printField();//출력문장 직접작성---> 메소드 호출 1번 정의
		//System.out.println(e1); //chap5.Employee@15db9742(16진수) Employee클래스의 주소값을 복사
		//System.out.println("사번="+e1.id+", 이름="+e1.name+", 급여="+e1.salary+", 부서="+e1.deptName);
		
		Employee e2 = new Employee(200, "박사원"); //회사원객체2 복사
		e2.printField();
		//System.out.println(e1); //chap5.Employee@15db9742(16진수) Employee클래스의 주소값을 복사
		//System.out.println("사번="+e2.id+", 이름="+e2.name+", 급여="+e2.salary+", 부서="+e2.deptName);

		Employee e3 = new Employee(); //생성자라인
		e3.printField();
		//System.out.println(e1); //chap5.Employee@15db9742(16진수) Employee클래스의 주소값을 복사
		//System.out.println("사번="+e3.id+", 이름="+e3.name+", 급여="+e3.salary+", 부서="+e3.deptName);
	
	}

}
