package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>Education</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"style2.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
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
      out.write("      <li><a href=\"home.jsp\" class=\"current\">Home</a></li>\n");
      out.write("      \n");
      out.write("      <li><a href=\"contact.jsp\">Contact</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("  <!-- end of menu -->\n");
      out.write("</div>\n");
      out.write("<div id=\"content_wrapper\">\n");
      out.write("<div id=\"registration-form\">\n");
      out.write("\t<div class='fieldset'>\n");
      out.write("    <legend>ADMIN LOGIN!</legend>\n");
      out.write("\t\t<form action=\"UploadnDownload\" method=\"post\" >\n");
      out.write("\t\t\t<div class='row'>\n");
      out.write("\t\t\t\t<label for='firstname'>Admin Name</label>\n");
      out.write("\t\t\t\t<input type=\"text\" placeholder=\"admin name\" name=\"adminame\" id='firstname' data-required=\"true\" data-error-message=\"Your First Name is required\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class='row'>\n");
      out.write("\t\t\t\t<label for=\"email\">Password</label>\n");
      out.write("\t\t\t\t<input type=\"password\" placeholder=\"password\"  name=\"password\" data-required=\"true\" data-type=\"email\" data-error-message=\"Your E-mail is required\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<input type=\"submit\" value=\"Login\" name=\"sub\">\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div id=\"footer_wrapper\">\n");
      out.write("  <div id=\"footer\">\n");
      out.write("    <ul class=\"footer_menu\">\n");
      out.write("      <li><a href=\"home.jsp\">Home</a></li>\n");
      out.write("      <li class=\"last_menu\"><a href=\"contact.jsp\">Contact Us</a></li>\n");
      out.write("    </ul>\n");
      out.write("   </div>\n");
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
