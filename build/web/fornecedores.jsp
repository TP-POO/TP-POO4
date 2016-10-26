

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
if(request.getParameter("Alterar2")!=null){ 
    String par = request.getParameter("i");
    int i = Integer.parseInt(par);
    Fornecedor p = new Fornecedor();
    p.setNome(request.getParameter("nome"));
    p.setRazaosocial(request.getParameter("social"));
    p.setCnpj(request.getParameter("cnpj"));
    p.setEmail(request.getParameter("mail"));
    p.setTelefone(request.getParameter("tel"));
    p.setEndereço(request.getParameter("endereco"));
    Database.getFornecedorList().set(i,p);
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
            <div class="form-group"  id="t">
            Nome:<input class="form-control" placeholder="Digite o nome." type="text" name='nome'/><br>
            Razão Social:<input class="form-control" placeholder="Digite a Razão Social." type="text" name='social'/><br>
            CNPJ:<input class="form-control" placeholder="Digite o número do CNPJ." type="text" name='cnpj'/><br>
            Email:<input class="form-control" placeholder="Digite o Email." type="text" name='mail'/><br>
            Telefone:<input class="form-control" placeholder="Digite o número de Telefone." type="text" name='tel'/><br>
            Endereço:<input class="form-control" placeholder="Digite o endereço." type="text" name='endereço'/><br>
             </div>
             
                 <center>  <input type="submit" name='Incluir' value='Incluir' class="btn btn-primary"/> </center>
                 </form>
            </div>
            </div>
                <br/>
        <table class="table table-hover caixa2 table-bordered"> 
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
                <%int i= Database.getFornecedorList().indexOf(p);
                if(request.getParameter("Alterar")==null){%>
               
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
                
                      <%}else{%>
                      <%if(Integer.parseInt(request.getParameter("i"))==Database.getFornecedorList().indexOf(p)){%>
                <form>
                    <td><input type="text" name="nome" class="form-control" value="<%=p.getNome()%>"></td>
                    <td><input type="text" name="social" class="form-control" value="<%=p.getRazaosocial()%>"> </td>
                    <td><input type="text" name="cnpj" class="form-control" value="<%=p.getCnpj()%>"> </td>
                    <td><input type="text" name="mail" class="form-control" value="<%=p.getEmail()%>"> </td>
                    <td><input type="text" name="tel" class="form-control" value="<%=p.getTelefone()%>"> </td>
                    <td><input type="text" name="endereco" class="form-control" value="<%=p.getEndereço()%>"> </td>
                    <td>
                    
                      <input type='hidden' name='i' value='<%= i %>'/>
                      <input type='submit' name='Excluir' value='Excluir'/>
                      <input type='submit' name='Alterar2' value='Mudar'/>
                    
                    </form>
               
                <%}else{%>
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
                <%}}%>
                </td> 
            </tr>
          <%}%> 
          
        </table>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
