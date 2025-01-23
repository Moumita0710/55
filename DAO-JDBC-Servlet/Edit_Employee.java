package myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Edit_Emp
 */
@WebServlet("/Edit_Emp")
public class Edit_Employee extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOEmp dao;

		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		String id=request.getParameter("id");
		dao=new Emp_Dao_Imp();
		EmpPojo emp=new EmpPojo();
		
			try {
				emp=dao.getId(id);
			} catch (Exception e) {
	            e.printStackTrace();
			}
	           
	                out.println("<!DOCTYPE html>");
	                out.println("<html>");
	                out.println("<head><title>Edit Employee</title></head>");
	                out.println("<body>");
	                out.println("<h1>Edit Employee</h1>");
	                out.println("<form action='Update_Employee' method='post'>");
	                out.println("<input type='hidden' name='id' value='" + emp.getId() + "'>");
	                out.println("Name: <input type='text' name='name' value='" + emp.getName()+ "' required><br>");
	                out.println("Password: <input type='password' name='pass' value='" + emp.getPassword() + "' required><br>");
	                out.println("Email: <input type='email' name='email' value='" + emp.getEmail() + "' required><br>");
	                out.println("Country: <input type='text' name='country' value='" + emp.getCountry() + "' required><br><br>");
	                out.println("<input type='submit' value='Update Employee'>");
	                out.println("</form>");
	                out.println("</body>");
	                out.println("</html>");
			}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
