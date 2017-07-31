package lab6;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class CustomerHeader extends SimpleTagSupport {
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.println("<header>");
		out.println("<h1>Food Lovers Restaurant</h1>");
		
		out.println(
				"<img src='https://resizer.otstatic.com/v2/photos/medium/23689855.jpg' 'width='100' height='70'>");
	
		out.print("<nav>");
		out.print("<a href='index.jsp'>Menu</a> | ");
		out.print("<a href='order.jsp'>Order</a> | ");
		out.print("<a href='statuses.jsp'>Statuses</a> ");
		out.print("</nav>");

		out.println("</header>");
	}
	
}