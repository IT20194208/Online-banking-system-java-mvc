package loan;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import customer.Customer;
//import customer.CustomerDBUtil;


/**
 * Servlet implementation class LoanupdateServlet
 */
@WebServlet("/LoanupdateServlet")
public class LoanupdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("lid");
		String loanType = request.getParameter("loanType");
		String prefix = request.getParameter("prefix");
		String minAmount = request.getParameter("minAmount");
		String maxAmount = request.getParameter("maxAmount");
		String interest = request.getParameter("interest");
		String terms = request.getParameter("terms");
		String status = request.getParameter("status");
		
		System.out.println(id);
		System.out.println(loanType);
		System.out.println(prefix);
		System.out.println(minAmount);
		System.out.println(maxAmount);
		System.out.println(interest);
		System.out.println(terms);
		System.out.println(status);
		
		// int convertedID = Integer.parseInt(lid);
		
		
		boolean isTrue;
		
		isTrue =loanDBUtil.updateLoan(id,loanType,prefix,minAmount,maxAmount,interest,terms,status);
		
		if(isTrue == true) {
			
			
			
			RequestDispatcher dis = request.getRequestDispatcher("loan-list.jsp");
			dis.forward(request, response);
		}
		else {
			
			RequestDispatcher dis = request.getRequestDispatcher("unsuccess.jsp");
			dis.forward(request, response);
		}
		
		
	}

}
