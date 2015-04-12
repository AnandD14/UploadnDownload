package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>Education</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"style3.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"header_wrapper\">\n");
      out.write("  <div id=\"header\">\n");
      out.write("    <div id=\"site_title\">\n");
      out.write("      <h1><a href=\"adminLogin.jsp\"> <img src=\"images/bim.png\" alt=\"\" /> <span>free css templates</span> </a></h1>\n");
      out.write("    </div>\n");
      out.write("    <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nulla aliquet, ipsum bibendum pretium volutpat, diam magna facilisis ante.</p>\n");
      out.write("  </div>\n");
      out.write("  <!-- end of header -->\n");
      out.write("</div>\n");
      out.write("<!-- end of menu_wrapper -->\n");
      out.write("<div id=\"menu_wrapper\">\n");
      out.write("  <div id=\"menu\">\n");
      out.write("    <ul>\n");
      out.write("      <li><a href=\"#\" class=\"current\">Home</a></li>\n");
      out.write("      \n");
      out.write("      <li><a href=\"#\">Contact</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("  <!-- end of menu -->\n");
      out.write("</div>\n");
      out.write("<div id=\"content_wrapper\">\n");
      out.write("\n");
      out.write(" <div class=\"container\">\n");
      out.write("\n");
      out.write("    <form id=\"signup\">\n");
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("        \n");
      out.write("            <h3>Contact Us</h3>\n");
      out.write("            \n");
      out.write("            <p>Please give a valid information</p>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div class=\"sep\"></div>\n");
      out.write("\n");
      out.write("        <div class=\"inputs\">\n");
      out.write("        \n");
      out.write("            <input type=\"email\" placeholder=\"e-mail\" autofocus />\n");
      out.write("        \n");
      out.write("            <input type=\"password\" placeholder=\"Password\" />\n");
      out.write("            \n");
      out.write("           \n");
      out.write("            <textarea name=\"message\" placeholder=\"Messaga\" width=\"96%\" height=\"100px\"></textarea>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <a id=\"submit\" href=\"#\">SUBMIT</a>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("  \n");
      out.write("</div>\n");
      out.write("<div id=\"footer_wrapper\">\n");
      out.write("  <div id=\"footer\">\n");
      out.write("    <ul class=\"footer_menu\">\n");
      out.write("      <li><a href=\"#\">Home</a></li>\n");
      out.write("      <li><a href=\"#\">Templates</a></li>\n");
      out.write("      <li><a href=\"#\">Flash Files</a></li>\n");
      out.write("      <li><a href=\"#\">Gallery</a></li>\n");
      out.write("      <li><a href=\"#\">Members</a></li>\n");
      out.write("      <li class=\"last_menu\"><a href=\"#\">Contact Us</a></li>\n");
      out.write("    </ul>\n");
      out.write("    Copyright &copy; 2048 <a href=\"#\">Your Company Name</a> | Designed by <a target=\"_blank\" rel=\"nofollow\" href=\"http://www.templatemo.com\">templatemo</a></div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
