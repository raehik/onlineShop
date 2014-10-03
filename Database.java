package onlineShop;

import java.util.ArrayList;
import java.util.List;

public class Database {
	// main database: stores users, hashed passwords, email addresses & card numbers
	List<User> users;
	
	public Database() {
		users = new ArrayList<User>();
	}
	
	private int indexOf(String user) {
		for (int i = 0; i < this.users.size() -1; i++) {
			if (user.equals(this.users.get(i).user()));
		}
		for (User u : this.users) {
			System.out.println(user + u.user());
			if (user.equals(u.user())) {
				return this.users.indexOf(u);
			}/* else {
				// needed?
				continue;
			}*/
		}
		
		// if no user with that name exists
		return -1;
	}
	
	private String getHashOf(int user) {
		return this.users.get(user).hash();
	}
	
	public void addUser(String user, String hash, String email, int cardNo) {
		users.add(new User(user, hash, email, cardNo));
	}
	
	public void removeUser(String user, String hash) {
		int index = this.indexOf(user);
		if (index == -1) {
			System.out.println("ERROR: can't remove user: doesn't exist");
		}
		/*if hash.equals(stored hash) {
			//great;
		} else {
			//wrong password bro;
		}*/
	}
	
	public static void main(String[] args) {
		Database db = new Database();
		db.addUser("rae", "123", "raehik@raehik.net", 123456789);
		db.addUser("raehik", "123", "raehik@raehik.net", 123456789);
		db.addUser("raeh", "123", "raehik@raehik.net", 123456789);
		System.out.println(db.indexOf("raehik"));
	}

}
