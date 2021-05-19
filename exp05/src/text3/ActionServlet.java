package text3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ActionServlet
 */
@WebServlet("/ActionServlet")
public class ActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message=null;
		try {
			CustomerBean customer=new CustomerBean(request.getParameter("custName"),request.getParameter("email"),request.getParameter("phone"));
			text3.CustomerDAO dao=new text3.CustomerDAO();
			if(dao.updateCustomer(customer)) {
				message="更改成功";
				request.getSession().setAttribute("message",message);
				response.sendRedirect("updateCustomer.jsp");
			}
			else {
				
				message="更改失败";
				request.getSession().setAttribute("message",message);
				response.sendRedirect("updateCustomer.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message1=null;
		request.setCharacterEncoding("utf-8");
		try {
			
			CustomerBean customer=new CustomerBean(request.getParameter("custName"),request.getParameter("email"),request.getParameter("phone"));
			text3.CustomerDAO dao=new text3.CustomerDAO();
			System.out.println(customer.getCustName());
			if(dao.deleteCustomer(customer)) {
				message1="删除成功";
				request.getSession().setAttribute("message1",message1);
				response.sendRedirect("deleteCustomer.jsp");
			}
			else {
				
				message1="删除失败";
				request.getSession().setAttribute("message1",message1);
				response.sendRedirect("deleteCustomer.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

