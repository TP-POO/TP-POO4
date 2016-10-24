package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.fatecpg.db.Database;
import br.com.fatecpg.db.Pessoa;

public final class contatos_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

if(request.getParameter("Incluir")!=null){    
    Pessoa p = new Pessoa();
    p.setNome(request.getParameter("nome"));
    p.setRazaosocial(request.getParameter("social"));
    p.setCnpj(request.getParameter("cnpj"));
    p.setEmail(request.getParameter("mail"));
    p.setTelefone(request.getParameter("tel"));
    p.setEndereço(request.getParameter("endereço"));
    Database.getPessoasList().add(p);
    response.sendRedirect(request.getRequestURI());  
}
if(request.getParameter("Excluir")!=null){  
    String par = request.getParameter("i");
  int i = Integer.parseInt(par);
  Database.getPessoasList().remove(i);
  response.sendRedirect(request.getRequestURI());
}
if(request.getParameter("Alterar")!=null){    
 
}


      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("     <body>\n");
      out.write("        <h1>Fornecedores</h1>\n");
      out.write("          <fieldset>\n");
      out.write("            <legend>Incluir Fornecedor</legend>\n");
      out.write("            <form>\n");
      out.write("            Nome:<input type=\"text\" name='nome'/><br>\n");
      out.write("            Razão Social:<input type=\"text\" name='social'/><br>\n");
      out.write("            CNPJ:<input type=\"text\" name='cnpj'/><br>\n");
      out.write("            Email:<input type=\"text\" name='mail'/><br>\n");
      out.write("            Telefone:<input type=\"text\" name='tel'/><br>\n");
      out.write("            Endereço:<input type=\"text\" name='endereço'/><br>\n");
      out.write("           \n");
      out.write("            <input type=\"submit\" name='Incluir' value='Incluir'/>\n");
      out.write("            </form>\n");
      out.write("          </fieldset>\n");
      out.write("        \n");
      out.write("        <table class=\"table table-hover \"border='1'>\n");
      out.write("            <tr>\n");
      out.write("                <th>Nome</th>\n");
      out.write("                <th>Razão Social</th>  \n");
      out.write("                <th>CNPJ</th>  \n");
      out.write("                <th>Email</th>  \n");
      out.write("                <th>Telefone</th>  \n");
      out.write("                <th>Endereço</th>     \n");
      out.write("            </tr>  \n");
      out.write("            \n");
      out.write("            ");
 for(Pessoa p: Database.getPessoasList()){
      out.write("\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                ");
int i= Database.getPessoasList().indexOf(p);
      out.write("\n");
      out.write("               \n");
      out.write("                <td>");
      out.print(p.getNome());
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(p.getRazaosocial());
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(p.getCnpj());
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(p.getEmail());
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(p.getTelefone());
      out.write(" </td>\n");
      out.write("                <td>");
      out.print(p.getEndereço());
      out.write(" </td>\n");
      out.write("                <td>\n");
      out.write("                    <form>\n");
      out.write("                      <input type='hidden' name='i' value='");
      out.print( i );
      out.write("'/>\n");
      out.write("                      <input type='submit' name='Excluir' value='Excluir'/>\n");
      out.write("                      <input type='submit' name='Alterar' value='Alterar'/>\n");
      out.write("                    </form>\n");
      out.write("                    \n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("          \n");
      out.write("        </table>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
