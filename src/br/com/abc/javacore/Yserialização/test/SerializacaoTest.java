package br.com.abc.javacore.Yserializa��o.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import br.com.abc.javacore.Yserializa��o.classes.Aluno;

public class SerializacaoTest {

	public static void main(String[] args) {
		gravadorObjeto();
		
	}
	
	//Criar e salvar um aluno em um arquivo
	private static void gravadorObjeto(){
		Aluno aluno = new Aluno(1L, "Anderson Alves", "123456");
		//Cria uma exce��o
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("aluno.ser"))){
			
			oos.writeObject(aluno);
			System.out.println(aluno);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
