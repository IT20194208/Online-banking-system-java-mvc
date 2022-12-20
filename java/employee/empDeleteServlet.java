package employee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import customer.CustomerDBUtil;

/**
 * Servlet implementation class empDeleteServlet
 */
@WebServlet("/empDeleteServlet")
public class empDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("eid");
        boolean isTrue;
		
		isTrue = empDBUtil.deleteEmployee(id);
		
		if(isTrue==true) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("employee-list.jsp");
			dispatcher.forward(request, response);
		}
		else {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("unsuccess.jsp");
			dispatcher.forward(request, response);
		}
	}

}
