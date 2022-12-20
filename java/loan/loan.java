package loan;
import java.sql.Connection;

public class loan {
	
	private int id;
	private String LoanType;
	private String prefix;
	private String minAmount;
	private String maxAmount;
	private String interest;
	private String terms;
	private String status;
	/**
	 * @param loanType
	 * @param prefix
	 * @param minAmount
	 * @param maxAmount
	 * @param interest
	 * @param terms
	 * @param status
	 */
	public loan(int id,String loanType, String prefix, String minAmount,String maxAmount,String interest, String terms,
			String status) {
		
		LoanType = loanType;
		this.prefix = prefix;
		this.minAmount = minAmount;
		this.maxAmount = maxAmount;
		this.interest = interest;
		this.terms = terms;
		this.status = status;
		this.id=id;
	}
	/**
	 * @return the loanType
	 */
	public String getLoanType() {
		return LoanType;
	}
	/**
	 * @return the prefix
	 */
	public String getPrefix() {
		return prefix;
	}
	/**
	 * @return the minAmount
	 */
	public String getMinAmount() {
		return minAmount;
	}
	/**
	 * @return the maxAmount
	 */
	public String getMaxAmount() {
		return maxAmount;
	}
	/**
	 * @return the interest
	 */
	public String getInterest() {
		return interest;
	}
	/**
	 * @return the terms
	 */
	public String getTerms() {
		return terms;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param loanType the loanType to set
	 */
	
	/**
	 * @return the id of the admin
	 */
	public int getid() {
		
		return id;
	}
	
		
	

}
