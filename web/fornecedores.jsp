

<%@page import="br.com.fatecpg.db.Database"%>
<%@page import="br.com.fatecpg.db.Fornecedor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>


<!DOCTYPE html>
<%
if(request.getParameter("Incluir")!=null){    
    Fornecedor p = new Fornecedor();
    p.setNome(request.getParameter("nome"));
    p.setRazaosocial(request.getParameter("social"));
    p.setCnpj(request.getParameter("cnpj"));
    p.setEmail(request.getParameter("mail"));
    p.setTelefone(request.getParameter("tel"));
    p.setEndereço(request.getParameter("endereço"));
    Database.getFornecedorList().add(p);
    response.sendRedirect(request.getRequestURI());  
}
if(request.getParameter("Excluir")!=null){  
    String par = request.getParameter("i");
  int i = Integer.parseInt(par);
  Database.getFornecedorList().remove(i);
  response.sendRedirect(request.getRequestURI());
}
if(request.getParameter("Alterar")!=null){ 
    
}
%>
<html>
    <head>
 
    <title>Fornecedores</title>
   </head>
     <body>
        <h2 id="corb">Cadastrar Fornecedor</h2>
         
            <form>
            <div class="container" >
            <div class="row">
                <div class="col-md-2"></div>
             <div class="col-md-8">
            <div class="form-group">
            Nome:<input class="form-control" type="text" name='nome'/><br>
            Razão Social:<input class="form-control" type="text" name='social'/><br>
            CNPJ:<input class="form-control" type="text" name='cnpj'/><br>
            Email:<input class="form-control" type="text" name='mail'/><br>
            Telefone:<input class="form-control" type="text" name='tel'/><br>
            Endereço:<input class="form-control" type="text" name='endereço'/><br>
             </div>
             
            <input type="submit" name='Incluir' value='Incluir'/>
            </form>
            </div>
            </div>
        
        <table class="table table-hover"> 
            <tr>
                <th>Nome</th>
                <th>Razão Social</th>  
                <th>CNPJ</th>  
                <th>Email</th>  
                <th>Telefone</th>  
                <th>Endereço</th>     
            </tr>  
            
            <% for(Fornecedor p: Database.getFornecedorList()){%>
            
            <tr>
                <%int i= Database.getFornecedorList().indexOf(p);%>
               
                <td><%=p.getNome()%> </td>
                <td><%=p.getRazaosocial()%> </td>
                <td><%=p.getCnpj()%> </td>
                <td><%=p.getEmail()%> </td>
                <td><%=p.getTelefone()%> </td>
                <td><%=p.getEndereço()%> </td>
                <td>
                    <form>
                      <input type='hidden' name='i' value='<%= i %>'/>
                      <input type='submit' name='Excluir' value='Excluir'/>
                      <input type='submit' name='Alterar' value='Alterar'/>
                    </form>
                    
                </td>
                 
            </tr>
          <%}%> 
          
        </table>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
