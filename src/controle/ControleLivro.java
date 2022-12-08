package controle;

import java.util.ArrayList;

import modelo.ILivroDAO;
import modelo.Livro;

public class ControleLivro implements ILivroDAO{
	private static ArrayList<Livro> tabelaLivro;
	private static ControleLivro instancia;

	public static ControleLivro getInstancia() {

		if (instancia == null) {
			instancia = new ControleLivro();
			tabelaLivro = new ArrayList<>();
		}

		return instancia;
	}

	private ControleLivro() {
	}

	public boolean inserir(Livro p) {
		if (p != null) {
			this.tabelaLivro.add(p);
			return true;
		}
		return false;
	}

	public boolean alterar(Livro p, String nomeLivro) {
		for (Livro acervo : tabelaLivro){
			if (acervo.getNomeLivro() == nomeLivro) {
				acervo.setNomeLivro(p.getNomeLivro());
				acervo.setAutor(p.getAutor());
				acervo.setGenero(p.getGenero());
				acervo.setEstante(p.getAutor());
				acervo.setnPaginas(p.getnPaginas());
				
				return true;
			}
		}
		return false;
	}

	public boolean deletar(Livro p, String nomeLivro) {
		for (Livro acervo : tabelaLivro){
			if (acervo.getNomeLivro() == nomeLivro) {
				tabelaLivro.remove(acervo);
				return true;
			}
		}

		return false;
	}

	public ArrayList<Livro> listarLivros() {
		return tabelaLivro;
	}

	
	
}