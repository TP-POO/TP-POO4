package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.fatecpg.db.DatabaseCliente;
import br.com.fatecpg.db.Cliente;

public final class Cliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("                                text-align: center;\n");
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
      out.write("                        \n");
      out.write("                        #t{\n");
      out.write("                             font-size:18px;\n");
      out.write("                        }\n");
      out.write("                        \n");
      out.write("                        .caixa2{\n");
      out.write("\t\t\t\tbackground-color:#98CFE8;\n");
      out.write("\t\t\t\tpadding:100px;\n");
      out.write("                                padding-bottom: 40px;\n");
      out.write("\t\t\t\tmargin-bottom:10px;\n");
      out.write("\t\t\t}\n");
      out.write("                        \n");
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
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");

    if(request.getParameter("Incluir")!=null){
    Cliente c = new Cliente();
    c.setNome(request.getParameter("txtNome"));
    c.setCpf(request.getParameter("txtCpf"));
    c.setRg(request.getParameter("txtRg"));
    c.setEmail(request.getParameter("txtEmail"));
    c.setTelefone(request.getParameter("txtTel"));
    c.setEndereco(request.getParameter("txtEnd"));
    
    DatabaseCliente.getClienteList().add(c);
    
   response.sendRedirect(request.getRequestURI());
        
}
    if(request.getParameter("Excluir")!=null){
    String par = request.getParameter("i");
    int i = Integer.parseInt(par);
    DatabaseCliente.getClienteList().remove(i);
    response.sendRedirect(request.getRequestURI());
    
    }
    
   if(request.getParameter("Alterar")!=null){
    String par = request.getParameter("i");
    int i = Integer.parseInt(par);
    Cliente c = new Cliente();
        c.setNome(request.getParameter("txtNome"));
    c.setCpf(request.getParameter("txtCpf"));
    c.setRg(request.getParameter("txtRg"));
    c.setEmail(request.getParameter("txtEmail"));
    c.setTelefone(request.getParameter("txtTel"));
    c.setEndereco(request.getParameter("txtEnd"));
    
    DatabaseCliente.getClienteList().set(i,c);
    
    } 
    
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <title>Cliente</title>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("         <h2 id=\"corb\">Cadastrar Cliente</h2>\r\n");
      out.write("     <form>\r\n");
      out.write("      <div class=\"container\" >\r\n");
      out.write("       <div class=\"row\">\r\n");
      out.write("        <div class=\"col-md-2\"></div>\r\n");
      out.write("        <div class=\"col-md-8\">\r\n");
      out.write("         <div class=\"form-group\" id=\"t\">    \r\n");
      out.write("       Nome:<input class=\"form-control\" placeholder=\"Digite o nome.\" type=\"text\" name=\"txtNome\" value=\"\"><br>\r\n");
      out.write("       CPF:<input class=\"form-control\" placeholder=\"Digite o número do CPF.\" type=\"text\" name=\"txtCpf\" value=\"\"><br>\r\n");
      out.write("       RG:<input class=\"form-control\" placeholder=\"Digite o número do RG.\"type=\"text\" name=\"txtRg\" value=\"\"><br>\r\n");
      out.write("       E-mail:<input class=\"form-control\" placeholder=\"Digite o Email.\" type=\"text\" name=\"txtEmail\" value=\"\"><br>\r\n");
      out.write("       Telefone:<input class=\"form-control\" placeholder=\"Digite o número de Telefone.\" type=\"text\" name=\"txtTel\" value=\"\"><br>\r\n");
      out.write("       Endereco:<input class=\"form-control\" placeholder=\"Digite o endereço.\" type=\"text\" name=\"txtEnd\" value=\"\"><br>\r\n");
      out.write("        </div>\r\n");
      out.write("            <center><input type=\"submit\" name='Incluir' value='Incluir' class=\"btn btn-primary\"/></center>\r\n");
      out.write("       \r\n");
      out.write("      <!--<input type=\"submit\" name=\"Alterar\" value=\"Alterar\" />\r\n");
      out.write("       <input type=\"submit\" name=\"Excluir\" value=\"Excluir\" /> -->\r\n");
      out.write("       \r\n");
      out.write("        </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        <br/>\r\n");
      out.write("           <table class=\"table table-hover table-bordered caixa2\"> \r\n");
      out.write("            <tr>\r\n");
      out.write("                <th>Nome</th>\r\n");
      out.write("                <th>CPF</th>\r\n");
      out.write("                <th>RG</th>\r\n");
      out.write("                <th>Email</th>\r\n");
      out.write("                <th>Telefone</th>\r\n");
      out.write("                <th>Endereco</th>                    \r\n");
      out.write("                \r\n");
      out.write("            </tr>\r\n");
      out.write("                ");
int i = 0;
      out.write("\r\n");
      out.write("                ");
 for(Cliente c: DatabaseCliente.getClienteList()){ 
      out.write("\r\n");
      out.write("                 <tr>\r\n");
      out.write("                    \r\n");
      out.write("                <td>");
      out.print( c.getNome() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( c.getCpf() );
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( c.getRg());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( c.getEmail());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( c.getTelefone());
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print( c.getEndereco());
      out.write("</td>\r\n");
      out.write("                <td>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                      <input type='hidden' name='i' value='");
      out.print( i );
      out.write("'/>\r\n");
      out.write("                      <input type='submit' name='Excluir' value='Excluir'/>\r\n");
      out.write("                      <input type='submit' name='Alterar' value='Alterar'/>\r\n");
      out.write("                  </form>\r\n");
      out.write("                    \r\n");
      out.write("                </td>\r\n");
      out.write("                \r\n");
      out.write("            </tr>\r\n");
      out.write("            ");
i++; }
      out.write("\r\n");
      out.write("          \r\n");
      out.write("        </table>\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
