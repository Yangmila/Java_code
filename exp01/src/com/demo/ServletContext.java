package com.demo;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class ServletContextDemo
 */
@WebServlet(
		urlPatterns = { "/ServletContext" }
		)
public class ServletContext extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		javax.servlet.ServletContext context=getServletConfig().getServletContext();
		String admin_Email=(String)context.getInitParameter("admin-email");
		String admin_tel=(String)context.getInitParameter("admin-tel");
		context.log(admin_tel);
		context.log(admin_Email);
	}

}
