package homework4;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FoodItemListAdminServlet
 */
@WebServlet("/Food")
public class FoodItemListAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			
		
		FoodItemDAO foods = new FoodItemDAO();
		if (request.getParameter("delete") != null) {
			int id = Integer.parseInt(request.getParameter("delete"));
			foods.delete(id);
			}
		request.setAttribute("list", foods.list());
		
		request.getSession().setAttribute("date", new Date());
		
		 request.getRequestDispatcher("/WEB-INF/JDBC/AdminInventary.jsp")
         .forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect(request.getContextPath() + "/CreateFood");
	}

}
