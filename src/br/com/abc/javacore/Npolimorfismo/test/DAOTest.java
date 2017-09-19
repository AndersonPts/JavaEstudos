package br.com.abc.javacore.Npolimorfismo.test;

import java.util.ArrayList;
import java.util.List;

import br.com.abc.javacore.Npolimorfismo.classes.ArquivoDAOImpl;
//import br.com.abc.javacore.Npolimorfismo.classes.DatabaseDAOImpl;
import br.com.abc.javacore.Npolimorfismo.classes.GenericDAO;

public class DAOTest {
	public static void main(String[] args) {
		// Polimorfismo utilizando interfaces
		//GenericDAO => Pai   -------    ArquivoDAOImpl ou DatabaseDAOImpl => Filhas
		GenericDAO arquivoDAO = new ArquivoDAOImpl();
		arquivoDAO.save();
		List<String> lista = new ArrayList<>();
		lista.add("nome1");
		lista.add("nome2");
		lista.add("nome3");
		lista.add("nome4");
		for(String nome : lista){
			System.out.println(nome);
		}
	}

}
