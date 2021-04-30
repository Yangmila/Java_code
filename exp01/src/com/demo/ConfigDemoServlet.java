package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConfigDemoServlet
 */
@WebServlet(
		urlPatterns = { "/config-demo" }, 
		initParams = { 
				@WebInitParam(name = "email", value = "hacker@163.com"), 
				@WebInitParam(name = "telephone", value = "8899123")
		})
public class ConfigDemoServlet extends HttpServlet {
	String servletName = null;
	ServletConfig config = null;
	String email = null;
	String telephone = null;
	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.config = config;
		servletName = config.getServletName();
		email = config.getInitParameter("email");
		telephone = config.getInitParameter("telephone");
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println("<html><body>");
		out.println("<head><title>配置对象</title></head>");
		out.println("Servlet名称："+servletName+"<br>");
		out.println("Email地址："+email+"<br>");	
		out.println("电话："+telephone);
		out.println("</body></html>");
	}

}
