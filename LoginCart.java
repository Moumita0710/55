package myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginCart
 */
@WebServlet("/LoginCart")
public class LoginCart extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String user=request.getParameter("username");
		String pass=request.getParameter("pass");
		//request.getRequestDispatcher("/link.html").include(request, response);
		if(pass.equals("123")) {
			out.println("Welcome "+user);
			RequestDispatcher req=request.getRequestDispatcher("/Shopping Cart/shop.html");
			req.forward(request, response);
		}
		else {
			out.println("Password is Wrong.....<br>");
			RequestDispatcher req=request.getRequestDispatcher("loginCart.html");
			req.include(request, response);
			
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
