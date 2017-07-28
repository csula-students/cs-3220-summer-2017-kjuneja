package homework3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FoodItemListAdminServlet
 */
@WebServlet("/FoodItemListAdminServlet")
public class FoodItemListAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FoodItemListAdminServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext food = getServletContext();
		
		if(food == null)
		{	
		
		List<FoodItem> fooditems = new ArrayList<>();
		fooditems.add(new FoodItem(fooditems.size(), "Hamburger","Hamburgers are often served with cheese, lettuce, tomato, bacon, onion, pickles, or chiles.","http://assets.epicurious.com/photos/57c5c6d9cf9e9ad43de2d96e/master/pass/the-ultimate-hamburger.jpg", 3.45));
		fooditems.add(new FoodItem(fooditems.size(), "Chiili Cheese Fries","Smothered in chili and cheddar cheese sauce, these easy chili cheese fries are a complete meal in themselves.","http://images.media-allrecipes.com/userphotos/560x315/495404.jpg",3.75));
		getServletContext().setAttribute("fooditems", fooditems);
	}
		List<FoodItem> fooditems = ( List<FoodItem>) getServletContext().getAttribute("fooditems");
		
			
		
		food.setAttribute("fooditems", fooditems);
		request.setAttribute("items", fooditems);
		request.getRequestDispatcher("/AdminInventary.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
