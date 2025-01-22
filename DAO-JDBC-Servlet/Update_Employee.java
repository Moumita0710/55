package myPack;

import java.io.IOException;
import java.io.PrintWriter;
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
 * Servlet implementation class Update_Employee
 */
@WebServlet("/Update_Employee")
public class Update_Employee extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String id=request.getParameter("id");
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		String email=request.getParameter("email");
		String country=request.getParameter("country");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("after get");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","");
			Statement st=con.createStatement();
		PreparedStatement pstmt = con.prepareStatement("UPDATE empinfo SET name = ?, Password = ?, email = ?, country = ? WHERE id = ?");
        pstmt.setString(1, name);
        pstmt.setString(2, pass);
        pstmt.setString(3, email);
        pstmt.setString(4, country);
        pstmt.setString(5, id);
        int status=pstmt.executeUpdate();
		if(status>0) {
			out.println("Employee added");
		}
		else {
			out.println("Failed to add employee");

		}

        response.sendRedirect("/ServletProject/Display_Emp");
    } catch (Exception e) {
        e.printStackTrace();
        out.println("<h3>Error: " + e.getMessage() + "</h3>");
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
