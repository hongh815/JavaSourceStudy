package constructor;

class Sample{
	int a = 10;
}

class C{
	void add(int i) {
		System.out.println(i++);
	}
	void addSample(Sample s) { //참조타입의 변수가 어떻게 전달되어지는지 보려고 만든 코드
		System.out.println(s.a++);
	}
}
public class CallByValueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c1 = new C();
		Sample t = new Sample();
		c1.addSample(t);
		System.out.println("c1.addSample(t) 호출 후의 t.a=" + t.a);
		//		int j = 10;
	//	c1.add(j);
		//System.out.println("c1.add(j) 호출 후의 j=" + j);
	}

}
