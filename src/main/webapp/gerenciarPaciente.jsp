<%@page import="org.senai.model.Paciente"%>
<%@page import="org.senai.dao.PacienteDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gerenciar Paciente</title>
</head>


<body>
<%
Paciente p = new Paciente();
try {

int id = Integer.parseInt(request.getParameter("id"));

PacienteDao dao = new PacienteDao();
p = dao.getPaciente(id);

}catch(Exception e) {
	
	
	
}

//out.print(id);

%>
    
    <div class="container">
		<br>
		<h2>Gerenciar Painel dos Paciente no Centro Cirúrgico</h2>
		<form name="form-paciente" id="form-paciente" action ="cadastroServlet" method ="post"> 
			<input type="hidden" id="id"  value ="<%=p.getId()%>" name="id">
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="nome">Nome Paciente:</label> <input type="text"
						class="form-control" id="nome" placeholder="Nome do Paciente"
						name="nome" value = <%=p.getNome() %>>
				</div>
				<div class="form-group col-md-3">
					<label for="nome">Status:</label> <select name="status" id="status"
						class="form-control" >
						<option value="operatorio">Pré-Operatório</option>
						<option value="sala-cirurgica">Em sala cirúrgica</option>
						<option value="recuperacao">Em recuperação</option>
						<option value="transferido">Transferído</option>
					</select>
				</div>
				<div class="form-group col-md-3">
					<label for="local">Local:</label> <input type="text"
						class="form-control" id="local" placeholder="Sala/Quarto"
						name="local"value = <%=p.getLocal() %>>
				</div>
			</div>
			<div class="form-row">
				<div class="form-group  col-md-3">
					<label for="inicio-previsto">Início Prevísto:</label> <input
						type="time" class="form-control" id="inicio-previsto"
						name="inicio-previsto" size="20"value = <%=p.getInicioPrevisto() %>>
				</div>
				<div class="form-group  col-md-3">
					<label for="inicio-cirurgia">Início Cirurgia:</label> <input
						type="time" class="form-control" id="inicio-cirurgia"
						name="inicio-cirurgia" size="20"value = <%=p.getInicioCirurgia() %>>
				</div>
				<div class="form-group  col-md-3">
					<label for="fim-cirurgia">Fim da Cirurgia:</label> <input
						type="time" class="form-control" id="fim-cirurgia"
						name="fim-cirurgia" size="20" value = <%=p.getSaidaCirurgia() %>>
				</div>
				<div class="form-group  col-md-3">
					<label for="saida-previsto">Saída Prevísto:</label> <input
						type="time" class="form-control" id="saida-previsto"
						name="saida-prevista" size="20" value = <%=p.getSaidaPrevisto() %>>
				</div>
			</div>
			<button type="button" class="btn btn-secondary" onclick="limpaForm()">Novo</button>
			<button type="submit" class="btn btn-primary" >Gravar</button>
			<button type="button" class="btn btn-danger" onclick="apagar()">Apagar</button>
		</form>
		
		<script type="text/javascript">
		
		document.getElementById("status").value = "<%=p.getStatus()%>";
		
		</script>

		<br>
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
			</thead>
			<tbody id="corpo-tabela" style="cursor: pointer;">

			</tbody>
		</table>

		<script type="text/javascript">
			var tabela = localStorage.getItem('corpo-tabela');
			document.getElementById("corpo-tabela").innerHTML = tabela;
		</script>

	</div>

</body>
</html>