package modelo;

public class Emprestimo {
private int idCliente;
private int idLivro;
private int anoEmprestimo;
private int anoDevolucao;

public int getIdCliente() {
	return idCliente;
}
public void setIdCliente(int idCliente) {
	this.idCliente = idCliente;
}
public int getIdLivro() {
	return idLivro;
}
public void setIdLivro(int idLivro) {
	this.idLivro = idLivro;
}
public int getAnoEmprestimo() {
	return anoEmprestimo;
}
public void setAnoEmprestimo(int anoEmprestimo) {
	this.anoEmprestimo = anoEmprestimo;
}
public int getAnoDevolucao() {
	return anoDevolucao;
}
public void setAnoDevolucao(int anoDevolucao) {
	this.anoDevolucao = anoDevolucao;
}

}
