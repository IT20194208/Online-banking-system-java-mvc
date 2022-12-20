package customer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CustomerInsert")
public class CustomerInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String birthDate = request.getParameter("birth");
		String mobile = request.getParameter("mobile");
		String nic = request.getParameter("nic");
		String email = request.getParameter("email");
		String username = request.getParameter("uid");
		String password = request.getParameter("psw");
		
		boolean isTrue;
		
		isTrue = CustomerDBUtil.insertcustomer(fname,lname,birthDate,mobile,nic,email,username, password);
		
		if(isTrue == true) {
			//RequestDispatcher dis = request.getRequestDispatcher("user_login.jsp");
			//dis.forward(request, response);
			out.println("<script type='text/javascript'>");
			out.println("alert('registration completed !!! welcome to our banking system');");
			out.println("location='user_login.jsp'");
			out.println("</script>");
			
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}
