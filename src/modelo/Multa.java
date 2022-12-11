package modelo;

import java.time.LocalDate;

public class Multa {
	private Cliente cliente;
	private String Cpf;
	private LocalDate data;
	private float ValorMulta;

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

	public float getValorMulta() {
		return ValorMulta;
	}

	public void setValorMulta(float valorMulta) {
		ValorMulta = valorMulta;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	

}
