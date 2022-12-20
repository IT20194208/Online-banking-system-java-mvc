package loan;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import customer.Customer;
import customer.DBConnect;//data base connection getting from the customer package//

public class loanDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
  
	
	 public static boolean insertloan(String loanType, String prefix, String minAmount, String maxAmount, String interest, String terms,
				String status) {
	    	
	    	boolean isSuccess = false;
	    	
	    	try {
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    	    String sql = "insert into loan values (0,'"+loanType+"','"+prefix+"','"+minAmount+"','"+maxAmount+"','"+interest+"','"+terms+"','"+status+"')";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		} else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	 	
	    	return isSuccess;
	    }
	 
	 public static boolean updateLoan(String id, String loanType,String prefix,String minAmount,String maxAmount,String interest,String terms,String status) {
		
		
		 
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "UPDATE loan SET loanType='"+loanType+"',prefix='"+prefix+"',minAmount='"+minAmount+"',maxAmount='"+maxAmount+"',interest='"+interest+",terms='"+terms+"',status='"+status+"'"+"WHERE id='"+id +"'";
	    		
	    		
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	    }
	 
	 public static boolean deleteLoan(String id) {
	    	
	    	int convId = Integer.parseInt(id);
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "delete from loan where id='"+convId+"'";
	    		int r = stmt.executeUpdate(sql);
	    		
	    		if (r > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	    }
	 
	 /*
	 
	 public static List<loan> getLoanDetails(int lid) {
	    	
	    	//int convertedID = Integer.parseInt(lid);
	    	
	    	ArrayList<loan> lo = new ArrayList<>();
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select * from loan where id='"+lid+"'";
	    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    			
	    			int id = rs.getInt(1);
					String loanType = rs.getString(2);
					String prefix = rs.getString(3);
					String minAmount = rs.getString(4);
					String maxAmount = rs.getString(5);
					String interest = rs.getString(6);
					String terms = rs.getString(7);
					String status = rs.getString(8);
				
	    			
	    			loan loan = new loan(id, loanType, prefix, minAmount, maxAmount, interest, terms, status);
	    			lo.add(loan);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}	
	    	return lo;	
	    }

	*/
	}

	

