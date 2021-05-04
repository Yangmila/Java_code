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
 * Servlet implementation class GuessNumberServlet
 */
@WebServlet("/GuessNumberServlet")
public class GuessNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GuessNumberServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession s1 = request.getSession();
		PrintWriter out = response.getWriter();
		s1.setAttribute("guessNum",(int)(Math.random()*99 + 1));
		out.print("<html><body>"+"\n");
		out.print("guess 0 - 100");
		out.print("<form method = \"post\" action = GuessNumberServlet>"+"\n");
		out.print("<input type = \"text\" size = 4  name = \"value\">"+"\n");
		out.print("<input type=\"submit\" value=\"guess\">"+"\n");
		out.print("</form></body></html>"+"\n");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UFT-8");
		HttpSession s2 = request.getSession();
		PrintWriter out = response.getWriter();
		int num1 = (int)s2.getAttribute("guessNum");
		String num2 = request.getParameter("value");
		int num = Integer.parseInt(num2);
		if(num > num1) {
			out.println("big");
		}else if(num < num1) {
			out.println("small");
		}else if(num == num1) {
			s2.invalidate();
			out.println("right£¡");
			out.println("<a href=\"GuessNumberServlet\">again</a>");
		}
		out.println("<form action=GuessNumberServlet method=\"post\">");
		out.println("<input type='text' name='value' />");
		out.println("<input type='submit' name='È·¶¨' value='guess' />");
		out.println("</form>");
		out.println("</body></html>");
	}

}
