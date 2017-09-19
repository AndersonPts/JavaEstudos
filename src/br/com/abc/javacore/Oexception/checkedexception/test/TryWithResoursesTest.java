package br.com.abc.javacore.Oexception.checkedexception.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.FileSystemNotFoundException;

import br.com.abc.javacore.Oexception.classes.Leitor1;
import br.com.abc.javacore.Oexception.classes.Leitor2;

public class TryWithResoursesTest {
	public static void main(String[] args) throws Exception {
		lerArquivo();
		
	}
	
	public static void lerArquivoOld() throws FileNotFoundException{
		Reader reader = null;
		try {
			reader = new BufferedReader(new FileReader("text.txt"));
		} catch (FileSystemNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(reader != null){
					reader.close();
				}
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	
	public static void lerArquivo() throws Exception{		
		try(Leitor1 leitor1 = new Leitor1();
			Leitor2 leitor2 = new Leitor2()) {			
		} catch (FileSystemNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
