package br.com.abc.javacore.Yserialização.classes;

import java.io.Serializable;

public class Aluno implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Serialização -> Pegar um objeto e passar ele por um canal de dados (Fazer um Stream)
	private Long id;
	private String name;
	private transient String password;// Não pode ser serializado
	private static String nomeEscola = "DevDojo";	
	
	public Aluno(Long id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Aluno [id=" + id +
				", name=" + name +
				", password=" + password +
				", nomeEscola=" + nomeEscola +
				"]";
	}
	
	public Long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public static String getNomeEscola() {
		return nomeEscola;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static void setNomeEscola(String nomeEscola) {
		Aluno.nomeEscola = nomeEscola;
	}
	

}
