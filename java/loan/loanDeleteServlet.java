package loan;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employee.empDBUtil;

/**
 * Servlet implementation class loanDeleteServlet
 */
@WebServlet("/loanDeleteServlet")
public class loanDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("lid");
        boolean isTrue;
		
		isTrue = loanDBUtil.deleteLoan(id);
		
		if(isTrue==true) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("loan-list.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("unsuccess.jsp");
			dispatcher.forward(request, response);
		}
	}

}
