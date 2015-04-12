package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.dao.UploadnDownloaddao;
import com.model.*;
import java.util.List;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\n");
      out.write("<head>\n");
      out.write("<title>Education</title>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<link href=\"style.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("<link href=\"style1.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div id=\"header_wrapper\">\n");
      out.write("  <div id=\"header\">\n");
      out.write("    <div id=\"site_title\">\n");
      out.write("      <h1><a href=\"adminLogin.jsp\"> <img src=\"images/bim.png\" alt=\"\" /> <span>free css templates</span> </a></h1>\n");
      out.write("    </div>\n");
      out.write("    <p>This is developed solely for BIM students to access note from where they want</p>\n");
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
      out.write("<div class=\"table-title\">\n");
      out.write("<h3>1st SEMESTER</h3>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("<table class=\"table-fill\">\n");
      out.write("<thead>\n");
      out.write("<tr>\n");
      out.write("<th class=\"text-left\">SN</th>\n");
      out.write("<th class=\"text-left\">FILENAME</th>\n");
      out.write("<th class=\"text-left\">DOWNLOAD</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("     ");
 
     UploadnDownloaddao upd1=new UploadnDownloaddao();
   List<BIM1stSem> l1=upd1.selectBIM1stSem();
   int i1=0;
    for(BIM1stSem b1:l1){
    
      out.write("\n");
      out.write("<tbody class=\"table-hover\">\n");
      out.write("<tr>\n");
      out.write("<td class=\"text-left\">");
      out.print(++i1 );
      out.write(" </td>\n");
      out.write("<td class=\"text-left\">");
      out.print( b1.getFilename() );
      out.write("</td>\n");
      out.write("<td class=\"text-left\"><a href=\"UploadnDownload?down=download&filename=");
      out.print( b1.getFilename() );
      out.write("\" >Download</a></td>\n");
      out.write("</tr>\n");

    }

      out.write("\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("  <div class=\"table-title\">\n");
      out.write("<h3>2nd SEMESTER</h3>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("<table class=\"table-fill\">\n");
      out.write("<thead>\n");
      out.write("<tr>\n");
      out.write("<th class=\"text-left\">SN</th>\n");
      out.write("<th class=\"text-left\">FILENAME</th>\n");
      out.write("<th class=\"text-left\">DOWNLOAD</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("     ");
 
     UploadnDownloaddao upd2=new UploadnDownloaddao();
   List<BIM2ndSem> l2=upd2.selectBIM2ndSem();
   int i2=0;
    for(BIM2ndSem b2:l2){
    
      out.write("\n");
      out.write("<tbody class=\"table-hover\">\n");
      out.write("<tr>\n");
      out.write("<td class=\"text-left\">");
      out.print(++i2 );
      out.write(" </td>\n");
      out.write("<td class=\"text-left\">");
      out.print( b2.getFilename() );
      out.write("</td>\n");
      out.write("<td class=\"text-left\"><a href=\"UploadnDownload?down=download&filename=");
      out.print( b2.getFilename() );
      out.write("\" >Download</a></td>\n");
      out.write("</tr>\n");

    }

      out.write("\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("    <div class=\"table-title\">\n");
      out.write("<h3>3rd SEMESTER</h3>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("<table class=\"table-fill\">\n");
      out.write("<thead>\n");
      out.write("<tr>\n");
      out.write("<th class=\"text-left\">SN</th>\n");
      out.write("<th class=\"text-left\">FILENAME</th>\n");
      out.write("<th class=\"text-left\">DOWNLOAD</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("     ");
 
     UploadnDownloaddao upd3=new UploadnDownloaddao();
   List<BIM3rdSem> l3=upd3.selectBIM3rdSem();
   int i3=0;
    for(BIM3rdSem b3:l3){
    
      out.write("\n");
      out.write("<tbody class=\"table-hover\">\n");
      out.write("<tr>\n");
      out.write("<td class=\"text-left\">");
      out.print(++i3 );
      out.write(" </td>\n");
      out.write("<td class=\"text-left\">");
      out.print( b3.getFilename() );
      out.write("</td>\n");
      out.write("<td class=\"text-left\"><a href=\"UploadnDownload?down=download&filename=");
      out.print( b3.getFilename() );
      out.write("\" >Download</a></td>\n");
      out.write("</tr>\n");

    }

      out.write("\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("    <div class=\"table-title\">\n");
      out.write("<h3>4th SEMESTER</h3>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("<table class=\"table-fill\">\n");
      out.write("<thead>\n");
      out.write("<tr>\n");
      out.write("<th class=\"text-left\">SN</th>\n");
      out.write("<th class=\"text-left\">FILENAME</th>\n");
      out.write("<th class=\"text-left\">DOWNLOAD</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("     ");
 
     UploadnDownloaddao upd4=new UploadnDownloaddao();
   List<BIM4thSem> l4=upd4.selectBIM4thSem();
   int i4=0;
    for(BIM4thSem b4:l4){
    
      out.write("\n");
      out.write("<tbody class=\"table-hover\">\n");
      out.write("<tr>\n");
      out.write("<td class=\"text-left\">");
      out.print(++i4 );
      out.write(" </td>\n");
      out.write("<td class=\"text-left\">");
      out.print( b4.getFilename() );
      out.write("</td>\n");
      out.write("<td class=\"text-left\"><a href=\"UploadnDownload?down=download&filename=");
      out.print( b4.getFilename() );
      out.write("\" >Download</a></td>\n");
      out.write("</tr>\n");

    }

      out.write("\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("   <div class=\"table-title\">\n");
      out.write("<h3>5th SEMESTER</h3>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("<table class=\"table-fill\">\n");
      out.write("<thead>\n");
      out.write("<tr>\n");
      out.write("<th class=\"text-left\">SN</th>\n");
      out.write("<th class=\"text-left\">FILENAME</th>\n");
      out.write("<th class=\"text-left\">DOWNLOAD</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("     ");
 
     UploadnDownloaddao upd5=new UploadnDownloaddao();
   List<BIM5thSem> l5=upd5.selectBIM5thSem();
   int i5=0;
    for(BIM5thSem b5:l5){
    
      out.write("\n");
      out.write("<tbody class=\"table-hover\">\n");
      out.write("<tr>\n");
      out.write("<td class=\"text-left\">");
      out.print(++i5 );
      out.write(" </td>\n");
      out.write("<td class=\"text-left\">");
      out.print( b5.getFilename() );
      out.write("</td>\n");
      out.write("<td class=\"text-left\"><a href=\"UploadnDownload?down=download&filename=");
      out.print( b5.getFilename() );
      out.write("\" >Download</a></td>\n");
      out.write("</tr>\n");

    }

      out.write("\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("  <div class=\"table-title\">\n");
      out.write("<h3>6th SEMESTER</h3>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("<table class=\"table-fill\">\n");
      out.write("<thead>\n");
      out.write("<tr>\n");
      out.write("<th class=\"text-left\">SN</th>\n");
      out.write("<th class=\"text-left\">FILENAME</th>\n");
      out.write("<th class=\"text-left\">DOWNLOAD</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("     ");
 
     UploadnDownloaddao upd6=new UploadnDownloaddao();
   List<BIM6thSem> l6=upd6.selectBIM6thSem();
   int i6=0;
    for(BIM6thSem b6:l6){
    
      out.write("\n");
      out.write("<tbody class=\"table-hover\">\n");
      out.write("<tr>\n");
      out.write("<td class=\"text-left\">");
      out.print(++i6 );
      out.write(" </td>\n");
      out.write("<td class=\"text-left\">");
      out.print( b6.getFilename() );
      out.write("</td>\n");
      out.write("<td class=\"text-left\"><a href=\"UploadnDownload?down=download&filename=");
      out.print( b6.getFilename() );
      out.write("\" >Download</a></td>\n");
      out.write("</tr>\n");

    }

      out.write("\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write(" <div class=\"table-title\">\n");
      out.write("<h3>7th SEMESTER</h3>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("<table class=\"table-fill\">\n");
      out.write("<thead>\n");
      out.write("<tr>\n");
      out.write("<th class=\"text-left\">SN</th>\n");
      out.write("<th class=\"text-left\">FILENAME</th>\n");
      out.write("<th class=\"text-left\">DOWNLOAD</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("     ");
 
     UploadnDownloaddao upd7=new UploadnDownloaddao();
   List<BIM7thSem> l7=upd7.selectBIM7thSem();
   int i7=0;
    for(BIM7thSem b7:l7){
    
      out.write("\n");
      out.write("<tbody class=\"table-hover\">\n");
      out.write("<tr>\n");
      out.write("<td class=\"text-left\">");
      out.print(++i7 );
      out.write(" </td>\n");
      out.write("<td class=\"text-left\">");
      out.print( b7.getFilename() );
      out.write("</td>\n");
      out.write("<td class=\"text-left\"><a href=\"UploadnDownload?down=download&filename=");
      out.print( b7.getFilename() );
      out.write("\" >Download</a></td>\n");
      out.write("</tr>\n");

    }

      out.write("\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("  <div class=\"table-title\">\n");
      out.write("<h3>8th SEMESTER</h3>\n");
      out.write("</div>\n");
      out.write("   \n");
      out.write("<table class=\"table-fill\">\n");
      out.write("<thead>\n");
      out.write("<tr>\n");
      out.write("<th class=\"text-left\">SN</th>\n");
      out.write("<th class=\"text-left\">FILENAME</th>\n");
      out.write("<th class=\"text-left\">DOWNLOAD</th>\n");
      out.write("</tr>\n");
      out.write("</thead>\n");
      out.write("     ");
 
     UploadnDownloaddao upd8=new UploadnDownloaddao();
   List<BIM8thSem> l8=upd8.selectBIM8thSem();
   int i8=0;
    for(BIM8thSem b8:l8){
    
      out.write("\n");
      out.write("<tbody class=\"table-hover\">\n");
      out.write("<tr>\n");
      out.write("<td class=\"text-left\">");
      out.print(++i8 );
      out.write(" </td>\n");
      out.write("<td class=\"text-left\">");
      out.print( b8.getFilename() );
      out.write("</td>\n");
      out.write("<td class=\"text-left\"><a href=\"UploadnDownload?down=download&filename=");
      out.print( b8.getFilename() );
      out.write("\" >Download</a></td>\n");
      out.write("</tr>\n");

    }

      out.write("\n");
      out.write("</tbody>\n");
      out.write("</table>\n");
      out.write("      \n");
      out.write("</div>\n");
      out.write("<div id=\"footer_wrapper\">\n");
      out.write("  <div id=\"footer\">\n");
      out.write("    <ul class=\"footer_menu\">\n");
      out.write("      <li><a href=\"home.jsp\">Home</a></li>     \n");
      out.write("      <li class=\"last_menu\"><a href=\"contact.jsp\">Contact Us</a></li>\n");
      out.write("    </ul>\n");
      out.write("    </div>\n");
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
