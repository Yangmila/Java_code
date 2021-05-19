package text1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookDAO
 */
@WebServlet("/BookDAO")
public class BookDAO extends HttpServlet {
	private static final long serialVersionUID = 1L;
    Connection con=null;   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookDAO() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/new_schema";
			con=DriverManager.getConnection(url,"root","aini95427");
			}
			catch(ClassNotFoundException e1) {
				System.out.println(e1);
			}
			catch(SQLException e2) {
				System.out.println(e2);
			}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList<BookBean> books=new ArrayList<BookBean>();
		try {
			System.out.println(con);
			String sql="select * from books";
			PreparedStatement st=con.prepareStatement(sql);
			ResultSet rs=st.executeQuery();
			while(rs.next()) {
				BookBean book=new BookBean();
				book.setBookid(rs.getString("BOOKID"));
				book.setAuthor(rs.getString("AUTHOR"));
				book.setPrice(rs.getFloat("PRICE"));
				book.setPublisher(rs.getString("PUBLISHER"));
				book.setTitle(rs.getString("TITLE"));
				books.add(book);
			}
			if(!books.isEmpty()) {
				request.getSession().setAttribute("books", books);
				response.sendRedirect("/exp05/displayBooks.jsp");
			}
			else {
				response.sendRedirect("/exp05/displayBooks.jsp");
			}
		}
		catch(SQLException e) {
			System.out.println(e);
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
