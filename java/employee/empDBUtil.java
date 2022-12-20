package employee;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import customer.DBConnect;

public class empDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	 public static boolean insertEmployee(String ename,String branch_of_work,String email,String mobile,String empType) {
	    	
	    	boolean isSuccess = false;
	    	
	    	try {
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    	    String sql = "insert into employee values (0,'"+ename+"','"+branch_of_work+"','"+email+"','"+mobile+"','"+empType+"')";
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
	 
	 public static boolean deleteEmployee(String id) {
	    	
	    	int convId = Integer.parseInt(id);
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "delete from employee where id='"+convId+"'";
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
	    
	    
	    

}
