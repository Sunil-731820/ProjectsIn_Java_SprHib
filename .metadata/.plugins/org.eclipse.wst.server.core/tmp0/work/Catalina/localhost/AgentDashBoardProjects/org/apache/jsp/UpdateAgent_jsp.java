/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.71
 * Generated at: 2022-01-11 08:21:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.java.lang.agent.Gender;
import org.glassfish.jersey.client.RequestEntityProcessing;
import com.java.lang.agent.Agent;
import com.java.lang.agent.AgentDAO;

public final class UpdateAgent_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("org.glassfish.jersey.client.RequestEntityProcessing");
    _jspx_imports_classes.add("com.java.lang.agent.AgentDAO");
    _jspx_imports_classes.add("com.java.lang.agent.Gender");
    _jspx_imports_classes.add("com.java.lang.agent.Agent");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	AgentDAO dao = new AgentDAO();
	int agentId = Integer.parseInt(request.getParameter("agentId"));
	Agent agent = dao.searchAgent(agentId);

      out.write("\r\n");
      out.write("\r\n");
      out.write("<form mathod=\"get\" action=\"UpdateAgent.jsp\">\r\n");
      out.write("	<center>\r\n");
      out.write("		Agent Id :\r\n");
      out.write("		<input type=\"number\" name=\"agentId\" readonly=\"readonly\" value=");
      out.print(agentId );
      out.write("><br><br>\r\n");
      out.write("		Name :\r\n");
      out.write("		<input type=\"text\" name=\"Name\" value=");
      out.print(agent.getName() );
      out.write("><br><br>\r\n");
      out.write("		City : \r\n");
      out.write("		<input type=\"text\" name=\"City\" value=");
      out.print(agent.getCity() );
      out.write("><br><br>\r\n");
      out.write("		Gender :\r\n");
      out.write("		<input type=\"text\" name=\"GENDER\" value=");
      out.print(agent.getGender() );
      out.write("><br><br>\r\n");
      out.write("		MaritalStatus :\r\n");
      out.write("		<input type=\"number\" name=\"MaritalStatus\" value=");
      out.print(agent.getMaritalStatus() );
      out.write("><br><br>\r\n");
      out.write("		Premium :\r\n");
      out.write("		<input type=\"number\" name=\"Premium\" value=");
      out.print(agent.getPremium() );
      out.write("><br>\r\n");
      out.write("	<br>\r\n");
      out.write("	<input type=\"submit\" value=\"Update Agent \">\r\n");
      out.write("	</center>\r\n");
      out.write("</form>\r\n");

	if(request.getParameter("agentId")!=null && request.getParameter("Premium")!=null){
		Agent agentUpdate = new Agent();
		agentUpdate.setAgentId(Integer.parseInt(request.getParameter("agentId")));
		agentUpdate.setName(request.getParameter("Name"));
		agentUpdate.setCity(request.getParameter("City"));
		agentUpdate.setGender(Gender.valueOf(request.getParameter("GENDER")));
		agentUpdate.setMaritalStatus(Integer.parseInt(request.getParameter("MaritalStatus")));
		agentUpdate.setPremium(Double.parseDouble(request.getParameter("Premium")));
		dao.updateAgent(agentUpdate);


      out.write('\r');
      out.write('\n');
      if (true) {
        _jspx_page_context.forward("AgentTable.jsp");
        return;
      }
      out.write("\r\n");
      out.write("\r\n");

	}

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
