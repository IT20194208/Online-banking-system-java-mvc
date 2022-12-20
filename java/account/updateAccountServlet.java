package account;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer.Customer;
import customer.CustomerDBUtil;

/**
 * Servlet implementation class updateAccountServlet
 */
@WebServlet("/updateAccountServlet")
public class updateAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("Acc_id");
		String AccType = request.getParameter("Acc_Type");
		String prefix = request.getParameter("prefix");
		String minBalance = request.getParameter("minBalance");
		String interest = request.getParameter("interest");
		String status = request.getParameter("status");
		
		
		boolean isTrue;
		
		isTrue = acc_type_DBUtil.updateAccount(id,AccType,prefix,minBalance,interest,status);
		
		if(isTrue == true) {
			
			PrintWriter out = response.getWriter();
			out.println("<script type='text/javascript'>");
			out.println("alert('account details update completed!!!.');");
			out.println("location='account-list.jsp'");
			out.println("</script>");
			
			/*
			
			RequestDispatcher dis = request.getRequestDispatcher("account-list.jsp");
			dis.forward(request, response);
			
			*/
		}
		else {
			
			
			RequestDispatcher dis = request.getRequestDispatcher("account-list.jsp");
			dis.forward(request, response);
		}
	}

}
