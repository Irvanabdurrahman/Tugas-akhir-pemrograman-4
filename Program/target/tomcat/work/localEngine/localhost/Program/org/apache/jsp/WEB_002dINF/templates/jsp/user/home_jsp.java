package org.apache.jsp.WEB_002dINF.templates.jsp.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fotherwise;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fotherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute.release();
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fotherwise.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\t\t<div class=\"container\">\t\t\n");
      out.write("\t\t\t<div class=\"row-fluid\">\n");
      out.write("\t\t\t\t<div class=\"span12\"><p>\n");
      out.write("\t\t\t\t\t<div class=\"row-fluid\">\n");
      out.write("\t\t\t\t\t\t<div class=\"span5\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"profilehome\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"headerhome\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<img src=\"");
      out.print( request.getContextPath() );
      out.write("/img/user/User.png\"  class=\"img-polaroid\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"headerhomename\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"");
      out.print( request.getContextPath() );
      out.write("/aplikasi/user/me\" style=\"color:black;\"><b>FC Barcelona</b></a><br>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<q class=\"headerusername\">View my profile page\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div><hr>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t");
      if (_jspx_meth_spring_005fform_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t<div class=\"people\">\n");
      out.write("\t\t\t\t\t\t\tWho to follow<hr>\n");
      out.write("\t\t\t\t\t\t\tPeople people People people People people People people People people People people\n");
      out.write("\t\t\t\t\t\t\tPeople people People people People people People people People people People people \n");
      out.write("\t\t\t\t\t\t\t</div><br>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t<div class=\"span7\"> \n");
      out.write("\t\t<div class=\"timeline\"> \n");
      out.write("\t\t<p style=\"font-size:20px;\"><b>Tweets</b><hr>\n");
      out.write("\t\t");
      //  c:choose
      org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t");
          //  c:when
          org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
          _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
          // /WEB-INF/templates/jsp/user/home.jsp(46,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
          _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty hasilTweet}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
          int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
          if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("\t\t\t\t<br>\n");
              out.write("\t\t\t\t<div class=\"tweetempty\">\n");
              out.write("\t\t\t\t\t\t<p><img src=\"");
              out.print( request.getContextPath() );
              out.write("/img/empty.png\" width=\"100px\" height=\"100px\"></p>You haven't any Tweets yet.\n");
              out.write("\t\t\t\t</div>\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
          out.write("\n");
          out.write("\t\t\t");
          //  c:otherwise
          org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_005fotherwise_005f0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _005fjspx_005ftagPool_005fc_005fotherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
          _jspx_th_c_005fotherwise_005f0.setPageContext(_jspx_page_context);
          _jspx_th_c_005fotherwise_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
          int _jspx_eval_c_005fotherwise_005f0 = _jspx_th_c_005fotherwise_005f0.doStartTag();
          if (_jspx_eval_c_005fotherwise_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
            do {
              out.write("\n");
              out.write("\t\t\t\t");
              //  c:forEach
              org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
              _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
              _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fotherwise_005f0);
              // /WEB-INF/templates/jsp/user/home.jsp(53,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
              _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/templates/jsp/user/home.jsp(53,4) '${hasilTweet}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${hasilTweet}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
              // /WEB-INF/templates/jsp/user/home.jsp(53,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
              _jspx_th_c_005fforEach_005f0.setVar("t");
              int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
              try {
                int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
                if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
                  do {
                    out.write("\t\n");
                    out.write("\t\t\t\t\t\t<div class=\"headertweet\"><a href=\"#\" style=\"color:black;\"><b>FC Barcelona</b></a>&nbsp;<q class=\"headerusername\">@fc_barcelona</div>\n");
                    out.write("\t\t\t\t\t\t<img src=\"");
                    out.print( request.getContextPath() );
                    out.write("/img/user/User.png\" class=\"ava\">\t\n");
                    out.write("\t\t\t\t\t\t<div class=\"teks\">");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${t.teks}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                    out.write("<br></div>\n");
                    out.write("\t\t\t\t\t\t<div class=\"footertweet\">\n");
                    out.write("\t\t\t\t\t\t\t\tExpand&nbsp;&nbsp;&nbsp;\n");
                    out.write("\t\t\t\t\t\t\t\t<i class=\"icon-share-alt\"></i> <a href=\"#\" id=\"show\" value=\"id_tweet=");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${t.id_tweet}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                    out.write("\">Reply</a>&nbsp;&nbsp;&nbsp;\n");
                    out.write("\t\t\t\t\t\t\t\t<i class=\"icon-trash\"></i> <a href=\"delete?id_tweet=");
                    out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${t.id_tweet}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
                    out.write("\">Delete</a>&nbsp;&nbsp;&nbsp;\n");
                    out.write("\t\t\t\t\t\t\t\t<i class=\"icon-retweet\"></i> Retweet&nbsp;&nbsp;&nbsp;\n");
                    out.write("\t\t\t\t\t\t\t\t<i class=\"icon-star\"></i> Favorite&nbsp;&nbsp;&nbsp;\t\t\t\t\t\t\n");
                    out.write("\t\t\t\t\t\t</div><hr>\n");
                    out.write("\t\t\t\t\t\t<div class=\"footertweet\">\n");
                    out.write("\t\t\t\t\t\t\t\t\t");
                    if (_jspx_meth_spring_005fform_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
                      return;
                    out.write("\n");
                    out.write("\t\t\t\t\t\t</div><hr id=\"line\">\n");
                    out.write("\t\t\t\t");
                    int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
                    if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                      break;
                  } while (true);
                }
                if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
                  return;
                }
              } catch (Throwable _jspx_exception) {
                while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
                  out = _jspx_page_context.popBody();
                _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
              } finally {
                _jspx_th_c_005fforEach_005f0.doFinally();
                _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
              }
              out.write("\n");
              out.write("\t\t\t");
              int evalDoAfterBody = _jspx_th_c_005fotherwise_005f0.doAfterBody();
              if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
                break;
            } while (true);
          }
          if (_jspx_th_c_005fotherwise_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
            _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
            return;
          }
          _005fjspx_005ftagPool_005fc_005fotherwise.reuse(_jspx_th_c_005fotherwise_005f0);
          out.write('\n');
          out.write('	');
          out.write('	');
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      out.write("\n");
      out.write("\t\t</div>\t\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
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

  private boolean _jspx_meth_spring_005fform_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_spring_005fform_005f0 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_spring_005fform_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fform_005f0.setParent(null);
    // /WEB-INF/templates/jsp/user/home.jsp(29,8) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fform_005f0.setModelAttribute("user");
    int[] _jspx_push_body_count_spring_005fform_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fform_005f0 = _jspx_th_spring_005fform_005f0.doStartTag();
      if (_jspx_eval_spring_005fform_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t<textarea rows=\"1\" name=\"teks\" class=\"span12\" placeholder=\"Compose new Tweet...\" id=\"flip\" ></textarea>\n");
          out.write("\t\t\t\t\t\t\t\t\t<p align=\"right\" id=\"tmb\"><input type=\"submit\" class=\"btn btn-info\" value=\"Tweet\"/>\n");
          out.write("\t\t\t\t\t\t\t\t");
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

  private boolean _jspx_meth_spring_005fform_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:form
    org.springframework.web.servlet.tags.form.FormTag _jspx_th_spring_005fform_005f1 = (org.springframework.web.servlet.tags.form.FormTag) _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute.get(org.springframework.web.servlet.tags.form.FormTag.class);
    _jspx_th_spring_005fform_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005fform_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
    // /WEB-INF/templates/jsp/user/home.jsp(65,9) name = modelAttribute type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005fform_005f1.setModelAttribute("user");
    int[] _jspx_push_body_count_spring_005fform_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005fform_005f1 = _jspx_th_spring_005fform_005f1.doStartTag();
      if (_jspx_eval_spring_005fform_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<textarea rows=\"1\" name=\"teks\" class=\"span12\" placeholder=\"Reply to\" id=\"comment\" style=\"resize: none;\"></textarea>\n");
          out.write("\t\t\t\t\t\t\t\t\t\t\t<p align=\"right\" id=\"tmbl\"><input type=\"submit\" class=\"btn btn-info\" value=\"Tweet\"/>\n");
          out.write("\t\t\t\t\t\t\t\t\t");
          int evalDoAfterBody = _jspx_th_spring_005fform_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_spring_005fform_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005fform_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005fform_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005fform_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005fform_0026_005fmodelAttribute.reuse(_jspx_th_spring_005fform_005f1);
    }
    return false;
  }
}
