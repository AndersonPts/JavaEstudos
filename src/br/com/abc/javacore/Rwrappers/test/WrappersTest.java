package br.com.abc.javacore.Rwrappers.test;

// CLASSES WRAPPER -> Classes que encapsulam esses tipos primitivos.
//Basta colocar a primeira letra do nome do tipo em maiúscula. 

public class WrappersTest {

	public static void main(String[] args) {
		/* TIPOS PRIMITIVOS DE JAVA
		 * TOTAL DE 8 TIPOS
		 * DO MENOR PARA O MAIOR...		 * 
		 */
		byte bytePrimitivo = 1;
		short shortPrimitivo = 1;
		int intPrimitivo = 10;
		long logPrimitivo = 10;
		float floatPrimitivo = 10;
		double doublePrimitivo = 10;
		char charPrimitivo = 'A';
		boolean booleanPrimitivo = true;
		
		// Em Wripper é necessário realizar o cast
		Byte byteWrapper = 1;
		Short shortWrapper = 1;
		Integer integerWrapper = 10;
		// Em Wripper é necessário realizar o cast em Long, Float e Double
		Long longWrapper = 10L;
		Float floatWrapper = 10F;
		Double doubleWrapper = 10D;
		Character characterWrapper = 'A';
		Boolean booleanWrapper = true;

	}

}
