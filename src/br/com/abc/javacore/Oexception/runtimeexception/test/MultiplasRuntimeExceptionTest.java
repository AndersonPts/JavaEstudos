package br.com.abc.javacore.Oexception.runtimeexception.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
	public static void main(String[] args) {
		
		// Multiplos catchs utilizado até o JAVA6
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
		// MultiCast => Apartir do JAVA7 é possível chamar vários exception em um só cast, separando-os por |
		try {
			talvezLanceException();
		} catch (Exception e) {// Pai das exception checked. Reconhece os parametros passado abaixo.
			// POr segurança é interessante passar os mesmos parametros tanto em catch qnto na assinatura do método
			
		}
	}
		private static void talvezLanceException() throws SQLException, FileNotFoundException{
		
	}

}
