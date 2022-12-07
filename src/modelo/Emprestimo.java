package modelo;

public class Emprestimo {
private String CpfCliente;
private String Diaempre;
private String Diadevo;
private String Mesempre;
private String Mesdevo;
private String NomeLivro;
private int anoEmprestimo;
private int anoDevolucao;


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
public String getCpfCliente() {
	return CpfCliente;
}
public void setCpfCliente(String cpfCliente) {
	CpfCliente = cpfCliente;
}
public String getNomeLivro() {
	return NomeLivro;
}
public void setNomeLivro(String nomeLivro) {
	NomeLivro = nomeLivro;
}
public String getMesdevo() {
	return Mesdevo;
}
public void setMesdevo(String mesdevo) {
	Mesdevo = mesdevo;
}
public String getMesempre() {
	return Mesempre;
}
public void setMesempre(String mesempre) {
	Mesempre = mesempre;
}
public String getDiadevo() {
	return Diadevo;
}
public void setDiadevo(String diadevo) {
	Diadevo = diadevo;
}
public String getDiaempre() {
	return Diaempre;
}
public void setDiaempre(String diaempre) {
	Diaempre = diaempre;
}

}