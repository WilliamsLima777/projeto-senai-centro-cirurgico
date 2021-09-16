<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>



<style>

fieldset {

width: 70%;
margin: auto;
border-color: aqua;


}



label  {

    display: block;
}
input.button{
    font-weight:900;
    display: block;
    margin-top: 5px;
    padding: 5px 10px;
    border-radius: 5px;
    font-family: 'Courier New', Courier, monospace;
    background-color: rgba(255, 0, 0, 0.418);
}

input.button:hover{

background-color: rgb(78, 38, 38);
color: white;
cursor: pointer;


}





</style>


</head>
<body>

<fieldset> 

<form action = "loginservlet" method = "post">
<legend> <b>Área de Acesso:</b></legend>       
<label for="login">Login:</label>
<input type="text" name="login" id="login"/>
<label for="senha">Senha:</label>
<input type="password"  name = "senha" id="senha">
<input type="submit" value="Acessar" class="button"> 
</form>


</fieldset>




</body>



</body>
</html>