package br.com.abc.javacore.Oexception.customerexceptions;

// Criar a própria excecçao.

public class LoginInvalidoException extends Exception{

	public LoginInvalidoException() {
		super("Usuário ou senha inválidos");
		// TODO Auto-generated constructor stub
	}

	}
