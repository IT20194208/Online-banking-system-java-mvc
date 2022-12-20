package loan;

import java.io.IOException;
import java.sql.SQLException;
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
 * Servlet implementation class loanServlet
 */
@WebServlet("/loanServlet")
public class loanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String loantype = request.getParameter("loantype");
		String prefix = request.getParameter("prefix");
		String minAmount= request.getParameter("minAmount");
		String maxAmount = request.getParameter("maxAmount");
		String interest = request.getParameter("interest");
		String terms = request.getParameter("terms");
		String status = request.getParameter("status");
		
	  
	//	 double minAmount=DOUBLE_PARSER.parseDouble(minAmount, request.getParameter(minAmount));
		
		
		
		
		boolean isTrue;
		
		isTrue = loanDBUtil.insertloan(loantype,prefix,minAmount,maxAmount,interest,terms,status);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("loan-list.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
			
		
      	}
	
	}

