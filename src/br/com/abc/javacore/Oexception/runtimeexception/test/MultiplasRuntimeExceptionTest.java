package br.com.abc.javacore.Oexception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
	public static void main(String[] args) {
		
		// Multiplos catchs utilizado at� o JAVA6
		try {
			throw new IllegalArgumentException();
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Dentro do ArrayIndexOutOfBoundsException");
		}catch (IllegalArgumentException e) {
			// TODO: handle exception
			System.out.println("Dentro do IllegalArgumentException");
		}catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Dentro do ArithmeticException");
		}
		
		System.out.println("Final do Programa");
		// MultiCast => Apartir do JAVA7 � poss�vel chamar v�rios exception em um s� cast, separando-os por |
		try {
			talvezLanceException();
		} catch (Exception e) {// Pai das exception checked. Reconhece os parametros passado abaixo.
			// POr seguran�a � interessante passar os mesmos parametros tanto em catch qnto na assinatura do m�todo
			
		}
	}
		private static void talvezLanceException() throws SQLException, FileNotFoundException{
		
	}

}
