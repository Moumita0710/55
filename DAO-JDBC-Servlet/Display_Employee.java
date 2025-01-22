package myPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Display_Employee
 */
@WebServlet("/Display_Employee")
public class Display_Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  DAOEmp dao;
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        List<EmpPojo>emp1=new ArrayList<>();
	        EmpPojo emp2=new EmpPojo();
	        dao=new Emp_Dao_Imp();
	        try {
	        	emp1=dao.getAllData();

	            out.println("<!DOCTYPE html>");
	            out.println("<html>");
	            out.println("<head><title>Employee List</title></head>");
	            out.println("<body>");
	            out.println("<h1>Employee List</h1>");
	            out.println("<a href='http://localhost:8080/MyJSP/Employee%20List/Employee.html'>Add New Employee</a><br><br>");
	            out.println("<table border='1'>");
	            out.println("<tr><th>ID</th><th>Name</th><th>Password</th><th>Email</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");
	        	for(EmpPojo em:emp1) {
	        		out.print("<tr><td>"+em.getId()+"</td><td>"+em.getName()+"</td><td>"+em.getPassword()+"</td><td>"+em.getEmail()
	        		+"</td><td>"+em.getCountry()+"</td><td>"
	        		+"<a href='Edit_Employee?id=" + em.getId() +"'>Edit</a></td><td>"
	        		+"<a href='Delete_Employee?id=" + em.getId() + "'>Delete</a></td></tr>");

//	            while (rs.next()) {
//	                out.println("<tr>");
//	                out.println("<td>" + rs.getString("id") + "</td>");
//	                out.println("<td>" + rs.getString("name") + "</td>");
//	                out.println("<td>" + rs.getString("password") + "</td>");
//	                out.println("<td>" + rs.getString("email") + "</td>");
//	                out.println("<td>" + rs.getString("country") + "</td>");
//	                out.println("<td><a href='Edit_Employee?id=" + rs.getString("ID") + "'>Edit</a></td>");
//	                out.println("<td><a href='Delete_Employee?id=" + rs.getString("ID") + "'>Delete</a></td>");
//	                out.println("</tr>");
	            }
	            out.println("</table>");
	            out.println("</body>");
	            out.println("</html>");
	        } catch (Exception e) {
	            e.printStackTrace(out);
	        }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
