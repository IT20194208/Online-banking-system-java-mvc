package account;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class acc_type_insert
 */
@WebServlet("/acc_type_insert")
public class acc_type_insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String acc_type = request.getParameter("acc_type");
		String prefix = request.getParameter("prefix");
		String mini_balance = request.getParameter("mini_balance");
		String interest = request.getParameter("interest");
		String status = request.getParameter("status");
		
		boolean isTrue;
		
		isTrue = acc_type_DBUtil.insert_acc_type(acc_type, prefix, mini_balance, interest, status);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("account-list.jsp");
			dis.forward(request, response);
		}else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
