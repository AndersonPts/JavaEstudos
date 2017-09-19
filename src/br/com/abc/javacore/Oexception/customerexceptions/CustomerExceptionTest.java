package br.com.abc.javacore.Oexception.customerexceptions;

public class CustomerExceptionTest {
	public static void main(String[] args) {
		try {
			logar();
		} catch (LoginInvalidoException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	private static void logar() throws LoginInvalidoException{
		String usuarioBd = "Goku";
		String senhaBd = "111";
		String usuarioDigitado = "Goku";
		String senhaDigitada = "123";
		if(!usuarioBd.equals(usuarioDigitado) || !senhaBd.equals(senhaDigitada)){
			throw new LoginInvalidoException();
		}else{
			System.out.println("Logado");
		}
		
	}

}
