package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/header.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\t<style>\n");
      out.write("\t\t    html {\n");
      out.write("\t\t\t  position: relative;\n");
      out.write("\t\t\t  min-height: 100%;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tbody {\n");
      out.write("\t\t\t  /* Margin bottom by footer height */\n");
      out.write("\t\t\t  margin-bottom: 60px;\n");
      out.write("                          \n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t#corb{\n");
      out.write("\t\t\t\tcolor:#274AFF;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t#cor{\n");
      out.write("\t\t\t\tcolor:#274AFF;\n");
      out.write("                                font-size: 18px;\n");
      out.write("                                font-family: arial,serif,fantasy;\n");
      out.write("                                  \n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t#cor:hover{\n");
      out.write("\t\t\t\tbackground-color: #fff;\n");
      out.write("\t\t\t\tcolor:#042037;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tli{\n");
      out.write("\t\t\t\tmargin:10px;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t.caixa{\n");
      out.write("\t\t\t\tbackground-color:#98CFE8;\n");
      out.write("\t\t\t\tpadding:100px;\n");
      out.write("                                padding-bottom: 40px;\n");
      out.write("\t\t\t\tmargin-bottom:10px;\n");
      out.write("\t\t\t\tborder-radius: 20px;\n");
      out.write("                                \n");
      out.write("\t\t\t}\n");
      out.write("\t\t\ta {\n");
      out.write("\t\t\t\ttext-decoration: none !important;\n");
      out.write("\t\t\t}\n");
      out.write("                        .btn{\n");
      out.write("                             background-color:#202020;\n");
      out.write("                             width:150px;\n");
      out.write("                        }\n");
      out.write("\t\t\t.btn:hover{\n");
      out.write("\t\t\t\tbackground-color: #274AFF;\n");
      out.write("\t\t\t\tcolor: #fff !important;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t#voador{\n");
      out.write("\t\t\t\tbackground-color: #202020;\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\tp > a{\n");
      out.write("\t\t\t\tcolor:#fff;\n");
      out.write("\t\t\t}\n");
      out.write("                        table {\n");
      out.write("                            table-layout: fixed;\n");
      out.write("                            width: 100%;   \n");
      out.write("                        }\n");
      out.write("                        #calc{\n");
      out.write("                            background-color:#ddd;\n");
      out.write("                            border:none;\n");
      out.write("                             color:#3578B0 !important;\n");
      out.write("                        }\n");
      out.write("                        #calc:hover{\n");
      out.write("                            background-color:#3578B0;\n");
      out.write("                            color:#fff !important;\n");
      out.write("                        }\n");
      out.write("\t\t\t@media (max-width:768px){ .footer{position:absolute;width:100%;} }\n");
      out.write("\t\t\t@media (min-width:768px){ .footer{position:absolute;bottom:0;height:60px;width:100%;}}\n");
      out.write("\t</style>\n");
      out.write("\t\n");
      out.write("\t<script>\n");
      out.write("\t</script>\n");
      out.write("</head>\n");
      out.write("<body style=\"background-color:#78C6E8\">\n");
      out.write("\n");
      out.write("\t<div class=\"navbar\" id=\"voador\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div >\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav\">\n");
      out.write("\t\t\t\t\t<li><a href=\"home.jsp\" id=\"cor\">Início</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"fornecedores.jsp\" id=\"cor\">Fornecedores</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"Cliente.jsp\" id=\"cor\"> Clientes</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"#\" id=\"cor\"></a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("         <center>\n");
      out.write("\t\t\t<br><br>\n");
      out.write("\t\t\t<h1 id=\"corb\">Aplicação Web para Cadastro</h1> <br><br>\n");
      out.write("\t\t\t<div class=\"col-md-2\"></div>\n");
      out.write("\t\t\t<div class=\"col-md-8\">\n");
      out.write("\t\t\t\t<div class=\"caixa\">\n");
      out.write("\t\t\t\t\t<h2>Selecione o tipo de cadastro abaixo </h2> <br><br>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-md-4\" style = margin-left:100px;\"><a href=\"fornecedores.jsp\" class=\"btn btn-secondary btn-lg\" role=\"button\">Fornecedores</a> </div>\n");
      out.write("                                            <div class=\"col-md-4\"><a href=\"Cliente.jsp\" class=\"btn btn-secondary btn-lg\" role=\"button\">Clientes</a></div>\n");
      out.write("                                            \n");
      out.write("                                        </div><br> <br>\n");
      out.write("\t\t\t\t\t<h3 style=\"margin-bottom:20px\"> Equipe do Projeto :</h3> <h4>\n");
      out.write("\t\t\t\t\t<ul style=\"list-style:none\">\n");
      out.write("\t\t\t\t\t\t<li> Felipe Carvalho (Cadastro Fornecedores)  </li>\n");
      out.write("                                                <li> Beto Leonardo (Cadastro Cliente) </li>\n");
      out.write("\t\t\t\t\t\t<li> Welton Miguel (Design) </li>\n");
      out.write("                                                \n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</ul> </h4>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</center>\n");
      out.write("\t<!-- CONTEUDO TERMINA AQUI !-->\n");
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
