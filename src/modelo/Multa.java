package modelo;

public class Multa {
private String CpfCliente;
private String Dia;
private String Mes;
private int anoDevolucao;
private float ValorMulta;


public int getAnoDevolucao() {
	return anoDevolucao;
}
public void setAnoDevolucao(int anoDevolucao) {
	this.anoDevolucao = anoDevolucao;
}
public float getValorMulta() {
	return ValorMulta;
}
public void setValorMulta(float valorMulta) {
	this.ValorMulta = valorMulta;
}
public String getCpfCliente() {
	return CpfCliente;
}
public void setCpfCliente(String cpfCliente) {
	CpfCliente = cpfCliente;
}
public String getDia() {
	return Dia;
}
public void setDia(String dia) {
	Dia = dia;
}
public String getMes() {
	return Mes;
}
public void setMes(String mes) {
	Mes = mes;
}
	


}
