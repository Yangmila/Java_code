package ShowSessionInfo;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckUserServlet
 */
@WebServlet("/CheckUserServlet")
public class CheckUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public CheckUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		String value1="",value2="";
	
		Cookie cookie=null;
		Cookie [] cookies=request.getCookies();
		if(cookies!=null) {
			for(int i=0;i<cookies.length;i++) {
				cookie=cookies[i];
				if(cookie.getName().equals("username")) {
					value1=cookie.getValue();
				}
				if(cookie.getName().equals("password")) {
					value2=cookie.getValue();
				}
			}
			if(value1.equals("123")&&value2.equals("12345")) {
				String message = "登录成功！"+value1;
				request.getSession().setAttribute("message",message);
				response.sendRedirect("welcome.jsp");
			}
			else {
				response.sendRedirect("login.jsp");
			}
		}
		else {
			response.sendRedirect("login.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=utf-8");
		String username=request.getParameter("username").trim();
		String password=request.getParameter("password").trim();
		String message;
		if(!username.equals("123")||!password.equals("12345")) {
			message="用户名或密码错误，请重试";
			request.getSession().setAttribute("message", message);
			response.sendRedirect("login.jsp");
		}
		else {
			if((request.getParameter("check")!=null)&&(request.getParameter("check").equals("check"))) {
				Cookie nameCookie=new Cookie("username",username);
				Cookie pswdCookie=new Cookie("password",password);
				nameCookie.setMaxAge(60*60);
				pswdCookie.setMaxAge(60*60);
				response.addCookie(nameCookie);
				response.addCookie(pswdCookie);
			}
			message="登录成功";
			request.getSession().setAttribute("message",message);
			response.sendRedirect("welcome.jsp");
		}
	}

}
