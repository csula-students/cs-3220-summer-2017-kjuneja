package homework2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class OrderStatusesServlet
 */
@WebServlet("/orders")
public class OrderStatusesServlet extends HttpServlet {
	public void init() {
		
		List<Order> orders = new ArrayList<>();
		orders.add(new Order(orders.size(), "Hamburger", "Kunal",new Date()));
		orders.add(new Order(orders.size(), "Chilli Cheese Fries", "Michael",new Date()));
		getServletContext().setAttribute("orders", orders);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		List<Order> orders = (List<Order>) getServletContext().getAttribute("orders");
		out.println("<head>");
		out.println("<style>body { " +
		"}</style>");
		out.println("</head>");

		out.println("<h1> Food Lovers Resturant </h1>");
		out.println("<table border=1 cellpadding=0 cellspacing=0 width=100%>");
		out.println(
				"<thead>" +
				"<tr>" + 
					"<td> Created </td>"+"<td> Item </td>"+"<td> Customer </td>"+"<td> Status </td>" +"</tr>" + "</thead>");
		for (Order entry: orders) {
			out.println(
						"<tr>" + "<td>"+entry.getCreated() + "</td>" +"<td>" + entry.getItems() + "</td>" + "<td>" +entry.getCustname() + "</td>" + "<td>" +entry.getinprogressStatus()+"</td>"+
 					
					
				"</tr>"
			);
		}
		out.println("</table>");
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
