package account;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import employee.empDBUtil;

/**
 * Servlet implementation class deleteAccountServlet
 */
@WebServlet("/deleteAccountServlet")
public class deleteAccountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("Acc_id");
        boolean isTrue;
		
		isTrue = acc_type_DBUtil.deleteAccount(id);
		
		if(isTrue==true) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("account-list.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("account-list.jsp");
			dispatcher.forward(request, response);
		}
	}

}
