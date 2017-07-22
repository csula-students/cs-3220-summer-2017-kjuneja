package lab4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
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
@WebServlet("/admin/foods/create1")
public class CreateFoodAdminServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/AdminCreate-food.jsp");
        
	       dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		List<FoodItem> fooditems = (List<FoodItem>) getServletContext().getAttribute("fooditems");
		fooditems.add(new FoodItem(fooditems.size(), request.getParameter("name"), request.getParameter("description"),request.getParameter("imageurl"),request.getParameter("price")));
		request.setAttribute("date", new Date());
		getServletContext().setAttribute("fooditems", fooditems);
		
		
	}

}
