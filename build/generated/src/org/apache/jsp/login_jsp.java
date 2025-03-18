package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import sellada.util.API;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/index_header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

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
      out.write("<head>\n");
      out.write("    <title>\n");
      out.write("        Login Page\n");
      out.write("    </title>\n");
      out.write("     <link rel=\"stylesheet\" href=\"Stylesheets/login_style.css\">\n");
      out.write("     <link rel=\"stylesheet\" href=\"Stylesheets/index_header_style.css\">\n");
      out.write("     <link rel=\"stylesheet\" href=\"Stylesheets/footer_style.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("   ");
      out.write("\n");
      out.write("<div class=\"box\">\n");
      out.write("    <span id=\"sellada_main\">SellAda</span>\n");
      out.write("    <span id=\"sellada\">Sell online</span>\n");
      out.write("    <span id=\"sellada\">How it works</span>\n");
      out.write("    <span id=\"sellada\">Shipping & Return</span>\n");
      out.write("    <span id=\"sellada\">Grow Bussiness</span>\n");
      out.write("    <span id=\"sellada\">Pricing & Commission</span>\n");
      out.write("    <form action=\"login.jsp\">\n");
      out.write("        <input id=\"button_header\" type=\"submit\" value=\"Login\" >\n");
      out.write("    </form>\n");
      out.write("    <form action=\"signupPage.jsp\">\n");
      out.write("         <input  id=\"button_header\" type=\"submit\" value=\"Sign Up\"  >\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("       \n");
      out.write("       <div class=\"box_one\">\n");
      out.write("        <div class=\"text\">\n");
      out.write("       <h3 id=\"text_one\">Welcome to SELLADA</h3>\n");
      out.write("       <p id=\"text_two\">Login to access your details.\n");
      out.write("           <br><br><br>\n");
      out.write("       </p>\n");
      out.write("       </div>\n");
      out.write("       \n");
      out.write("       <form action=\"SellerLogin\" method=\"post\">\n");
      out.write("           <input id=\"field_one\" type=\"text\" placeholder=\"Enter Email\" name=\"compEmail\"><br><br><br>\n");
      out.write("           <input id=\"field_one\" type=\"password\" placeholder=\"Set Password\" name=\"password\"><br><br><br><br>\n");
      out.write("           \n");
      out.write("           <input id=\"field_two\" type=\"submit\" value=\"Login\" >\n");
      out.write("       </form>\n");
      out.write("       \n");
      out.write("       </div>\n");
      out.write("   \n");
      out.write("   ");
      out.write('\n');

    String apikey=API.getApiKey();

      out.write("\n");
      out.write("    \n");
      out.write("<footer>\n");
      out.write("    <div id=\"apiKey\"><span>");
      out.print(apikey);
      out.write("</span></div>\n");
      out.write("    <div id=\"developedBy\"><span>Developed By Team <strong>hack_winners</strong></span></div>\n");
      out.write("</footer>");
      out.write("\n");
      out.write("</body>");
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
