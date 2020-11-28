package model;

public class modelCandidato {
	
	private String nome;
	private String cpf;
	private String cargo;
	
	public modelCandidato() {}

	public modelCandidato(String nome, String cpf, String cargo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.cargo = cargo;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getCargo() {
		return cargo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
}