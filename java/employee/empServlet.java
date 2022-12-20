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
 * Servlet implementation class empServlet
 */
@WebServlet("/empServlet")
public class empServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		String ename = request.getParameter("ename");
		String branch_of_work = request.getParameter("branch_of_work");
		String email = request.getParameter("email");
		String mobile = request.getParameter("emobile");
		String empType = request.getParameter("typeofemp");
		
		
		boolean isTrue;
		
		isTrue = empDBUtil.insertEmployee(ename,branch_of_work,email,mobile,empType);
		
		if(isTrue == true) {
			RequestDispatcher dis = request.getRequestDispatcher("employee-list.jsp");
			dis.forward(request, response);
		} else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
		
		
	}

}
