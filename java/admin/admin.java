package admin;

public class admin {
	
	private int id;
	private String username;
	private String password;
	/**
	 * @param username
	 * @param password
	 */
	public admin(int id,String username, String password) {
		
		this.username = username;
		this.password = password;
		this.id=id;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @return the id of the admin
	 */
	public int getid() {
		
		return id;
	}
	
		

}
