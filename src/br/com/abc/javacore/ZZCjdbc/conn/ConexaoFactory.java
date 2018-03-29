package br.com.abc.javacore.ZZCjdbc.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;

public class ConexaoFactory {
	//Classe responsável pela conexão com o banco de Dados. PAcote Java.sql
	//Java.sql = Connection, Statement, Result => São interfaces para trabalhar com BD.
	//Conexão => DriverManager
	//Baixar o driver conector no site do mySql => https://dev.mysql.com/downloads/connector/j/
	
	public static Connection getConexao(){
					//Drive BD      Local    Porta Banco
		String url = "jdbc:mysql://localhost:3306/biblioteca?useSSL=false";// No final adicione ?useSSL=false para evitar exceções.
		String user = "root";
		String password = "root";
		
		
		try {
			return DriverManager.getConnection(url, user, password);
			//System.out.println(connection);
			//return connection;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static void close(Connection connection){
		try {
			if(connection!=null)
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void close(Connection connection, Statement stmt){
		try {
			if(stmt!=null)
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}	
