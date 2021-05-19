package text2;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import text1.BookBean;

/**

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
			BookDAO bookdao = new BookDAO();
			String sql="select * from books where bookid=?";
			PreparedStatement st=BookDAO.con.prepareStatement(sql);
			st.setString(1, bookid);
			ResultSet rs=st.executeQuery();
	        if(rs.next()){
	        	text2.BookBean book=new text2.BookBean();
				book.setBookid(rs.getString("BOOKID"));
				book.setAuthor(rs.getString("AUTHOR"));
				book.setPrice(rs.getFloat("PRICE"));
				book.setPublisher(rs.getString("PUBLISHER"));
				book.setTitle(rs.getString("TITLE"));
	            request.getSession().setAttribute("book", book);
	            RequestDispatcher view = request.getRequestDispatcher("display.jsp");
	            view.forward(request, response);
	        }else{
	            RequestDispatcher view = request.getRequestDispatcher("errorPage.jsp");
	            view.forward(request, response);
	        }
		} catch (SQLException e) {
			
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

