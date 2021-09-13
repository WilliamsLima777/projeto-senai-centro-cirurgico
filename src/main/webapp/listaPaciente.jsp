<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="org.senai.db.conexao"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

Connection cont = conexao.conectar();

if (cont != null){
	PreparedStatement pst = cont.prepareStatement("select * from paciente");
	ResultSet rs = pst.executeQuery();
%>
<table class="table table-hover">
			<thead>
				<tr>
					<th width="40%">Nome do Paciente</th>
					<th width="30%">Status</th>
					<th width="30%">Sala</th>
					<th width="10%">Início Prevísto</th>
					<th width="10%">Início da Cirurgia</th>
					<th width="10%">Fim da Cirurgia</th>
					<th width="10%">Saída Prevista</th>
				</tr>
				
				<% while(rs.next()){ %>
				<tr>
					<td>
					<% 
					
					out.print(rs.getString("nome"));						
					%>
					
					</td>
					<td>
					<% 
					
					out.print(rs.getString("status"));						
					%>
					
					</td>
					<td>
					<% 
					
					out.print(rs.getString("sala"));						
					%>
					
					</td>
					<td>
					<% 
					
					out.print(rs.getString("inicioPrevisto"));						
					%>
					
					</td>
					<td>
					<% 
					
					out.print(rs.getString("inicioCirurgia"));						
					%>
					
					</td>
					<td>
					<% 
					
					out.print(rs.getString("saidaCirurgia"));						
					%>
					
					</td>
					<td>
					<% 
					
					out.print(rs.getString("saidaPrevista"));						
					%>
					
					</td>
					
				
				</tr>
				<%} %>
			</thead>
			<tbody id="corpo-tabela" style="cursor: pointer;">

			</tbody>
		</table>
<%}
cont.close();
%>
</body>
</html>