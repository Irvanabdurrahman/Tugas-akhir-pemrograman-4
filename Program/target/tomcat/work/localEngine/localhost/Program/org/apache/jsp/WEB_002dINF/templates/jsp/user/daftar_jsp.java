package org.apache.jsp.WEB_002dINF.templates.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class daftar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005finput_0026_005fvalue_005fplaceholder_005fpath_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005finput_0026_005fvalue_005ftype_005fplaceholder_005fpath_005fclass_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005finput_0026_005fplaceholder_005fpath_005fclass_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005finput_0026_005fvalue_005fplaceholder_005fpath_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005finput_0026_005fvalue_005ftype_005fplaceholder_005fpath_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fspring_005finput_0026_005fplaceholder_005fpath_005fclass_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute.release();
    _005fjspx_005ftagPool_005fspring_005finput_0026_005fvalue_005fplaceholder_005fpath_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005finput_0026_005fvalue_005ftype_005fplaceholder_005fpath_005fclass_005fnobody.release();
    _005fjspx_005ftagPool_005fspring_005finput_0026_005fplaceholder_005fpath_005fclass_005fnobody.release();
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
      out.write("\t\t<div class=\"daftar\">\t\t\r\n");
      out.write("\t\t\t<div class=\"isidaftar\">\t\t\r\n");
      out.write("\t\t\t<div class=\"row-fluid\">\r\n");
      out.write("\t\t\t\t<div class=\"span12\"><p>\r\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\"><br>\r\n");
      out.write("\t\t\t\t\t\t\t<h2>Join Twitter today.</h2><hr>\r\n");
      out.write("\t\t\t");
      //  spring:form
      org.springframework.web.servlet.tags.form.FormTag _jspx_th_spring_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute.get(org.springframework.web.servlet.tags.form.FormTag.class);
      _jspx_th_spring_005fform_005f0.setPageContext(_jspx_page_context);
      _jspx_th_spring_005fform_005f0.setParent(null);
      // /WEB-INF/templates/jsp/user/daftar.jsp(20,3) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_spring_005fform_005f0.setModelAttribute("user");
      int[] _jspx_push_body_count_spring_005fform_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_spring_005fform_005f0 = _jspx_th_spring_005fform_005f0.doStartTag();
        if (_jspx_eval_spring_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t<c:forEach items=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${daftarUser}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
            out.write("\" varStatus=\"u\">\r\n");
            out.write("\t\t\t<table width=\"800px\">\r\n");
            out.write("\t\t\t\t<tr><input type=\"hidden\"  name=\"avatar\"/>\r\n");
            out.write("\t\t\t\t\t<td><label><strong>Full name</strong></label>\r\n");
            out.write("\t\t\t\t\t\t\t");
            if (_jspx_meth_spring_005finput_005f0(_jspx_th_spring_005fform_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td>");
            //  spring:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_spring_005ferrors_005f0 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_spring_005ferrors_005f0.setPageContext(_jspx_page_context);
            _jspx_th_spring_005ferrors_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fform_005f0);
            // /WEB-INF/templates/jsp/user/daftar.jsp(26,9) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_spring_005ferrors_005f0.setPath("nama");
            // /WEB-INF/templates/jsp/user/daftar.jsp(26,9) null
            _jspx_th_spring_005ferrors_005f0.setDynamicAttribute(null, "class", new String("pesan"));
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
              _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fclass_005fnobody.reuse(_jspx_th_spring_005ferrors_005f0);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t<td><label><strong>Your Email</strong></label>\r\n");
            out.write("\t\t\t\t\t\t\t");
            if (_jspx_meth_spring_005finput_005f1(_jspx_th_spring_005fform_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td>");
            //  spring:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_spring_005ferrors_005f1 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_spring_005ferrors_005f1.setPageContext(_jspx_page_context);
            _jspx_th_spring_005ferrors_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fform_005f0);
            // /WEB-INF/templates/jsp/user/daftar.jsp(31,9) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_spring_005ferrors_005f1.setPath("email");
            // /WEB-INF/templates/jsp/user/daftar.jsp(31,9) null
            _jspx_th_spring_005ferrors_005f1.setDynamicAttribute(null, "class", new String("pesan"));
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
              _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fclass_005fnobody.reuse(_jspx_th_spring_005ferrors_005f1);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t<td><label><strong>Create a password</strong></label>\r\n");
            out.write("\t\t\t\t\t\t\t");
            if (_jspx_meth_spring_005finput_005f2(_jspx_th_spring_005fform_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td>");
            //  spring:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_spring_005ferrors_005f2 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_spring_005ferrors_005f2.setPageContext(_jspx_page_context);
            _jspx_th_spring_005ferrors_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fform_005f0);
            // /WEB-INF/templates/jsp/user/daftar.jsp(36,9) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_spring_005ferrors_005f2.setPath("password");
            // /WEB-INF/templates/jsp/user/daftar.jsp(36,9) null
            _jspx_th_spring_005ferrors_005f2.setDynamicAttribute(null, "class", new String("pesan"));
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
              _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fclass_005fnobody.reuse(_jspx_th_spring_005ferrors_005f2);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t<td><label><strong>Create your username</strong></label>\r\n");
            out.write("\t\t\t\t\t\t\t");
            if (_jspx_meth_spring_005finput_005f3(_jspx_th_spring_005fform_005f0, _jspx_page_context, _jspx_push_body_count_spring_005fform_005f0))
              return;
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t<td>");
            //  spring:errors
            org.springframework.web.servlet.tags.form.ErrorsTag _jspx_th_spring_005ferrors_005f3 = (org.springframework.web.servlet.tags.form.ErrorsTag) _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.ErrorsTag.class);
            _jspx_th_spring_005ferrors_005f3.setPageContext(_jspx_page_context);
            _jspx_th_spring_005ferrors_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fform_005f0);
            // /WEB-INF/templates/jsp/user/daftar.jsp(41,9) name = path type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
            _jspx_th_spring_005ferrors_005f3.setPath("username");
            // /WEB-INF/templates/jsp/user/daftar.jsp(41,9) null
            _jspx_th_spring_005ferrors_005f3.setDynamicAttribute(null, "class", new String("pesan"));
            int[] _jspx_push_body_count_spring_005ferrors_005f3 = new int[] { 0 };
            try {
              int _jspx_eval_spring_005ferrors_005f3 = _jspx_th_spring_005ferrors_005f3.doStartTag();
              if (_jspx_th_spring_005ferrors_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                return;
              }
            } catch (Throwable _jspx_exception) {
              while (_jspx_push_body_count_spring_005ferrors_005f3[0]-- > 0)
                out = _jspx_page_context.popBody();
              _jspx_th_spring_005ferrors_005f3.doCatch(_jspx_exception);
            } finally {
              _jspx_th_spring_005ferrors_005f3.doFinally();
              _005fjspx_005ftagPool_005fspring_005ferrors_0026_005fpath_005fclass_005fnobody.reuse(_jspx_th_spring_005ferrors_005f3);
            }
            out.write("</td>\r\n");
            out.write("\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t<tr><td>&nbsp;</td></tr>\r\n");
            out.write("\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t<td><input type=\"submit\" class=\"btn span11 btn-warning\" value=\"Create my account\"/></td>\r\n");
            out.write("\t\t\t\t</tr>\r\n");
            out.write("\t\t\t</table><br>\r\n");
            out.write("\t\t\t </c:forEach>\r\n");
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
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
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

  private boolean _jspx_meth_spring_005finput_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_spring_005finput_005f0 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fspring_005finput_0026_005fvalue_005fplaceholder_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_spring_005finput_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005finput_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fform_005f0);
    // /WEB-INF/templates/jsp/user/daftar.jsp(25,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005finput_005f0.setPath("nama");
    // /WEB-INF/templates/jsp/user/daftar.jsp(25,7) null
    _jspx_th_spring_005finput_005f0.setDynamicAttribute(null, "placeholder", new String("Full name"));
    // /WEB-INF/templates/jsp/user/daftar.jsp(25,7) null
    _jspx_th_spring_005finput_005f0.setDynamicAttribute(null, "value", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.nama}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
    // /WEB-INF/templates/jsp/user/daftar.jsp(25,7) null
    _jspx_th_spring_005finput_005f0.setDynamicAttribute(null, "class", new String("span11"));
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
      _005fjspx_005ftagPool_005fspring_005finput_0026_005fvalue_005fplaceholder_005fpath_005fclass_005fnobody.reuse(_jspx_th_spring_005finput_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005finput_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_spring_005finput_005f1 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fspring_005finput_0026_005fvalue_005fplaceholder_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_spring_005finput_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005finput_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fform_005f0);
    // /WEB-INF/templates/jsp/user/daftar.jsp(30,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005finput_005f1.setPath("email");
    // /WEB-INF/templates/jsp/user/daftar.jsp(30,7) null
    _jspx_th_spring_005finput_005f1.setDynamicAttribute(null, "placeholder", new String("Email"));
    // /WEB-INF/templates/jsp/user/daftar.jsp(30,7) null
    _jspx_th_spring_005finput_005f1.setDynamicAttribute(null, "class", new String("span11"));
    // /WEB-INF/templates/jsp/user/daftar.jsp(30,7) null
    _jspx_th_spring_005finput_005f1.setDynamicAttribute(null, "value", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.email}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
      _005fjspx_005ftagPool_005fspring_005finput_0026_005fvalue_005fplaceholder_005fpath_005fclass_005fnobody.reuse(_jspx_th_spring_005finput_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005finput_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_spring_005finput_005f2 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fspring_005finput_0026_005fvalue_005ftype_005fplaceholder_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_spring_005finput_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005finput_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fform_005f0);
    // /WEB-INF/templates/jsp/user/daftar.jsp(35,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005finput_005f2.setPath("password");
    // /WEB-INF/templates/jsp/user/daftar.jsp(35,7) null
    _jspx_th_spring_005finput_005f2.setDynamicAttribute(null, "placeholder", new String("Password"));
    // /WEB-INF/templates/jsp/user/daftar.jsp(35,7) null
    _jspx_th_spring_005finput_005f2.setDynamicAttribute(null, "class", new String("span11"));
    // /WEB-INF/templates/jsp/user/daftar.jsp(35,7) null
    _jspx_th_spring_005finput_005f2.setDynamicAttribute(null, "type", new String("password"));
    // /WEB-INF/templates/jsp/user/daftar.jsp(35,7) null
    _jspx_th_spring_005finput_005f2.setDynamicAttribute(null, "value", (java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.password}", java.lang.Object.class, (PageContext)_jspx_page_context, null, false));
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
      _005fjspx_005ftagPool_005fspring_005finput_0026_005fvalue_005ftype_005fplaceholder_005fpath_005fclass_005fnobody.reuse(_jspx_th_spring_005finput_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005finput_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_spring_005fform_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_spring_005fform_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:input
    org.springframework.web.servlet.tags.form.InputTag _jspx_th_spring_005finput_005f3 = (org.springframework.web.servlet.tags.form.InputTag) _005fjspx_005ftagPool_005fspring_005finput_0026_005fplaceholder_005fpath_005fclass_005fnobody.get(org.springframework.web.servlet.tags.form.InputTag.class);
    _jspx_th_spring_005finput_005f3.setPageContext(_jspx_page_context);
    _jspx_th_spring_005finput_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_spring_005fform_005f0);
    // /WEB-INF/templates/jsp/user/daftar.jsp(40,7) name = path type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005finput_005f3.setPath("username");
    // /WEB-INF/templates/jsp/user/daftar.jsp(40,7) null
    _jspx_th_spring_005finput_005f3.setDynamicAttribute(null, "placeholder", new String("Username"));
    // /WEB-INF/templates/jsp/user/daftar.jsp(40,7) null
    _jspx_th_spring_005finput_005f3.setDynamicAttribute(null, "class", new String("span11"));
    int[] _jspx_push_body_count_spring_005finput_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005finput_005f3 = _jspx_th_spring_005finput_005f3.doStartTag();
      if (_jspx_th_spring_005finput_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005finput_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005finput_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005finput_005f3.doFinally();
      _005fjspx_005ftagPool_005fspring_005finput_0026_005fplaceholder_005fpath_005fclass_005fnobody.reuse(_jspx_th_spring_005finput_005f3);
    }
    return false;
  }
}
