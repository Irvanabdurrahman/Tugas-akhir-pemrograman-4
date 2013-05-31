package org.apache.jsp.WEB_002dINF.templates.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005finput_0026_005fplaceholder_005fpath_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005finput_0026_005fplaceholder_005fpath_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute.release();
    _005fjspx_005ftagPool_005fspring_005finput_0026_005fplaceholder_005fpath_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("\t\n");
      out.write("    <body>\n");
      out.write("\t\t<div class=\"panel\">\n");
      out.write("\t\t\t<div class=\"row-fluid\">\n");
      out.write("\t\t\t\t<div class=\"span12\"><p>\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\n");
      out.write("\t\t\t\t\t\t<div class=\"span8\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"home\">\n");
      out.write("\t\t\t\t\t\t\t<b>Welcome to Twitter.</b><br>\n");
      out.write("\t\t\t\t\t\t\tFind out what&#8217;s happening, right now, with the people and organizations you care about.\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t<div class=\"span4\"> \n");
      out.write("\t\t<div class=\"signin\"> \n");
      out.write("\t\t\t<form class=\"form-inline\" action=\"");
      out.print( request.getContextPath() );
      out.write("/aplikasi/user/home\">\n");
      out.write("                <input name=\"username\" class=\"span12\" type=\"text\" placeholder=\"Username\"/><p>\n");
      out.write("                <p><input name=\"password\" class=\"span9\" type=\"password\" placeholder=\"Password\"/>\n");
      out.write("                <input type=\"submit\" class=\"btn btn-info\" value=\"Log in\"/>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"signup\"> \n");
      out.write("\t\t\t<p style=\"font-size:17px;\">New to Twitter? Sign up<hr>\n");
      out.write("\t\t\t<div class=\"form-inline\" >\n");
      out.write("\t\t\t");
      //  spring:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_spring_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_spring_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005fform_005f0.setParent(null);
      // /WEB-INF/templates/jsp/user/index.jsp(39,3) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fform_005f0.setModelAttribute("user");
      int[] _jspx_push_body_count_spring_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005fform_005f0 = _jspx_th_spring_005fform_005f0.doStartTag();
        if (_jspx_eval_spring_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("\t\t\t\t\t");
            if (_jspx_meth_spring_005finput_005f0(_jspx_th_spring_005fform_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fform_005f0))
              return;
            //  spring:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_spring_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_spring_005ferrors_005f0.setPageContext(_jspx_page_context);
            _jspx_th_spring_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fform_005f0);
            // /WEB-INF/templates/jsp/user/index.jsp(40,71) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_spring_005ferrors_005f0.setPath("username");
            int[] _jspx_push_body_count_spring_005ferrors_005f0 = new int[] { 0 };
            try {
              int _jspx_eval_spring_005ferrors_005f0 = _jspx_th_spring_005ferrors_005f0.doStartTag();
              if (_jspx_th_spring_005ferrors_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_spring_005ferrors_005f0[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_spring_005ferrors_005f0.doCatch(_jspx_exception);
            } finally {
              _jspx_th_spring_005ferrors_005f0.doFinally();
              _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_spring_005ferrors_005f0);
            }
            out.write("</p>\t\n");
            out.write("                <p>");
            if (_jspx_meth_spring_005finput_005f1(_jspx_th_spring_005fform_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fform_005f0))
              return;
            //  spring:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_spring_005ferrors_005f1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_spring_005ferrors_005f1.setPageContext(_jspx_page_context);
            _jspx_th_spring_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fform_005f0);
            // /WEB-INF/templates/jsp/user/index.jsp(41,83) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_spring_005ferrors_005f1.setPath("nama");
            int[] _jspx_push_body_count_spring_005ferrors_005f1 = new int[] { 0 };
            try {
              int _jspx_eval_spring_005ferrors_005f1 = _jspx_th_spring_005ferrors_005f1.doStartTag();
              if (_jspx_th_spring_005ferrors_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_spring_005ferrors_005f1[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_spring_005ferrors_005f1.doCatch(_jspx_exception);
            } finally {
              _jspx_th_spring_005ferrors_005f1.doFinally();
              _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_spring_005ferrors_005f1);
            }
            out.write("<p>\n");
            out.write("\t\t\t\t<p>");
            if (_jspx_meth_spring_005finput_005f2(_jspx_th_spring_005fform_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fform_005f0))
              return;
            //  spring:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_spring_005ferrors_005f2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_spring_005ferrors_005f2.setPageContext(_jspx_page_context);
            _jspx_th_spring_005ferrors_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fform_005f0);
            // /WEB-INF/templates/jsp/user/index.jsp(42,93) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_spring_005ferrors_005f2.setPath("password");
            int[] _jspx_push_body_count_spring_005ferrors_005f2 = new int[] { 0 };
            try {
              int _jspx_eval_spring_005ferrors_005f2 = _jspx_th_spring_005ferrors_005f2.doStartTag();
              if (_jspx_th_spring_005ferrors_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_spring_005ferrors_005f2[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_spring_005ferrors_005f2.doCatch(_jspx_exception);
            } finally {
              _jspx_th_spring_005ferrors_005f2.doFinally();
              _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fnobody.reuse(_jspx_th_spring_005ferrors_005f2);
            }
            out.write("<p>\n");
            out.write("                <p align=\"right\"><input type=\"submit\" class=\"btn btn-warning\" value=\"Sign up for Twitter\"/>\n");
            out.write("\t\t\t ");
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
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("         <!-- <div class=\"span12\"><div class=\"ftr\">Copyright &copy;  2013 by Sukma Wijaya and Irvan Abdurrahman</div></div> -->\n");
      out.write("      </div>        \n");
      out.write("    </body>\n");
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

  private boolean _jspx_meth_spring_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_spring_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fspring_005finput_0026_005fplaceholder_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_spring_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fform_005f0);
    // /WEB-INF/templates/jsp/user/index.jsp(40,5) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005finput_005f0.setPath("nama");
    // /WEB-INF/templates/jsp/user/index.jsp(40,5) null
    _jspx_th_spring_005finput_005f0.setDynamicAttribute(null, "placeholder", new String("Full name"));
    // /WEB-INF/templates/jsp/user/index.jsp(40,5) null
    _jspx_th_spring_005finput_005f0.setDynamicAttribute(null, "class", new String("span12"));
    int[] _jspx_push_body_count_spring_005finput_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005finput_005f0 = _jspx_th_spring_005finput_005f0.doStartTag();
      if (_jspx_th_spring_005finput_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005finput_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005finput_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005finput_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005finput_0026_005fplaceholder_005fpath_005fclass_005fnobody.reuse(_jspx_th_spring_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_spring_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fspring_005finput_0026_005fplaceholder_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_spring_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fform_005f0);
    // /WEB-INF/templates/jsp/user/index.jsp(41,19) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005finput_005f1.setPath("email");
    // /WEB-INF/templates/jsp/user/index.jsp(41,19) null
    _jspx_th_spring_005finput_005f1.setDynamicAttribute(null, "placeholder", new String("Email"));
    // /WEB-INF/templates/jsp/user/index.jsp(41,19) null
    _jspx_th_spring_005finput_005f1.setDynamicAttribute(null, "class", new String("span12"));
    int[] _jspx_push_body_count_spring_005finput_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005finput_005f1 = _jspx_th_spring_005finput_005f1.doStartTag();
      if (_jspx_th_spring_005finput_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005finput_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005finput_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005finput_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005finput_0026_005fplaceholder_005fpath_005fclass_005fnobody.reuse(_jspx_th_spring_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_spring_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fspring_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_spring_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fform_005f0);
    // /WEB-INF/templates/jsp/user/index.jsp(42,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005finput_005f2.setPath("password");
    // /WEB-INF/templates/jsp/user/index.jsp(42,7) null
    _jspx_th_spring_005finput_005f2.setDynamicAttribute(null, "placeholder", new String("Password"));
    // /WEB-INF/templates/jsp/user/index.jsp(42,7) null
    _jspx_th_spring_005finput_005f2.setDynamicAttribute(null, "class", new String("span12"));
    // /WEB-INF/templates/jsp/user/index.jsp(42,7) null
    _jspx_th_spring_005finput_005f2.setDynamicAttribute(null, "type", new String("password"));
    int[] _jspx_push_body_count_spring_005finput_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005finput_005f2 = _jspx_th_spring_005finput_005f2.doStartTag();
      if (_jspx_th_spring_005finput_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005finput_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005finput_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005finput_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005finput_0026_005ftype_005fplaceholder_005fpath_005fclass_005fnobody.reuse(_jspx_th_spring_005finput_005f2);
    }
    return false;
  }
}
