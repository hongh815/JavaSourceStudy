package test;
// 정보은닉 설계가 잘 된 설계
public class Student {

	private int id;
	private String name;
	private double score; //private 자기 자신 이외에 다르 클래스에서 사용 불가하게 만드는 것

	
	// 메뉴에 Source -> Gen.. get and set 메뉴에서 게터 세터 설정 바로 가능하다
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//setter / getter 메소드
	public double getScore(){ //읽기 , getter : 읽기위한 것으로 return 많이 쓴다.
		return score;
	} 
	
	public void setScore(double score) {//쓰기, 매개변수, setter : 쓰기위한 것
		this.score = score;
	}
}

