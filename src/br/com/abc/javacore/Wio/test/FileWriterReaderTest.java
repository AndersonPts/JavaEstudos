package br.com.abc.javacore.Wio.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// Código para Leitura e escrita de dados em um arquivo.
public class FileWriterReaderTest {

	public static void main(String[] args) {
		
		File file = new File("D:\\JAVA\\Arquivo2.txt");
		
		// Criação de um tratamento de exceção
		try (FileWriter fw = new FileWriter(file, true); FileReader fr = new FileReader(file)) {
			
			fw.write("Escrevendo uma mensagem no arquivo\n e pulando linha 4."); //Método que escreve no arquivo
			fw.flush(); //Envia toda as informações que estiver n túnel para o arquivo.
			//fw.close(); //Fechar a escrita
						
			char[] in = new char[500]; //Cria um array de caracteres
			int size = fr.read(in); //Saber quantidade de letras no arquivo 
			System.out.println("Quantidade de letras no arquivo: "+size);
			for(char c: in){
				System.out.print(c);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
