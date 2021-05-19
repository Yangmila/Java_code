package text2;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BookInsertServlet
 */
@WebServlet("/BookInsertServlet")
public class BookInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
        try {
        	BookDAO bookdao = new BookDAO();
			String sql="insert into books values(?,?,?,?,?)";
			PreparedStatement st=BookDAO.con.prepareStatement(sql);
			request.setCharacterEncoding("utf-8");
			st.setString(1,request.getParameter("bookid"));
			st.setString(2,request.getParameter("title"));
			st.setString(3,request.getParameter("author"));
			st.setString(4,request.getParameter("publisher"));
			st.setString(5,request.getParameter("price"));
			int insertSuc = st.executeUpdate();
			if(insertSuc!=0){
				RequestDispatcher view = request.getRequestDispatcher("display.jsp");
		        view.forward(request, response);
			}else{
				RequestDispatcher view = request.getRequestDispatcher("errorPage.jsp");
				view.forward(request, response);
			}
		} catch (SQLException  e) {
			// TODO 自动生成的 catch 块
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

