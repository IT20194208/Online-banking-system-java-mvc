package customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DeleteCustomerServlet")
public class DeleteCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String id = request.getParameter("cusid");
		boolean isTrue;
		
		isTrue = CustomerDBUtil.deleteCustomer(id);
		
		if (isTrue == true) {
			//RequestDispatcher dispatcher = request.getRequestDispatcher("customerinsert.jsp");
			//dispatcher.forward(request, response);
			out.println("<script type='text/javascript'>");
			out.println("alert('Your account delete completed!');");
			out.println("location='user_login.jsp'");
			out.println("</script>");
		}
		else {
			
			List<Customer> cusDetails = CustomerDBUtil.getCustomerDetails(id);
			request.setAttribute("cusDetails", cusDetails);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("useraccount.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
	}

}
