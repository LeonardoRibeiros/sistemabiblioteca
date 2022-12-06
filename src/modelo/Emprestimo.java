package modelo;

public class Emprestimo {
private long Cpf;
private int idLivro;
private int anoEmprestimo;
private int anoDevolucao;

public long getCpf() {
	return Cpf;
}
public void setCpf(long cpf) {
	this.Cpf = cpf;
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
