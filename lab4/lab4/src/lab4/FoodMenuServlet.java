package lab4;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FoodMenuServlet
 */
@WebServlet("/menu")
public class FoodMenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FoodMenuServlet() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setBufferSize(1024);
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1> Wlcome to Food Lovers Restuarant! </h1>");
		out.println("<h2> Menu </h2>");
		out.println("<table>");
		out.println("<tr>" + "<td> Chilli Cheese Friess</td>" +  "<td>  $3.75 </td>"+  "</tr>");
		out.println("<tr>" + "<td> Description: </td>"+ "</tr>");
		out.println("<tr>" + "<td> Smothered in chili and cheddar cheese sauce, these easy chili cheese fries are a complete meal in themselves. </td>"+ "</tr>");
		out.println("</table>");
		out.println("Ingredients:");
		out.println(" <ul>");
		out.println(" <li> 1 (32 ounce) package frozen seasoned french fries.</li>");
		out.println(" <li> 2 tablespoons cornstarch.</li>");
		out.println(" <li> 2 tablespoons water.</li>");
		out.println(" <li> 2 cups low-fat milk.</li>");
		out.println(" <li> 1 tablespoon margarine.</li>");
		out.println(" <li> 8 Slices American cheese, cut into pieces.</li>");
		out.println(" <li> 1 (15 ounce) can chilli without beans.</li>");
		out.println(" </ul>");
		out.println("</body>");
		out.println("</html>");
		
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
