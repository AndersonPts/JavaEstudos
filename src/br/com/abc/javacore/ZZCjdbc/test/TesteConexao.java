package br.com.abc.javacore.ZZCjdbc.test;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.abc.javacore.ZZCjdbc.classes.Comprador;
import br.com.abc.javacore.ZZCjdbc.conn.ConexaoFactory;

public class TesteConexao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ConexaoFactory conn = new ConexaoFactory();
		conn.getConexao();*/
		Comprador comprador = new Comprador("123.456.789-10", "Gerônimo Rivend");
		CompradorDB compradorDB = new Comprador();
		compradorDB.save(comprador);		
	}

}
