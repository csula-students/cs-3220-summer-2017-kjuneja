/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.15
 * Generated at: 2017-07-20 21:03:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AdminCreate_002dfood_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("file:/Users/kunaljuneja/Downloads/apache-tomcat-8.5.15/lib/standard.jar", Long.valueOf(1098736424000L));
    _jspx_dependants.put("jar:file:/Users/kunaljuneja/Downloads/apache-tomcat-8.5.15/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098736290000L));
    _jspx_dependants.put("jar:file:/Users/kunaljuneja/Downloads/apache-tomcat-8.5.15/lib/standard.jar!/META-INF/fmt.tld", Long.valueOf(1098736290000L));
    _jspx_dependants.put("/WEB-INF/admin-header.tld", Long.valueOf(1500571605000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("         \n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"app.css\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("</head>\n");
      if (_jspx_meth_tag_005fAheader_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<body>\n");
      out.write(" \n");
      out.write("<section> \n");
      out.write("\n");
      out.write("<form name = \"Create New Food\" id = \"NewFood Form\" method=\"post\">  \n");
      out.write("\n");
      out.write("<fieldset> \n");
      out.write("\n");
      out.write("\n");
      out.write("    <h4>Add New Food</h4>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<table>\n");
      out.write("<tr>\n");
      out.write("        \n");
      out.write("<td><label for FoodName> Name </label></td>\n");
      out.write("<td><label for Price>Price </label></td>\n");
      out.write("    \n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><input type=\"text\" name=\"FoodName\" id=\"name\" style=\"width: 300px; height: 25px\" /></td>\n");
      out.write("<td><input type=\"text\" name=\"Price\" id=\"price\"style=\"width: 300px; height: 20px\"/></td>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("\n");
      out.write("<tr>\n");
      out.write("<td><label for ImgLink> Image Link </label></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><input type=\"text\" name=\"ImgLink\" id=\"ImgLink\" style=\"width: 300px; height: 25px\" /> </td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><label for Dsc> Description </label></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><textarea name=\"message\" rows=\"10\" cols=\"30\">\n");
      out.write("Add a Description\n");
      out.write("</textarea></td>\n");
      out.write("</tr>\n");
      out.write("<tr>\n");
      out.write("<td><button id=\"AddFood\"style=\"width: 200px; height: 25px;\" align= \"right;\">      Add Food</button></td>\n");
      out.write(" \n");
      out.write("<a href=\"http://localhost:8080/Lb4/RestaurantAdminServlet\">back to inventory page</a>  \n");
      out.write("</table>\n");
      out.write("</fieldset>\n");
      out.write("</form>\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("\t\t\t<h5> © 2017 Kunal's Place. All rights reserved!!!</h5>\n");
      out.write("\t\t</footer>\n");
      out.write("\t\t \n");
      out.write("\t</body>\n");
      out.write("\t</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tag_005fAheader_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tag:Aheader
    lab4.AdminHeader _jspx_th_tag_005fAheader_005f0 = new lab4.AdminHeader();
    _jsp_getInstanceManager().newInstance(_jspx_th_tag_005fAheader_005f0);
    try {
      _jspx_th_tag_005fAheader_005f0.setJspContext(_jspx_page_context);
      _jspx_th_tag_005fAheader_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tag_005fAheader_005f0);
    }
    return false;
  }
}