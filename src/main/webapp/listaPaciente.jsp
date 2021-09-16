<%@page import="org.senai.model.Paciente"%>
<%@page import="java.util.List"%>
<%@page import="org.senai.dao.PacienteDao"%>
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
<title>Lista Paciente</title>
</head>
<body>
<%

PacienteDao objDao = new PacienteDao();
List<Paciente> ls = objDao.listaPaciente();

if (ls.size() > 0){
	
%>
<table class="table table-hover">
			<thead>
				<tr>
					<th width="10%">ID</th>
					<th width="40%">Nome do Paciente</th>
					<th width="30%">Status</th>
					<th width="30%">Sala</th>
					<th width="10%">Início Prevísto</th>
					<th width="10%">Início da Cirurgia</th>
					<th width="10%">Fim da Cirurgia</th>
					<th width="10%">Saída Prevista</th>
					
				</tr>
				
				<% for(Paciente ps : ls){ %>
				<tr>
				<td>
					<%=
					
					ps.getId() 						
					%>
					
					</td>
					<td>
					<%=
					
					ps.getNome() 						
					%>
					
					</td>
					<td>
					<%=
					
					ps.getStatus()						
					%>
					
					</td>
					<td>
					<%= 
					
					ps.getLocal()						
					%>
					
					</td>
					<td>
					<%=
					
					ps.getInicioPrevisto()						
					%>
					
					</td>
					<td>
					<%= 
					
					ps.getInicioCirurgia()						
					%>
					
					</td>
					<td>
					<%=
					
					ps.getSaidaCirurgia()						
					%>
					
					</td>
					<td>
					<%=
					
					ps.getSaidaPrevisto()						
					%>
					
					</td>
					<td><a href =gerenciarPaciente.jsp?id=<%=ps.getId()%>>Editar</a></td>
					<td><a href =cadastroServlet?acao=apagar&id=<%=ps.getId()%>>Apagar</a></td>
					
				
				</tr>
				<%} %>
			</thead>
			<tbody id="corpo-tabela" style="cursor: pointer;">

			</tbody>
		</table>
<%}

%>
</body>
</html>