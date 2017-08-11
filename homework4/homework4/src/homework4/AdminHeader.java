package homework4;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class AdminHeader extends SimpleTagSupport {
	public void doTag() throws JspException, IOException {
		JspWriter out = getJspContext().getOut();
		out.println("<header>");
		out.println("<h1>Food Lovers Adminstration</h1>");
		
		out.println(
				"<img src='https://resizer.otstatic.com/v2/photos/medium/23689855.jpg' 'width='100' height='70'>");
	
	

		out.println("</header>");
	}
	
}