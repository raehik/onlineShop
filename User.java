package onlineShop;

public class User {
	private String user;
	private String hash;
	private String email;
	private int cardNo;
	
	User(String user, String hash, String email, int cardNo) {
		this.user = user;
		this.hash = hash;
		this.email = email;
		this.cardNo = cardNo;
	}
	
	public String hash() {
		return this.hash;
	}
	
	public String user() {
		return this.user;
	}

}
