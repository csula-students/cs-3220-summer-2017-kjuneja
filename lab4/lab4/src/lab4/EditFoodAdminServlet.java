package lab4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/admin/foods/edit1")
public class EditFoodAdminServlet extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		List<FoodItem> fooditems = (List<FoodItem>) getServletContext().getAttribute("fooditems");
		FoodItem leEntry = null;
		for (FoodItem entry: fooditems) {
			if (entry.getId() == id) {
				leEntry = entry;
			}
		}
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h1>Editing Food Item</h1>");
			out.println("<form method=\"post\">");
			out.println("Food name: <input name='name' type='text' value='" + leEntry.getName() + "'/></br>");
			out.println("Description:<textarea name='description'>" + leEntry.getDescription() + "</textarea></br>");
			out.println("Image URL: <input name='imgurl' type='text' value='" + leEntry.getImageurl() + "'/></br>");
			out.println("Price: <input name='price' type='text' value='" + leEntry.getPrice() + "'/></br>");
			out.println("<button>Edit</button>");
			out.println("</form>");
		}

	

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		List<FoodItem> fooditems = (List<FoodItem>) getServletContext().getAttribute("fooditems");
		FoodItem leEntry = null;
		int index = -1;
		for (int i = 0; i < fooditems.size(); i ++) {
			if (fooditems.get(i).getId() == id) {
				leEntry = fooditems.get(i);
				index = i;
			}
		}
		fooditems.set(index, new FoodItem(
				leEntry.getId(),
				request.getParameter("name"),
				request.getParameter("description"),
				request.getParameter("imgurl"),
				request.getParameter("price")
				
			));
		getServletContext().setAttribute("fooditems", fooditems);
		response.sendRedirect("/cs3220xstu12/admin/foods/");
		


	}

}