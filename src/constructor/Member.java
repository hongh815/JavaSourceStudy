package constructor;

class Info{
	String id;
	int pass;
	String name;
	int ber;
	
	Info(String id, int pass, String name, int ber) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.ber = ber;
	}
	
	void insert() {
		//login("hongh815", 4554, "김홍범", 29);
		System.out.println("아이디=" + id);
		System.out.println("암호=" + pass);
		System.out.println("이름=" + name);
		System.out.println("나이=" + ber);
		System.out.println("가입이 완료되었습니다.");
		
	}
	
	void login(String id, int pass) {
		int x=0;
		if(this.id == id)
			if(this.pass == pass) {
						x=1;
					}
		else 
		if(x==1) {
			System.out.println("로그인이 되었습니다.");
		} else System.out.println("로그인 정보를 다시 확인해주세요.");
		
		
	}
	
}


public class Member {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Info I1 = new Info("hongh815",5464,"김홍범",29);
		//I1.insert();
		I1.login("hongh815", 4554);
		
		
		

	}

}
