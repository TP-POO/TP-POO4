<%-- 
    Document   : Cliente
    Created on : 16/10/2016, 14:16:06
    Author     : Beto
--%>

<%@page import="br.com.fatecpg.db.DatabaseCliente"%>
<%@page import="br.com.fatecpg.db.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>

<%
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
    
   if(request.getParameter("Alterar2")!=null){
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
    %>
<html>
    <head>
        <title>Cliente</title>
        
    </head>
    <body>
         <h2 id="corb">Cadastrar Cliente</h2>
     <form>
      <div class="container" >
       <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8">
         <div class="form-group" id="t">    
       Nome:<input class="form-control" placeholder="Digite o nome." type="text" name="txtNome" value=""><br>
       CPF:<input class="form-control" placeholder="Digite o número do CPF." type="text" name="txtCpf" value=""><br>
       RG:<input class="form-control" placeholder="Digite o número do RG."type="text" name="txtRg" value=""><br>
       E-mail:<input class="form-control" placeholder="Digite o Email." type="text" name="txtEmail" value=""><br>
       Telefone:<input class="form-control" placeholder="Digite o número de Telefone." type="text" name="txtTel" value=""><br>
       Endereco:<input class="form-control" placeholder="Digite o endereço." type="text" name="txtEnd" value=""><br>
        </div>
            <center><input type="submit" name='Incluir' value='Incluir' class="btn btn-primary"/></center>
            </form>
       
      <!--<input type="submit" name="Alterar" value="Alterar" />
       <input type="submit" name="Excluir" value="Excluir" /> -->
       
        </div>
            </div>
        <br/>
           <table class="table table-hover table-bordered caixa2"> 
            <tr>
                <th>Nome</th>
                <th>CPF</th>
                <th>RG</th>
                <th>Email</th>
                <th>Telefone</th>
                <th>Endereco</th>                    
                
            </tr>
                <% for(Cliente c: DatabaseCliente.getClienteList()){ %>
                 <tr>
                    <%int i = DatabaseCliente.getClienteList().indexOf(c);
                    if(request.getParameter("Alterar")==null){%>
                <td><%= c.getNome() %></td>
                <td><%= c.getCpf() %></td>
                <td><%= c.getRg()%></td>
                <td><%= c.getEmail()%></td>
                <td><%= c.getTelefone()%></td>
                <td><%= c.getEndereco()%></td>
                <td>    
                    <form>
                      <input type='hidden' name='i' value='<%= i %>'/>
                      <input type='submit' name='Excluir' value='Excluir'/>
                      <input type='submit' name='Alterar' value='Alterar'/>
                    </form>
                
                <%}else{%>
                <form>
                <td><input class="form-control" type="text" name="txtNome" value="<%= c.getNome() %>"></td>
                <td><input class="form-control" type="text" name="txtCpf" value="<%= c.getCpf() %>"></td>
                <td><input class="form-control" type="text" name="txtRg" value="<%= c.getRg()%>"></td>
                <td><input class="form-control" type="text" name="txtEmail" value="<%= c.getEmail()%>"></td>
                <td><input class="form-control" type="text" name="txtTel" value="<%= c.getTelefone()%>"></td>
                <td><input class="form-control" type="text" name="txtEnd" value="<%= c.getEndereco()%>"></td>
                <td>    
                    
                      <input type='hidden' name='i' value='<%= i %>'/>
                      <input type='submit' name='Excluir' value='Excluir'/>
                      <input type='submit' name='Alterar2' value='Alterar'/>
                    </form>
                <%}%>
                
                    
                </td>
                
            </tr>
            <%}%>
          
        </table>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
