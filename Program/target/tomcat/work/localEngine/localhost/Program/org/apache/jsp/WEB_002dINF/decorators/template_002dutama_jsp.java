package org.apache.jsp.WEB_002dINF.decorators;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class template_002dutama_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute.release();
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <title>Pemrograman 4</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <!-- Le styles -->\n");
      out.write("    <link href=\"");
      out.print( request.getContextPath() );
      out.write("/css/bootstrap.css\" rel=\"stylesheet\">\n");
      out.write("    <style type=\"text/css\">\n");
      out.write("      body {\n");
      out.write("        padding-top: 41px;\n");
      out.write("        padding-bottom: 40px;\n");
      out.write("      }\n");
      out.write("      .sidebar-nav {\n");
      out.write("        padding: 9px 0;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      @media (max-width: 980px) {\n");
      out.write("        /* Enable use of floated navbar text */\n");
      out.write("        .navbar-text.pull-right {\n");
      out.write("          float: none;\n");
      out.write("          padding-left: 5px;\n");
      out.write("          padding-right: 5px;\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("\t\n");
      out.write("\t<!-- Jquery for tweet -->\n");
      out.write("\t<script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/jquery.min.js\"></script>\n");
      out.write("\t\t<script> \n");
      out.write("\t\t\t$(document).ready(function(){\n");
      out.write("\t\t\t\t$(\"#tmb\").hide();\n");
      out.write("\t\t\t\t$(\"#flip\").click(function(){\n");
      out.write("\t\t\t\t$(\"#tmb\").show();\n");
      out.write("\t\t\t\t\t$(\"#flip\").height(100);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t</script>\n");
      out.write("\t\t\n");
      out.write("\t\t<style type=\"text/css\"> \n");
      out.write("\t\t\t#flip {\n");
      out.write("\t\t\t\tresize: none;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t</style>\n");
      out.write("\t\t\n");
      out.write("\t\t\n");
      out.write("\t\t<!-- Jquery for reply -->\n");
      out.write("\t\t<script>\n");
      out.write("\t\t\t$(document).ready(function(){\n");
      out.write("\t\t\t\t$(\"#comment\").hide();\n");
      out.write("\t\t\t\t$(\"#tmbl\").hide();\n");
      out.write("\t\t\t\t$(\"#line\").hide();\n");
      out.write("\t\t\t\t$(\"#show\").click(function(){\n");
      out.write("\t\t\t\t\t$(\"#comment\").toggle();\n");
      out.write("\t\t\t\t\t$(\"#tmbl\").toggle();\n");
      out.write("\t\t\t\t\t$(\"#line\").toggle();\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t\t$(\"#comment\").click(function(){\n");
      out.write("\t\t\t\t\t$(\"#comment\").height(100);\n");
      out.write("\t\t\t\t});\n");
      out.write("\t\t\t});\n");
      out.write("\t\t\t</script>\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("    <!--<link href=\"<= request.getContextPath() >/css/bootstrap-responsive.css\" rel=\"stylesheet\">-->\n");
      out.write("    <link rel=\"icon\" href=\"");
      out.print( request.getContextPath() );
      out.write("/img/icon.ico\">\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body>\n");
      out.write("\n");
      out.write("    <div class=\"navbar navbar-inverse navbar-fixed-top\">\n");
      out.write("      <div class=\"navbar-inner\">\n");
      out.write("        <div class=\"container-fluid\">          \n");
      out.write("          <div class=\"nav-collapse collapse\">\n");
      out.write("\t\t    <p class=\"pull-right\">\n");
      out.write("             <a href=\"#myModal\" role=\"button\" class=\"btn btn-info\" data-toggle=\"modal\" data-toggle=\"tooltip\" title=\"Compose new Tweet\"><i class=\"icon-edit icon-white\"></i></a>\n");
      out.write("            \n");
      out.write("\t\t\t\n");
      out.write("\t\t\t  <div class=\"pull-right\">\n");
      out.write("\t\t\t\t<ul class=\"nav\">\n");
      out.write("\t\t\t\t<li class=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"icon-cog icon-white\"></i>\n");
      out.write("\t\t\t\t\t\t\t<b class=\"caret\"></b>\n");
      out.write("\t\t\t\t\t</a>\n");
      out.write("\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/aplikasi/user/setting\"><img src=\"");
      out.print( request.getContextPath() );
      out.write("/img/user/User.png\"  class=\"img-polaroid\"> Profile and Username &nbsp;</a></li>\n");
      out.write("\t\t\t\t\t<li class=\"divider\"></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/aplikasi/user/setting\"><i class=\"icon-wrench\"></i> Setting</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/aplikasi/user/index\"><i class=\"icon-remove-sign\"></i> Log Out</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </li>\n");
      out.write("</ul></div>\n");
      out.write("            <ul class=\"nav\">\n");
      out.write("              <li class=\"active\"><a href=\"");
      out.print( request.getContextPath() );
      out.write("/aplikasi/user/home\"><i class=\"icon-home\" ></i> Home</a></li>\n");
      out.write("\t\t\t  <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/aplikasi/user/connect\"><i class=\"icon-globe\" ></i> Connect</a></li>\n");
      out.write("              <li><a href=\"");
      out.print( request.getContextPath() );
      out.write("/aplikasi/user/me\"><i class=\"icon-user\" ></i> Me</a>\n");
      out.write("\t\t\t  </li>\n");
      out.write("            </ul>            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("\t\n");
      out.write("\t<!-- Modal for tweet -->\n");
      out.write("\t\t<div id=\"myModal\" class=\"modal hide fade\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("\t\t\t<div class=\"modal-header\">\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">&times;</button>\n");
      out.write("\t\t\t\t\t<h3 id=\"myModalLabel\">What's happening?</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t");
      if (_jspx_meth_spring_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("   \n");
      out.write("     <!--  <div class=\"row-fluid\">\n");
      out.write("        <div class=\"span3\">\n");
      out.write("          <div class=\"well sidebar-nav\">\n");
      out.write("            <ul class=\"nav nav-list\">\n");
      out.write("              <li class=\"nav-header\">Sidebar</li>\n");
      out.write("              <li ><a href=\"#\">Link</a></li>\n");
      out.write("              <li class=\"active\"><a href=\"#\">Link</a></li>\n");
      out.write("              <li><a href=\"#\">Link</a></li>\n");
      out.write("              <li><a href=\"#\">Link</a></li>\n");
      out.write("              <li class=\"nav-header\">Sidebar</li>\n");
      out.write("              <li><a href=\"#\">Link</a></li>\n");
      out.write("              <li><a href=\"#\">Link</a></li>\n");
      out.write("              <li><a href=\"#\">Link</a></li>\n");
      out.write("              <li><a href=\"#\">Link</a></li>\n");
      out.write("              <li><a href=\"#\">Link</a></li>\n");
      out.write("              <li><a href=\"#\">Link</a></li>\n");
      out.write("              <li class=\"nav-header\">Sidebar</li>\n");
      out.write("              <li><a href=\"#\">Link</a></li>\n");
      out.write("              <li><a href=\"#\">Link</a></li>\n");
      out.write("              <li><a href=\"#\">Link</a></li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("        </div>-->\n");
      out.write("\t\t<div >\n");
      out.write("       ");
      if (_jspx_meth_decorator_005fbody_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t   </div>\n");
      out.write("\t   \n");
      out.write("\t <!--<div class=\"container\">\n");
      out.write("    \n");
      out.write("        <div class=\"row-fluid\">\n");
      out.write("  <div class=\"span12\">\n");
      out.write("   <p>\n");
      out.write("    <div class=\"row-fluid\">\n");
      out.write("      <div class=\"span8\">\n");
      out.write("\t  <div class=\"home\">\n");
      out.write("        Welcome to Twitter.<br>\n");
      out.write("Find out whats happening, right now, with the people and organizations you care about.\n");
      out.write("      </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"span4\">");
      if (_jspx_meth_decorator_005fbody_005f1(_jspx_page_context))
        return;
      out.write("</div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("          \n");
      out.write("      </div>    -->\n");
      out.write("\n");
      out.write("\t  \n");
      out.write("\n");
      out.write("    <!-- Le javascript\n");
      out.write("    ================================================== -->\n");
      out.write("    <!-- Placed at the end of the document so the pages load faster -->\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/jquery-1.8.2.min.js\"></script>\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/bootstrap.file-input.js\"></script>\n");
      out.write("    <script src=\"");
      out.print( request.getContextPath() );
      out.write("/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("  </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_spring_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_spring_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_spring_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fform_005f0.setParent(null);
    // /WEB-INF/decorators/template-utama.jsp(121,3) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fform_005f0.setModelAttribute("user");
    int[] _jspx_push_body_count_spring_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fform_005f0 = _jspx_th_spring_005fform_005f0.doStartTag();
      if (_jspx_eval_spring_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t<div class=\"modal-body\">\n");
          out.write("\t\t\t\t<table>\n");
          out.write("\t\t\t\t\t\t<textarea rows=\"4\" name=\"teks\" class=\"span7\" style=\"resize: none;\"></textarea>\n");
          out.write("\t\t\t\t\t\t\n");
          out.write("\t\t\t\t</table>\n");
          out.write("\t\t\t</div>\n");
          out.write("\t\t\t<div class=\"modal-footer\">\n");
          out.write("\t\t\t\t<input type=\"file\">\n");
          out.write("\t\t\t\t<input type=\"submit\" class=\"btn btn-info\" value=\"Tweet\"/>\n");
          out.write("\t\t\t</div>\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_spring_005fform_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_spring_005fform_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fform_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fform_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fform_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute.reuse(_jspx_th_spring_005fform_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_decorator_005fbody_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_decorator_005fbody_005f0 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    _jspx_th_decorator_005fbody_005f0.setPageContext(_jspx_page_context);
    _jspx_th_decorator_005fbody_005f0.setParent(null);
    int _jspx_eval_decorator_005fbody_005f0 = _jspx_th_decorator_005fbody_005f0.doStartTag();
    if (_jspx_th_decorator_005fbody_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.reuse(_jspx_th_decorator_005fbody_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.reuse(_jspx_th_decorator_005fbody_005f0);
    return false;
  }

  private boolean _jspx_meth_decorator_005fbody_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  decorator:body
    com.opensymphony.module.sitemesh.taglib.decorator.BodyTag _jspx_th_decorator_005fbody_005f1 = (com.opensymphony.module.sitemesh.taglib.decorator.BodyTag) _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.get(com.opensymphony.module.sitemesh.taglib.decorator.BodyTag.class);
    _jspx_th_decorator_005fbody_005f1.setPageContext(_jspx_page_context);
    _jspx_th_decorator_005fbody_005f1.setParent(null);
    int _jspx_eval_decorator_005fbody_005f1 = _jspx_th_decorator_005fbody_005f1.doStartTag();
    if (_jspx_th_decorator_005fbody_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.reuse(_jspx_th_decorator_005fbody_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fdecorator_005fbody_005fnobody.reuse(_jspx_th_decorator_005fbody_005f1);
    return false;
  }
}
