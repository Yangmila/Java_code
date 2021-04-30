package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CountServlet
 */
@WebServlet("/CountServlet")
public class CountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		javax.servlet.ServletContext servletContext = this.getServletContext();
		Integer count = (Integer) servletContext.getAttribute("count");
		if( servletContext.getAttribute("count") == null) {
			count = 1;
			servletContext.setAttribute("count", count);
		}else {
			servletContext.setAttribute("count", count+1);
		}
		PrintWriter out =response.getWriter();
		out.print("<!DOCTYPE html>");
		out.print("<html>");		
		out.print( "<head>");		 
		out.print("<meta charset=\"UTF-8\">");		
		out.print("<title>登陆网页次数统计</title>");		  
		out.print("</head>");		
		out.print("<body>");		 
		out.print("<h1>");
		out.print("您是第 "+ servletContext.getAttribute("count")+"位访客");
		out.print("<h1>");
		out.print("</body>");
		out.print("</html>");		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
