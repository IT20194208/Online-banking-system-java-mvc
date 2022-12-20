package admin;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

//import customer.Customer;
//import customer.CustomerDBUtil;
import customer.DBConnect;

public class adminDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
public static boolean validate(String username, String password) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from admin where username='"+username+"' and password='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				isSuccess = true;
			} else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}

public static List<admin> getAdmin(String userName) {
	
	ArrayList<admin> admin = new ArrayList<>();
	
	try {
		
		con = DBConnect.getConnection();
		stmt = con.createStatement();
		String sql = "select * from admin where username='"+userName+"'";
		rs = stmt.executeQuery(sql);
		
		while (rs.next()) {
			int id = rs.getInt(1);
			String username = rs.getString(2);
			String password = rs.getString(3);
			
			admin add = new admin(id,username,password);
			admin.add(add);
		}
		
	} catch (Exception e) {
		
	}
	
	return admin;	
}

}
