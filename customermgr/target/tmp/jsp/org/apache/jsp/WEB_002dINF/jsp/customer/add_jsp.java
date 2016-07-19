package org.apache.jsp.WEB_002dINF.jsp.customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/static/css/application.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/customer/add\" method=\"post\">\r\n");
      out.write("\t<table width=\"100%\" border=\"1\" cellpadding=\"0\" cellspacing=\"1\" class=\"tableLine\">\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=4 align=center class=\"tableLineBg\">客户新增</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>客户编号</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"customerId\" class=\"input\"></td>\r\n");
      out.write("\t\t\t<td>客户密码</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"pwd\" class=\"input\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td>显示名称</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"showName\" class=\"input\"></td>\t\t\t\r\n");
      out.write("\t\t\t<td>真实姓名</td>\r\n");
      out.write("\t\t\t<td><input type=\"text\" name=\"trueName\" class=\"input\"></td>\r\n");
      out.write("\t\t</tr>\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t<td colspan=4 align=center><input type=\"submit\" value=\"新增\" class=\"button\"></td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t</table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
