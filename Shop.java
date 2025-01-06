package myPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Shop
 */
@WebServlet("/Shop")
public class Shop extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String women[]=request.getParameterValues("women");
		String men[]=request.getParameterValues("men");
	
		
		String add=request.getParameter("add");
		String list=request.getParameter("list");
		PrintWriter out=response.getWriter();
		System.out.println(add);
		if(add!=null) {
			for(String w1:women) {
			Cookie cookie=new Cookie(w1.trim(), w1.trim());
			response.addCookie(cookie);
			}
			response.sendRedirect("shop.html");
		}
		else if(list!=null) {
			Cookie cookie[]=request.getCookies();
			for(Cookie c:cookie) {
				out.println(c.getName()+"\t:\t"+c.getValue()+"<br><br>");
			}
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
