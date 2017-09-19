package br.com.abc.javacore.ZZCjdbc.db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

import br.com.abc.javacore.ZZCjdbc.classes.Comprador;
import br.com.abc.javacore.ZZCjdbc.conn.ConexaoFactory;

public class CompradorDAO {
	public static void save(Comprador comprador) {
		String sql = "INSERT INTO `agencia`.`comprador` (`cpf`, `nome`) VALUES ( ?, ?)";

		try (Connection conn = (Connection) ConexaoFactory.getConexao();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, comprador.getCpf());
			ps.setString(2, comprador.getNome());
			ps.executeUpdate();
			System.out.println("Registro Inserido com sucesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void delete(Comprador comprador) {
		if (comprador == null || comprador.getId() == null) {
			System.out.println("Não foi possível excluir o registro");
			return;
		}
		String sql = "DELETE FROM `agencia`.`comprador` WHERE 'id'= ?";

		try (Connection conn = (Connection) ConexaoFactory.getConexao();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setInt(1, comprador.getId());
			ps.executeUpdate();
			System.out.println("Registro Excluído com sucesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void update(Comprador comprador) {
		if (comprador == null || comprador.getId() == null) {
			System.out.println("Não foi possível excluir o registro");
			return;
		}
		String sql = "UPDATE `agencia`.`comprador` SET `cpf`=?, `nome`=? WHERE 'id'=?";
		try (Connection conn = (Connection) ConexaoFactory.getConexao();
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, comprador.getCpf());
			ps.setString(2, comprador.getNome());
			ps.executeUpdate();
			System.out.println("Registro Inserido com sucesso");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<Comprador> selectaAll() {
		String sql = "SELECT id, nome, cpf FROM agencia.comprador";
		List<Comprador> compradorList = new ArrayList<>();
		try (Connection conn = (Connection) ConexaoFactory.getConexao();
				PreparedStatement ps = conn.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				compradorList.add(new Comprador(rs.getInt("id"), rs.getString("cpf"), rs.getString("nome")));

			}
			return compradorList;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
