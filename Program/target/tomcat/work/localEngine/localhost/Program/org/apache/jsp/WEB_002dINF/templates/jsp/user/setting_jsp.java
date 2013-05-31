package org.apache.jsp.WEB_002dINF.templates.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class setting_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("\t\t<div class=\"container\">\t\t\r\n");
      out.write("\t\t<div class=\"setting\">\t\t\r\n");
      out.write("\t\t\t<div class=\"isidaftar\">\t\t\r\n");
      out.write("\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t<div class=\"span12\"><p>\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\"><br>\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Account</h2><div class=\"title\">Change your basic account.</div><hr>\r\n");
      out.write("\t\t\t\t\t\t\t");
      //  spring:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_spring_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_spring_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005fform_005f0.setParent(null);
      // /WEB-INF/templates/jsp/user/setting.jsp(21,7) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fform_005f0.setModelAttribute("user");
      int[] _jspx_push_body_count_spring_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005fform_005f0 = _jspx_th_spring_005fform_005f0.doStartTag();
        if (_jspx_eval_spring_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t\t\t<table width=\"330px\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<tr><td>Username </td><td><input type=\"text\" class=\"span11\"></td></tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<tr><td>Name  </td><td><input type=\"text\" class=\"span11\"></td></tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<tr><td>Email </td><td><input type=\"text\" class=\"span11\"></td></tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<tr><td>Password </td><td><input type=\"password\" class=\"span11\"></td></tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<tr><td valign=\"top\">Avatar </td><td valign=\"top\"><img class=\"img-polaroid\" src=\"");
            out.print( request.getContextPath() );
            out.write("/img/user/User.png\" width=\"70px\" >\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<div class=\"btn-group\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<a class=\"btn dropdown-toggle\" data-toggle=\"dropdown\" href=\"#\">Change photo <span class=\"caret\"></span></a>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Upload photo</a></li>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"#\">Remove</a></li>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t\t<td>&nbsp;</td><td><input type=\"submit\" class=\"btn span11 btn-primary\" value=\"Save\"/></td>\r\n");
            out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t\t\t\t\t</table>\r\n");
            out.write("\t\t\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_spring_005fform_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_spring_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_spring_005fform_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_spring_005fform_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_spring_005fform_005f0.doFinally();
        _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute.reuse(_jspx_th_spring_005fform_005f0);
      }
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
