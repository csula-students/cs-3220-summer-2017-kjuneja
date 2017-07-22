package homework2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CartServlet
 */
@WebServlet("/shopping-cart")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1>Shopping Cart</h1>");
		out.println("<table border=1 cellpadding=0 cellspacing=0 width=100%>");
		out.println(
				"<thead>" +
				"<tr>" + 
					"<td> Item </td>"+"<td> Price </td>"+"<td> Quantity </td>" + "</thead>" + "</tr>");
		
			out.println(
						"<tr>" + "<td> Hamburger</td>" +"<td> $3.17</td>" + "<td>2</td>" + "<td>"+
 					
					
				"</tr>"
			);
			out.println(
					"<tr>" + "<td> Chilli Fries</td>" +"<td> $4.75</td>" + "<td>1</td>" + "<td>"+
					
				
			"</tr>"
		);
		out.println("</table>");
		out.println("<button> Place your Order </button>");
		
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
