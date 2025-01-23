package myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Update_Employee
 */
@WebServlet("/Update_Employee")
public class Update_Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOEmp dao;
		int status=0;
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		String country=request.getParameter("country");
		
		EmpPojo em=new EmpPojo();
        em.setId(id);
        em.setName(name);
        em.setPassword(pass);
        em.setEmail(email);
        em.setCountry(country);
       dao=new Emp_Dao_Imp();
       try {
			status=dao.Emp_Update(em);
		}catch (Exception e) {
            e.printStackTrace();
            out.println("<h3>Error: " + e.getMessage() + "</h3>");
		}
		if(status>0) {
			System.out.println("Employee updated");
		}
		else {
			System.out.println("Failed to update employee");

		}

        response.sendRedirect("http://localhost:8080/MyJSP/Display_Employee");
    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
