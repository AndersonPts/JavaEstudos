package br.com.abc.javacore.Wio.test;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {

		File file = new File("D:\\JAVA\\Arquivo.txt");

		try { // Tratamento de Exce��o para verificar se o arquivo foi criado
			boolean newFile = file.createNewFile(); // M�todo para criar um
													// arquivo
			System.out.println(newFile);
			System.out.println(file.getPath());
			System.out.println(file.exists());
			System.out.println(file.isDirectory());
			System.out.println(file.lastModified());

		} catch (IOException e) { // Retorna a exce��o caso j� tenha sido criado
			String str = "Arquivo j� criado.";
			System.out.println(str);
			e.printStackTrace();
			e.getMessage();
		}

	}

}
