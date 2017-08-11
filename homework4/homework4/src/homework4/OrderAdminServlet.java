package homework4;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/OrderAdmin" })
public class OrderAdminServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		OrderDAO dao = new OrderDAO();
		request.setAttribute("list", dao.list());
		request.getRequestDispatcher("/WEB-INF/JDBC/AdminOrder-Statuses.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		OrderDAO dao = new OrderDAO();
		List<Order> orders = dao.list();
		
		

		response.sendRedirect(request.getContextPath() + "/Order");
	}

}