package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class GenericDemoServlet
 */
@WebServlet("/GenericDemoServlet")
public class GenericDemoServlet extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html);charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body><title>Hello Servlet</title>");
		out.println("<h3 style='color:#00f'>Hello,World!</h3>");
		out.println("今天的日期是："+LocalDate.now()+"<br>");
		out.println("现在的时间是："+LocalTime.now());
		out.println("</body>");
		out.println("</html>");
	}
}
