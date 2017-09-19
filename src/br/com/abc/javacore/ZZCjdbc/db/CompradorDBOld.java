package br.com.abc.javacore.ZZCjdbc.db;

import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import br.com.abc.javacore.ZZCjdbc.classes.Comprador;
import br.com.abc.javacore.ZZCjdbc.conn.ConexaoFactory;

public class CompradorDBOld {
	private static final boolean Comprador = false;

	public static void save(Comprador comprador){
		String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('"+comprador.getCpf()+"', '"+comprador.getNome()+"');";
		Connection conn = (Connection) ConexaoFactory.getConexao();
		try {
			Statement stmt = (Statement) conn.createStatement();
			System.out.println(stmt.executeUpdate(sql));
			stmt.close();
			ConexaoFactory.close(conn, stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public static void update(Comprador comprador){
		if(Comprador){
			System.out.println("Não foi possível atualizar o registro");
		}
		String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ('"+comprador.getCpf()+"', '"+comprador.getNome()+"');";
		Connection conn = (Connection) ConexaoFactory.getConexao();
		try {
			Statement stmt = (Statement) conn.createStatement();
			System.out.println(stmt.executeUpdate(sql));
			stmt.close();
			ConexaoFactory.close(conn, stmt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
