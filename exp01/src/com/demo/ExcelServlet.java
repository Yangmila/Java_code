package com.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ExcelServlet
 */
@WebServlet("/ExcelServlet")
public class ExcelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExcelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/vnd.ms-excel ;charset=utf-8");
        Stu s1=new Stu("201603","YangJie","man",20,"Math");
        Stu s2=new Stu("201602","XiaoHan","woman",19,"Computer");
        PrintWriter wr=response.getWriter();
        wr.println("Sno\t"+"Name\t"+"Age\t"+"Type\t");
        wr.println(s1.getSno()+"\t"+s1.getName()+"\t"+s1.getAge()+"\t"+s1.getType());
        wr.println(s2.getSno()+"\t"+s2.getName()+"\t"+s2.getAge()+"\t"+s2.getType());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
