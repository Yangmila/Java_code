package first;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookQueryServlet
 */
@WebServlet("/BookQueryServlet")
public class BookQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		String bookid = request.getParameter("bookid");
		try {
			BookDAO1 bookdao = new BookDAO1();
			BookBean book = bookdao.searchBook(bookid);
	        if(book!=null){
	            request.getSession().setAttribute("book", book);
	            RequestDispatcher view = request.getRequestDispatcher("jsp/display.jsp");
	            view.forward(request, response);
	        }else{
	            RequestDispatcher view = request.getRequestDispatcher("jsp/errorPage.jsp");
	            view.forward(request, response);
	        }
		} catch (ClassNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO �Զ����ɵ� catch ��
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
