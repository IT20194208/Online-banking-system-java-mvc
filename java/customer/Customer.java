package customer;

public class Customer {
	
	    private int id;
	    private String fname;
	    private String lname;
	    private String birthDate;
	    private String mobile;
	    private String nic;
	    private String email;
	    private String userName;
	    private String password;
	    
		public Customer(int id, String fname, String lname, String birthDate, String mobile, String nic, String email,
				String userName, String password) {
		
			this.id = id;
			this.fname = fname;
			this.lname = lname;
			this.birthDate = birthDate;
			this.mobile = mobile;
			this.nic = nic;
			this.email = email;
			this.userName = userName;
			this.password = password;
		}

		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}

		/**
		 * @return the fname
		 */
		public String getFname() {
			return fname;
		}

		/**
		 * @return the lname
		 */
		public String getLname() {
			return lname;
		}

		/**
		 * @return the birthDate
		 */
		public String getBirthDate() {
			return birthDate;
		}

		/**
		 * @return the mobile
		 */
		public String getMobile() {
			return mobile;
		}

		/**
		 * @return the nic
		 */
		public String getNic() {
			return nic;
		}

		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}

		/**
		 * @return the userName
		 */
		public String getUserName() {
			return userName;
		}

		/**
		 * @return the password
		 */
		public String getPassword() {
			return password;
		}

	   

}
