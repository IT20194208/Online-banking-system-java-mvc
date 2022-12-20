package employee;

public class employee {
	
	private int id;
	private String ename;
	private String branch_of_work;
	private String email;
	private String mobile;
	private String empType;
	/**
	 * @param id
	 * @param ename
	 * @param branch_of_work
	 * @param email
	 * @param mobile
	 * @param empType
	 */
	public employee(int id, String ename, String branch_of_work, String email, String mobile, String empType) {
		super();
		this.id = id;
		this.ename = ename;
		this.branch_of_work = branch_of_work;
		this.email = email;
		this.mobile = mobile;
		this.empType = empType;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}
	/**
	 * @return the branch_of_work
	 */
	public String getBranch_of_work() {
		return branch_of_work;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * @return the empType
	 */
	public String getEmpType() {
		return empType;
	}
	
	

}
