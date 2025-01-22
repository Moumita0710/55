package myPack;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Delete_Employee
 */
@WebServlet("/Delete_Employee")
public class Delete_Employee extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("after get");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
			Statement st=con.createStatement();
			 PreparedStatement pstmt = con.prepareStatement("DELETE FROM empinfo WHERE id = ?");
	            pstmt.setString(1, id);
	            pstmt.executeUpdate();

	            response.sendRedirect("Display_Emp");
	        } catch (Exception e) {
	            e.printStackTrace();
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
