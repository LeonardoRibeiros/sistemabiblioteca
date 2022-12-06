package modelo;

public class Acervo {
private long Cpf;
private String nomeLivro;
private String autor;
private int nPaginas;

public long getCpf() {
	return Cpf;
}
public void setCpf(long cpf) {
	this.Cpf = cpf;
}

public String getNomeLivro() {
	return nomeLivro;
}
public void setNomeLivro(String nomeLivro) {
	this.nomeLivro = nomeLivro;
}
public String getAutor() {
	return autor;
}
public void setAutor(String autor) {
	this.autor = autor;
}
public int getnPaginas() {
	return nPaginas;
}
public void setnPaginas(int nPaginas) {
	this.nPaginas = nPaginas;
}

}
