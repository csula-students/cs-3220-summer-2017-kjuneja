package homework3;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateFoodAdminServlet
 */
@WebServlet("/CreateFoodAdminServlet")
public class CreateFoodAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateFoodAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/AdminCreate-food.jsp");
        
	       dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<FoodItem> fooditems = (List<FoodItem>) getServletContext().getAttribute("fooditems");
		fooditems.add(new FoodItem(fooditems.size(), request.getParameter("name"), request.getParameter("description"),request.getParameter("imageurl"),Double.parseDouble(request.getParameter("price"))));
		getServletContext().setAttribute("fooditems", fooditems);
		request.setAttribute("items", fooditems);
	
	}

}
