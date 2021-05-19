package text3;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertCustomerServlet
 */
@WebServlet("/InsertCustomerServlet")
public class InsertCustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public String message=null;
    public InsertCustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		CustomerBean customer=new CustomerBean(request.getParameter("custName"),request.getParameter("email"),request.getParameter("phone"));
		try {
			CustomerDAO dao=new CustomerDAO();
			if(dao.insertCustomer(customer)) {
				message="插入成功";
				request.getSession().setAttribute("message", message);
				response.sendRedirect("insertCustomer.jsp");
			}
			else {
				message="插入失败";
				request.getSession().setAttribute("message", message);
				response.sendRedirect("insertCustomer.jsp");
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

