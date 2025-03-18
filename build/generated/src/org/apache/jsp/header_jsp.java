package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sellada.util.SellerDetails;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!--<head>\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"Stylesheets/header_style.css\">\n");
      out.write("</head>-->\n");
      out.write("\n");

//    HttpSession sess=request.getSession();
//    String name=(String)request.getAttribute("compEmail");
//    String pass=(String)request.getAttribute();

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 SellerDetails seller=new SellerDetails();
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"box\">\n");
      out.write("    <!--<span id=\"icon_one\"> <i  class=\"fa-solid fa-circle-arrow-left\"  style=\"color: #a816c0;\"></i></span>-->\n");
      out.write("    <a href=\"yourProducts.jsp\"><span id=\"icon_two\"><i  class=\"fa-sharp fa-solid fa-house\" style=\"color: #a816c0;\"></i></span></a>\n");
      out.write("    <input id=\"text_field\" type=\"text\" placeholder=\"Look for order by ID or product name\" />\n");
      out.write("    <span id=\"sellerName\">Welcome,<strong>");
      out.print( SellerDetails.getSellerName() );
      out.write("</strong></span>\n");
      out.write("    <span id=\"icon_three\"><i class=\"fa-solid fa-user\" style=\"color: #a816c0;\" ></i></span>\n");
      out.write("</div>");
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
