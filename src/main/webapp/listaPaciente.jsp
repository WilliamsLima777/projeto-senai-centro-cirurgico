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
					<th width="10%">In�cio Prev�sto</th>
					<th width="10%">In�cio da Cirurgia</th>
					<th width="10%">Fim da Cirurgia</th>
					<th width="10%">Sa�da Prevista</th>
					
				</tr>
				
				<% for(Paciente p : ls){ %>
				<tr>
				<td>
					<%=
					
					p.getId() 						
					%>
					
					</td>
					<td>
					<%=
					
					p.getNome() 						
					%>
					
					</td>
					<td>
					<%=
					
					p.getStatus()						
					%>
					
					</td>
					<td>
					<%= 
					
					p.getLocal()						
					%>
					
					</td>
					<td>
					<%=
					
					p.getInicioPrevisto()						
					%>
					
					</td>
					<td>
					<%= 
					
					p.getInicioCirurgia()						
					%>
					
					</td>
					<td>
					<%=
					
					p.getSaidaCirurgia()						
					%>
					
					</td>
					<td>
					<%=
					
					p.getSaidaPrevisto()						
					%>
					
					</td>
					<td><a href =gerenciarPaciente.jsp?id=<%=p.getId()%>>Editar</a></td>
					
				
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