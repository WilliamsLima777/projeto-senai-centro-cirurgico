package org.senai.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class conexao {

public static Connection conectar() /*throws Exception*/ {
	
	
	try{
		Class.forName("org.postgresql.Driver");
	
	String url = "jdbc:postgresql://chunee.db.elephantsql.com:5432/xeosxkjb";
	String usuarioDataBase = "xeosxkjb";
	String senhaDataBase = "0Yck0ucYfdI9yEMjW2aLYtCOmBiVFwaE";
    return DriverManager.getConnection(url, usuarioDataBase, senhaDataBase);
} catch (Exception e ) {
	
	System.out.println("Erro de conexão!!");
	
	e.printStackTrace();
	return null;
			
	
}
	
}
}