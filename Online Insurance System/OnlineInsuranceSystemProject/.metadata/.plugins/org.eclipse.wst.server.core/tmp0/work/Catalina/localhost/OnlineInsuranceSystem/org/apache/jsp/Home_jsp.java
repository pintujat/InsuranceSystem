/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.64
 * Generated at: 2017-04-19 03:50:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<title>Insurance System</title>\r\n");
      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("body{\r\n");
      out.write("  padding:0;\r\n");
      out.write("  margin:0;\r\n");
      out.write("}\r\n");
      out.write(".vid-container{\r\n");
      out.write("  position:relative;\r\n");
      out.write("  height:100vh;\r\n");
      out.write("  overflow:hidden;\r\n");
      out.write("}\r\n");
      out.write(".bgvid.back {\r\n");
      out.write("  position: fixed; right: 0; bottom: 0;\r\n");
      out.write("  min-width: 100%; min-height: 100%;\r\n");
      out.write("  width: auto; height: auto; z-index: -100;\r\n");
      out.write("}\r\n");
      out.write(".inner {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("}\r\n");
      out.write(".inner-container{\r\n");
      out.write("  width:400px;\r\n");
      out.write("  height:400px;\r\n");
      out.write("  position:absolute;\r\n");
      out.write("  top:calc(50vh - 200px);\r\n");
      out.write("  left:calc(50vw - 200px);\r\n");
      out.write("  overflow:hidden;\r\n");
      out.write("}\r\n");
      out.write(".bgvid.inner{\r\n");
      out.write("  top:calc(-50vh + 200px);\r\n");
      out.write("  left:calc(-50vw + 200px);\r\n");
      out.write("  filter: url(\"data:image/svg+xml;utf9,<svg%20version='1.1'%20xmlns='http://www.w3.org/2000/svg'><filter%20id='blur'><feGaussianBlur%20stdDeviation='10'%20/></filter></svg>#blur\");\r\n");
      out.write("  -webkit-filter:blur(10px);\r\n");
      out.write("  -ms-filter: blur(10px);\r\n");
      out.write("  -o-filter: blur(10px);\r\n");
      out.write("  filter:blur(10px);\r\n");
      out.write("}\r\n");
      out.write(".box{\r\n");
      out.write("  position:absolute;\r\n");
      out.write("  height:100%;\r\n");
      out.write("  width:100%;\r\n");
      out.write("  font-family:Helvetica;\r\n");
      out.write("  color:#fff;\r\n");
      out.write("  background:rgba(0,0,0,0.13);\r\n");
      out.write("  padding:30px 0px;\r\n");
      out.write("}\r\n");
      out.write(".box h1{\r\n");
      out.write("  text-align:center;\r\n");
      out.write("  margin:30px 0;\r\n");
      out.write("  font-size:30px;\r\n");
      out.write("}\r\n");
      out.write(".box input{\r\n");
      out.write("  display:block;\r\n");
      out.write("  width:300px;\r\n");
      out.write("  margin:20px auto;\r\n");
      out.write("  padding:15px;\r\n");
      out.write("  background:rgba(0,0,0,0.2);\r\n");
      out.write("  color:#fff;\r\n");
      out.write("  border:0;\r\n");
      out.write("}\r\n");
      out.write(".box input:focus,.box input:active,.box button:focus,.box button:active{\r\n");
      out.write("  outline:none;\r\n");
      out.write("}\r\n");
      out.write(".box button{\r\n");
      out.write("  background:#742ECC;\r\n");
      out.write("  border:0;\r\n");
      out.write("  color:#fff;\r\n");
      out.write("  padding:10px;\r\n");
      out.write("  font-size:20px;\r\n");
      out.write("  width:330px;\r\n");
      out.write("  margin:20px auto;\r\n");
      out.write("  display:block;\r\n");
      out.write("  cursor:pointer;\r\n");
      out.write("}\r\n");
      out.write(".box button:active{\r\n");
      out.write("  background:#27ae60;\r\n");
      out.write("}\r\n");
      out.write(".box p{\r\n");
      out.write("  font-size:14px;\r\n");
      out.write("  text-align:center;\r\n");
      out.write("}\r\n");
      out.write(".box p span{\r\n");
      out.write("  cursor:pointer;\r\n");
      out.write("  color:#666;\r\n");
      out.write("}\r\n");
      out.write(".dropbtn {\r\n");
      out.write("\r\n");
      out.write("    background-color: white;\r\n");
      out.write("    color: black;\r\n");
      out.write("    padding: 16px;\r\n");
      out.write("    font-size: 16px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("}\r\n");
      out.write(".dropdown {\r\n");
      out.write("    position: relative;\r\n");
      out.write("    display: inline-block;\r\n");
      out.write("}\r\n");
      out.write(".dropdown-content {\r\n");
      out.write("    display: none;\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    background-color: pink;\r\n");
      out.write("    min-width: 160px;\r\n");
      out.write("    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);\r\n");
      out.write("    z-index: 1;\r\n");
      out.write("}\r\n");
      out.write(".dropdown-content a {\r\n");
      out.write("    color: black;\r\n");
      out.write("    padding: 12px 16px;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write(".dropdown-content a:hover {background-color: white}\r\n");
      out.write(".dropdown:hover .dropdown-content {\r\n");
      out.write("\t background-color: white;\r\n");
      out.write("    display: block;\r\n");
      out.write("}\r\n");
      out.write(".dropdown:hover .dropbtn {\r\n");
      out.write("    background-color: white;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.w3schools.com/w3css/4/w3.css\">\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"w3-top\">\r\n");
      out.write("\r\n");
      out.write("  <div class=\"dropbtn\">\r\n");
      out.write("    <a href=\"Home.jsp\" class=\"w3-bar-item w3-button\"><b>Insurance</b> System</a>\r\n");
      out.write("    <a href=\"LoginPage.jsp\" id=\"loginform\" class=\"w3-bar-item w3-button\">Login</a>\r\n");
      out.write("    <a href=\"AgentRegistration.jsp\" class=\"w3-bar-item w3-button\">Register</a>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("\r\n");
      out.write("   <!-- Header -->\r\n");
      out.write("<header class=\"w3-display-container w3-content w3-wide\" style=\"max-width:1500px;\" id=\"home\">\r\n");
      out.write("  <img class=\"w3-image\" src=\"D:\\New folder\\11.jpg\" alt=\"INSURANCE\" width=\"1500\" height=\"800\">\r\n");
      out.write("  <div class=\"w3-display-middle w3-margin-top w3-center\">\r\n");
      out.write("    <h1 class=\"w3-xxlarge w3-text-white\"><span class=\"w3-padding w3-black w3-opacity-min\"><b>Insurance</b></span> <span class=\"w3-hide-small w3-text-light-grey\">System</span></h1>\r\n");
      out.write("  </div>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("     \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- Footer -->\r\n");
      out.write("<footer class=\"w3-center w3-black w3-padding-16\">\r\n");
      out.write("  <p>We Care for you</p>\r\n");
      out.write("</footer>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
}
