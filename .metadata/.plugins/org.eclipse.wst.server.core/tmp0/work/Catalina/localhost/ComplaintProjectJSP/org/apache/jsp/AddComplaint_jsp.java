/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.71
 * Generated at: 2022-01-07 10:45:47 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.Date;
import java.text.SimpleDateFormat;
import infinite11.ComplaintProjectJSP.Complaint;
import infinite11.ComplaintProjectJSP.ComplaintDAO;
import java.sql.PreparedStatement;
import infinite11.ComplaintProjectJSP.ConnectionHelper;
import java.sql.Connection;

public final class AddComplaint_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("infinite11.ComplaintProjectJSP.ConnectionHelper");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("infinite11.ComplaintProjectJSP.ComplaintDAO");
    _jspx_imports_classes.add("java.text.SimpleDateFormat");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
    _jspx_imports_classes.add("infinite11.ComplaintProjectJSP.Complaint");
    _jspx_imports_classes.add("java.sql.Date");
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
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");

	ComplaintDAO dao = new ComplaintDAO();
	String cId = dao.CreateCid();
	
      out.write("\r\n");
      out.write("<form method=\"get\" action=\"AddComplaint.jsp\">\r\n");
      out.write("	<center>\r\n");
      out.write("		Complaint Id :\r\n");
      out.write("		<input type=\"text\" name=\"ComplaintId\"><br><br>\r\n");
      out.write("		ComplaintType :\r\n");
      out.write("		<input type=\"text\" name=\"ComplaintType\"><br><br>\r\n");
      out.write("		Complaint description :\r\n");
      out.write("		<input type=\"text\" name=\"CDescription\"><br><br>\r\n");
      out.write("		Complaint Date :\r\n");
      out.write("		<input type=\"date\" name=\"ComplaintDate\"><br><br>\r\n");
      out.write("		Severity :\r\n");
      out.write("		<input type=\"text\" name=\"Severity\"><br><br>\r\n");
      out.write("		Status :\r\n");
      out.write("		<input type=\"text\" name=\"Status\"><br><br>\r\n");
      out.write("		<input type=\"submit\" value=\"Add Complaint\">\r\n");
      out.write("	</center>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");

	
	
	if(request.getParameter("ComplaintId")!=null){
		Complaint complaint = new Complaint();
		complaint.setComplaintId("ComplaintId");
		complaint.setComplaintType(request.getParameter("ComplaintType"));
		complaint.setCDescription(request.getParameter("CDescription"));
		complaint.setComplaintDate(Date.valueOf(request.getParameter("ComplaintDate")));
		complaint.setSeverity(request.getParameter("Severity"));
		complaint.setStatus(request.getParameter("Status"));
		dao.AddComplaint(complaint);


      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("ShowAllComplaint.jsp");
        return;
      }
      out.write('\r');
      out.write('\n');

	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
