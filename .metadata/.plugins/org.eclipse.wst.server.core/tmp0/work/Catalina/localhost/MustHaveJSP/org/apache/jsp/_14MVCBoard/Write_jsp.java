/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.74
 * Generated at: 2023-06-01 01:53:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp._14MVCBoard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Write_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1684992276118L));
    _jspx_dependants.put("jar:file:/C:/02Workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MustHaveJSP/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>파일 첨부형 게시판</title>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    function validateForm(form) {  // 필수 항목 입력 확인\n");
      out.write("        if (form.name.value == \"\") {\n");
      out.write("            alert(\"작성자를 입력하세요.\");\n");
      out.write("            form.name.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if (form.title.value == \"\") {\n");
      out.write("            alert(\"제목을 입력하세요.\");\n");
      out.write("            form.title.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if (form.content.value == \"\") {\n");
      out.write("            alert(\"내용을 입력하세요.\");\n");
      out.write("            form.content.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        if (form.pass.value == \"\") {\n");
      out.write("            alert(\"비밀번호를 입력하세요.\");\n");
      out.write("            form.pass.focus();\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<h2>파일 첨부형 게시판 - 글쓰기(Write)</h2>\n");
      out.write("<form name=\"writeFrm\" method=\"post\" enctype=\"multipart/form-data\"\n");
      out.write("      action=\"../mvcboard/write.do\" onsubmit=\"return validateForm(this);\">\n");
      out.write("<table border=\"1\" width=\"90%\">\n");
      out.write("    <tr>\n");
      out.write("        <td>작성자</td>\n");
      out.write("        <td>\n");
      out.write("            <input type=\"text\" name=\"name\" style=\"width:150px;\" />\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>제목</td>\n");
      out.write("        <td>\n");
      out.write("            <input type=\"text\" name=\"title\" style=\"width:90%;\" />\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>내용</td>\n");
      out.write("        <td>\n");
      out.write("            <textarea name=\"content\" style=\"width:90%;height:100px;\"></textarea>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>첨부 파일</td>\n");
      out.write("        <td>\n");
      out.write("            <input type=\"file\" name=\"ofile\" />\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td>비밀번호</td>\n");
      out.write("        <td>\n");
      out.write("            <input type=\"password\" name=\"pass\" style=\"width:100px;\" />\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("        <td colspan=\"2\" align=\"center\">\n");
      out.write("            <button type=\"submit\">작성 완료</button>\n");
      out.write("            <button type=\"reset\">RESET</button>\n");
      out.write("            <button type=\"button\" onclick=\"location.href='../mvcboard/list.do';\">\n");
      out.write("                목록 바로가기\n");
      out.write("            </button>\n");
      out.write("        </td>\n");
      out.write("    </tr>\n");
      out.write("</table>    \n");
      out.write("</form>\n");
      out.write("</body>\n");
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
