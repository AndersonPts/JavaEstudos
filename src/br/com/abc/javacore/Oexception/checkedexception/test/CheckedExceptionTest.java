package br.com.abc.javacore.Oexception.checkedexception.test;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionTest {
	public static void main(String[] args) throws IOException {
		criarArquivo();	
		abrirArquivo();
	}
	
	public static void criarArquivo() throws IOException{
		File file = new File("Teste.txt");
		try {
			System.out.println("Arquivo criado? : "+file.createNewFile());
			System.out.println("Arquivo criado com sucesso.");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();// Retorna o erro ao sistema
			throw e;
		}
	}

	public static void abrirArquivo(){
		try {
			System.out.println("Abrindo um arquivo.");
			System.out.println("Executando a leitura do arquivo.");
			System.out.println("Escrevendo no arquivo.");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			System.out.println("Fechar o arquivo.");
		}
	}
}
