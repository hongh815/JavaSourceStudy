package chap7;

abstract class Shape{
	abstract void area();
	abstract void circum();
	
}
class Rectangle extends Shape{
	int width;
	int height;
	
	@Override
	void area() {
		System.out.println("가로는" + width + ", 세로는" + height + "인 사각형의 면적은" + width*height);
	}

	@Override
	void circum() {
		System.out.println("가로는" + width + ", 세로는" + height + "인 사각형의 둘레는" + 2*(width+height));	
	}

	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
}

class Circle extends Shape{
	int radius;
	final double pi = 3.14;
	public Circle(int radius) {
	this.radius = radius;
	}
	@Override
	void area() {
		System.out.println( "반지름은" + radius + "인 원의 면적은" + radius*radius*pi);
	}
	@Override
	void circum() {
		System.out.println( "반지름은" + radius + "인 원의 둘레는" + 2*radius*pi);
	}
	
}
public class AbstractTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Shape s = new Shape(); //메모리 필드변수 + 메소드구현 할당 불가
		Shape s = null;
		//circle 5 입력 rect 7 8 입력
		if(args[0].equals("circle")) {
			s = new Circle(Integer.parseInt(args[1]));
		}
		else if(args[0].equals("rect")) {		
			int w = Integer.parseInt(args[1]);
			int h = Integer.parseInt(args[2]);
			s = new Rectangle(w, h); //s는 무조건 Shape의 하위클래스여야 한다.
		}
		s.area();
		s.circum();
	
	}
}