package modelo;

import java.time.LocalDate;

public class Emprestimo {
	private Cliente cliente;
	private String NomeLivro;
	private LocalDate data;


	public String getNomeLivro() {
		return NomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		NomeLivro = nomeLivro;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

}