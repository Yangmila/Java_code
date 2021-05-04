package ShowSessionInfo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ShowSessionInfo
 */
@WebServlet("/ShowSessionInfo")
public class ShowSessionInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	public ShowSessionInfo() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		HttpSession session = request.getSession(true);
		Integer accessCount = (Integer)session.getAttribute("accessCount");
		if(accessCount == null) {
			accessCount = new Integer(1);
		}else {
			accessCount = accessCount + 1;
		}
		session.setAttribute("accessCount", accessCount);
		PrintWriter out = response.getWriter();
		out.print("<html><head>");
		out.println("<meta charset=\"UTF-8\">\r\n" + 
				"<title>»á»°¸ú×Ù</title>\r\n" + 
				"</head>\r\n" + 
				"<body><center>");
		out.print("<h1>Welcome Back.</h1>");
		out.print("<h3>Information about your session.</h3>" );
		out.print("<table border = '0'>");
		out.print("<tr bgcolor=\"orange\"><td>Info Type:<td>Value\n");
		out.print("<tr><td>ID:<td>"+session.getId()+"\n");
		out.print("<tr><td>Creation Time:<td>");
		out.print(""+session.getCreationTime()+"\n");
		out.print("<tr><td>Time of last access:<td>");
		out.print(""+session.getLastAccessedTime()+"\n");
		out.print("<tr><td>Access number:<td>");
		out.print(""+accessCount+"\n");
		out.print("</table>");
		out.print("</center></body></html>");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
