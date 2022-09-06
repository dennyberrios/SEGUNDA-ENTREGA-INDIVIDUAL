package model;

public class Cliente {
	private long id;
	private String cpf;
	private String nome;
	private String rua;
	private String bairro;
	private String cep;
	private String cidade;
	private String estado;
	private String email;
	private String telefone;

	
	

public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

public String toString() {
    return 
            "Cpf: " + cpf + '\'' +
            ", Nome :  '" + nome + '\'' +
            ", Rua: " + rua + '\'' +
            ", Bairro: '" + bairro + '\'' +
            ", CEP: " + cep + '\'' +
            ", Cidade: " + cidade + '\'' +
            ", Estado:" + estado + '\'' +
            ", Email:" + email + '\'' +
            ", Numero Telefone: " + telefone
            ;
}

}