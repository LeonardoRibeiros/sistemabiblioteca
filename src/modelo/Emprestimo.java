package modelo;

import java.time.LocalDate;

public class Emprestimo {
	private String cpfcliente;
	private String cpffuncionario;
	private LocalDate dataemp;
	private String NomeLivro;
	private LocalDate datadev;


	public String getNomeLivro() {
		return NomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		NomeLivro = nomeLivro;
	}


	public LocalDate getDataemp() {
		return dataemp;
	}

	public void setDataemp(LocalDate dataemp) {
		this.dataemp = dataemp;
	}

	public LocalDate getDatadev() {
		return datadev;
	}

	public void setDatadev(LocalDate datadev) {
		this.datadev = datadev;
	}

	public String getCpffuncionario() {
		return cpffuncionario;
	}

	public void setCpffuncionario(String cpffuncionario) {
		this.cpffuncionario = cpffuncionario;
	}

	public String getCpfcliente() {
		return cpfcliente;
	}

	public void setCpfcliente(String cpfcliente) {
		this.cpfcliente = cpfcliente;
	}

	

}