package modelo;

public abstract class Pessoa {

	private String nome;
	private Long cpf;
	private String tel;
	private String cep;
	private String email;
	private int nCasa;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getCpf() {
		return cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public int getnCasa() {
		return nCasa;
	}

	public void setnCasa(int nCasa) {
		this.nCasa = nCasa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
