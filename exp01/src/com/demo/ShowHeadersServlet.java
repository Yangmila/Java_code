package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowHeadersServlet
 */
@WebServlet("/ShowHeadersServlet")
public class ShowHeadersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowHeadersServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType( "text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		out.print( "<html><head>");
		out.print( "<head><title>HTTP Header</ head></title>");out.print( "<body>");
		out.print( "<table border=\"1\">");
		out.print( "<tr><td>Header√˚≥∆</td>");
		out.print( "<td>Header÷µ</td></tr>");
		Enumeration <String> headers=request.getHeaderNames();
		while(headers.hasMoreElements()){
			String paramName = ( String)headers.nextElement();
			out.print( "<tr><td>" + paramName+"&nbsp&nbsp"+ "</td>\n");
			String paramValue = request.getHeader(paramName);
			out.println("<td> " + paramValue +"&nbsp&nbsp"+ "</td></tr>\n");
		}
		out.print( "</table></body></ html>");	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
