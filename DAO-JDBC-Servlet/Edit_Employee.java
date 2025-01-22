package myPack;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Edit_Employee
 */
@WebServlet("/Edit_Employee")
public class Edit_Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		String id=request.getParameter("id");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("after get");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
			Statement st=con.createStatement();
            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM emp WHERE ID = ?");
			 pstmt.setString(1, id);
	            ResultSet rs = pstmt.executeQuery();

	            if (rs.next()) {
	                out.println("<!DOCTYPE html>");
	                out.println("<html>");
	                out.println("<head><title>Edit Employee</title></head>");
	                out.println("<body>");
	                out.println("<h1>Edit Employee</h1>");
	                out.println("<form action='UpdateEmployee' method='post'>");
	                out.println("<input type='hidden' name='id' value='" + id + "'>");
	                out.println("Name: <input type='text' name='name' value='" + rs.getString("name") + "' required><br>");
	                out.println("Password: <input type='password' name='pass' value='" + rs.getString("password") + "' required><br>");
	                out.println("Email: <input type='email' name='email' value='" + rs.getString("email") + "' required><br>");
	                out.println("Country: <input type='text' name='country' value='" + rs.getString("country") + "' required><br><br>");
	                out.println("<input type='submit' value='Update Employee'>");
	                out.println("</form>");
	                out.println("</body>");
	                out.println("</html>");
			
		  }
		}catch (Exception e) {
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
