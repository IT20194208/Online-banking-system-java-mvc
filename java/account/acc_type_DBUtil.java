package account;
import java.sql.DriverManager;
import customer.DBConnect;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class acc_type_DBUtil {
	
	private static boolean isSuccess = false;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean insert_acc_type(String acc_type, String prefix, String mini_balance, String interest, String status) {
		
		
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
    		con = DBConnect.getConnection();
    		stmt = con.createStatement();
			String sql = "insert into account_type values (0,'"+acc_type+"','"+prefix+"','"+mini_balance+"','"+interest+"','"+status+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs > 0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
	
	 public static boolean updateAccount(String id, String Acc_type,String prefix,String minBalance,String interest,String status) {
	    	
	    	
			try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "update account_type set acc_type='"+Acc_type+"',prefix='"+prefix+"',mini_balance='"+minBalance+"',interest='"+interest+"',status='"+status+"'"+"where id='"+id+"'";
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
	 
	 public static boolean deleteAccount(String id) {
	    	
	    	int convId = Integer.parseInt(id);
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "delete from account_type where id='"+convId+"'";
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
