package account;

public class account {
	
	private int id;
	private String AccountType;
	private String prefix;
	private double minBalance;
	private double  interest;
	private String status;
	
	
	/**
	 * @param id
	 * @param accountType
	 * @param prefix
	 * @param minBalance
	 * @param interest
	 * @param status
	 */
	public account(int id, String accountType, String prefix, double minBalance, double interest, String status) {
		super();
		this.id = id;
		AccountType = accountType;
		this.prefix = prefix;
		this.minBalance = minBalance;
		this.interest = interest;
		this.status = status;
	}
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return AccountType;
	}
	/**
	 * @return the prefix
	 */
	public String getPrefix() {
		return prefix;
	}
	/**
	 * @return the minBalance
	 */
	public double getMinBalance() {
		return minBalance;
	}
	/**
	 * @return the interest
	 */
	public double getInterest() {
		return interest;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	
}
