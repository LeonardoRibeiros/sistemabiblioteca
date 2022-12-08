package controle;

import java.util.ArrayList;

import modelo.Livro;

public class ControleAcervo{
	private static ArrayList<Livro> tabelaAcervo;
	private static ControleAcervo instancia;

	public static ControleAcervo getInstancia() {

		if (instancia == null) {
			instancia = new ControleAcervo();
			tabelaAcervo = new ArrayList<>();
		}

		return instancia;
	}

	private ControleAcervo() {
	}

	public boolean inserir(Livro p) {
		if (p != null) {
			this.tabelaAcervo.add(p);
			return true;
		}
		return false;
	}

	public boolean alterar(Livro p, String nomeLivro) {
		for (Livro acervo : tabelaAcervo){
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
		for (Livro acervo : tabelaAcervo){
			if (acervo.getNomeLivro() == nomeLivro) {
				tabelaAcervo.remove(acervo);
				return true;
			}
		}

		return false;
	}

	public ArrayList<Livro> listarAcervo() {
		return tabelaAcervo;
	}
}