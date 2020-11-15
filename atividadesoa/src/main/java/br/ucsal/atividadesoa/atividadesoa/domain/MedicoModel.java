package br.ucsal.atividadesoa.atividadesoa.domain;

public class MedicoModel {
	private String nome;
	private String cpf;
	private Especialidade especialidade;
	private String crm;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	
	
}
