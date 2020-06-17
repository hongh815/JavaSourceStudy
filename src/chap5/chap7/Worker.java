package chap7;

public interface Worker {
	
	String name = "Worker"; //인터페이스에서는 모디파이어를 주지 않아도  자동으로 public static final 붙는다
	public abstract void work(); //모디파이어 모디파이어 리턴타입 메소드명
	/*public abstract */ void lunch(); //인터페이스의 메소드는 구현하면 안된다.
	
}
