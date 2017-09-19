package br.com.abc.javacore.ZColecoes.classes;

public class Celular {
	private String nome;
	private String IMEI;	
	
	public Celular(String nome, String iMEI) {
		super();
		this.nome = nome;
		IMEI = iMEI;
	}
	
	//O método equals precisa ser reflexivo = x.equals(s) tem q ser true p tudo q for diferente de null
	//Simetrico para x e y diferente de null, se x.equals(x) == true logo y.equals(x) tem q ser true
		
	@Override
	public String toString() {
		return "Celular [nome=" + nome + ", IMEI=" + IMEI + "]";
	}



	//Verificar se o objeto é nulo..
	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if(this == obj) return true;
		if(this.getClass() != obj.getClass()) return false;
		Celular outroCelular = (Celular) obj;
		return IMEI != null ? IMEI.equals(outroCelular.getIMEI()) : false;
		
		
	}

	public String getNome() {
		return nome;
	}
	public String getIMEI() {
		return IMEI;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}
}